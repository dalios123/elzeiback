package com.example.app.javatechie.spring.auth.example.Justificatif;

import java.io.IOException;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.app.javatechie.spring.auth.example.salaries.Salaries;
import com.example.app.javatechie.spring.auth.example.salaries.MyServiceSalaries;

@Service
public class JustificatifService {

    @Autowired
    private JustificatifRepo repository;
    @Autowired
    private MyServiceSalaries MyServiceSalaries; 


    private JustificatifInterface justificatifInterface = new JustificatifInterface();

    public String uploadFile(MultipartFile file, int salarieId) {
       
        try {
            // Récupérer l'opération associée
            Salaries Salaries = MyServiceSalaries.findById(salarieId);

            if (Salaries != null) {
                byte[] compressedImage = justificatifInterface.compressImage(file.getBytes());

                
                Justificatif justificatif = repository.save(Justificatif.builder()
                        
                        .fichier(compressedImage)
                        .Salaries(Salaries) // Associer le justificatif à l'opération
                        .build());

			                return "File uploaded successfully: " + file.getOriginalFilename();
			            } else {
			                return "Operation not found with ID: " + salarieId;
			            }
			        } catch (IOException e) {
			            e.printStackTrace(); 
			            return "Error uploading file: " + e.getMessage();
			        }
			    }
    
    		//downloadFile
		    public byte[] downloadFile(long id) {
		        Optional<Justificatif> dbImageData = repository.findById(id);
		
		        return dbImageData.map(justificatif -> justificatifInterface.decompressImage(justificatif.getFichier()))
		                          .orElse(new byte[0]);
		    }


		    public Justificatif saveJustificatif(Justificatif justificatif) {
		        return repository.save(justificatif);
		    }
		
		    public Optional<Justificatif> getJustificatifById(long id) {
		        return repository.findById(id);
		    }
		
		    public List<Justificatif> getAllJustificatifs() {
		        return repository.findAll();
		    }
		
		    public void deleteJustificatifById(long id) {
		        repository.deleteById(id);
		    }
		  
}
