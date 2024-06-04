package com.example.app.javatechie.spring.auth.example.Justificatif;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDTextField;
import org.apache.pdfbox.text.PDFTextStripper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.example.app.javatechie.spring.auth.example.pdf.MyServicepdf;
import com.example.app.javatechie.spring.auth.example.pdf.Pdf;
import com.example.app.javatechie.spring.auth.example.pdf.pdfRepository;
import com.example.app.javatechie.spring.auth.example.salaries.MyServiceSalaries;
import com.example.app.javatechie.spring.auth.example.salaries.Salaries;

@RestController
@RequestMapping("/api/v1/test/justificatif")
@CrossOrigin(origins = "*") 
public class JustifController {

    @Autowired
    private JustificatifService justificatifService;
    @Autowired
    private MyServiceSalaries salariesService;
    @Autowired
    private  MyServicepdf myservicepdf;
    
    
    
	    //upload file
	    @PostMapping("/upload")
	    public ResponseEntity<String> uploadJustificatif(@RequestParam("file") MultipartFile file,
	                                                                                                
	                                                    @RequestParam("SalariesId") int SalariesId)
	         throws IOException {
	
	        // Traitez le fichier individuellement (enregistrement en base de données, compression, etc.)
	        String response = justificatifService.uploadFile(file, SalariesId);
	        
	        return ResponseEntity.ok("{\"message\": \"File uploaded successfully\"}");
	    	}
    
    
	    //download file
	    @GetMapping("/download/{id}")
	    public ResponseEntity<byte[]> downloadJustificatif(@PathVariable long id) {
	        try {
	            byte[] image = justificatifService.downloadFile(id);
	            return ResponseEntity.ok().contentType(MediaType.APPLICATION_PDF).body(image);
	        } catch (Exception e) {
	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new byte[0]);
	        }
	    }

	    
	    
	    @GetMapping("/get/{id}")
	    public ResponseEntity<Justificatif> getJustificatif(@PathVariable long id) {
	        Optional<Justificatif> justificatif = justificatifService.getJustificatifById(id);
	        return justificatif.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	    }

	    @DeleteMapping("/delete/{id}")
	    public ResponseEntity<Void> deleteJustificatif(@PathVariable long id) {
	        try {
	            justificatifService.deleteJustificatifById(id);
	            return ResponseEntity.noContent().build();
	        } catch (Exception e) {
	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	        }
	    }
	    
	    
	    
	    
	    
	    @PostMapping("/fill-pdf")
	    public ResponseEntity<Pdf> fillPdfAndDownload(@RequestParam("file") MultipartFile file) {
	        try (PDDocument document = PDDocument.load(file.getInputStream())) {
	            String pdfText = new PDFTextStripper().getText(document);
	            if (pdfText.isEmpty()) {
	                return ResponseEntity.badRequest().body(null);
	            }

	            Pdf pdf = parseAndFillPdf(pdfText);
	            Pdf savedPdf = myservicepdf.save(pdf);
	            return ResponseEntity.ok().body(savedPdf);
	        } catch (IOException e) {
	            return ResponseEntity.status(500).body(null);
	        }
	    }

	    private Pdf parseAndFillPdf(String pdfText) {
	    	Pdf pdf = new Pdf();

	        // Manually specify the line to extract data from
	        String[] lines = pdfText.split("\\r?\\n");

	        // Example of manually specifying a line for extraction
	        String matriculeLine = lines[27]; // Adjust the index if needed
	        pdf.setMatricule(matriculeLine);	       
	        
	        String numSSLine = lines[28]; // Adjust the index if needed
	        pdf.setNumSS(numSSLine);

	        String chpatronialesLine = lines[82]; // Adjust the index if needed
	        pdf.setChpatroniales(chpatronialesLine);
        

	        String nomLine = lines[36]; // Adjust the index if needed
	        pdf.setNom(nomLine);
        

	        String emploiLine = lines[29]; // Adjust the index if needed
	        pdf.setEmploi(emploiLine);
	        
	        String statutLine = lines[30]; // Adjust the index if needed
	        pdf.setStatut(statutLine);
	        
	        
	        String positionLine = lines[31]; // Adjust the index if needed
	        pdf.setPosition(positionLine);
        
	        String coefficientLine = lines[32]; // Adjust the index if needed
	        pdf.setCoefficient(coefficientLine);
        
	        
	        
	        String periodeLine = lines[11]; // Adjust the index if needed
	        String subString3 = periodeLine.substring(10, 22); // La position de début est incluse et la position de fin est exclusive
	        pdf.setPeriode(subString3);
	        
	        String salairebrutLine = lines[40]; // Ajuster l'index si nécessaire
	        String subString5 = salairebrutLine.substring(13, 21); // La position de début est incluse et la position de fin est exclusive
	        pdf.setSalairebrut(subString5);
	        
	        String totaldescotisationsetcontributionsLine = lines[63]; // Ajuster l'index si nécessaire
	        String subString = totaldescotisationsetcontributionsLine.substring(39, 47); // La position de début est incluse et la position de fin est exclusive
	        pdf.setTotaldescotisationsetcontributions(subString);
	        
	        String netapayeravantimpotsurlerevenuLine = lines[67]; // Adjust the index if needed
	        String subString2 = netapayeravantimpotsurlerevenuLine.substring(38, 46); // La position de début est incluse et la position de fin est exclusive
	        pdf.setNetapayeravantimpôtsurlerevenu(subString2);
	        // Add other fields similarly, specifying the line and label as needed

	        
	        String netpayeLine = lines[94]; // Adjust the index if needed
	        String subString4 = netpayeLine.substring(11, 20); // La position de début est incluse et la position de fin est exclusive
	        pdf.setNetpaye(subString4);
	        return pdf;
	    }

	    /**
	     * Extracts the data from the specified line based on the given label.
	     * For this example, extracting "00057" from "ELZEI##BULLETIN##02-2024##00057##KOUKI##Mahrane##82321567800025".
	     * 
	     * @param line  the line of text from which to extract data
	     * @param label the label to search for in the line
	     * @return the extracted data after the label, or null if the label is not found
	     */
	    private String extractDataFromLine(String line, String label) {
	        // Adjust the logic to match the specific format "##" separator and desired position
	        String[] parts = line.split("##");
	        if (parts.length > 3) {
	            return parts[3];
	        }
	        return null;
	    }
}








