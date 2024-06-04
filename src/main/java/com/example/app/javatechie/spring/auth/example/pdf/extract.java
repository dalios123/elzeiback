/*package com.example.app.javatechie.spring.auth.example.pdf;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;


import jakarta.swing.*;
import jakarta.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class extract {

    public static void main(String[] args) {
        // Call the extractTransactions method
        extractTransactions();
    }

    public static void extractTransactions() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose PDF File");

        FileNameExtensionFilter pdfFilter = new FileNameExtensionFilter("PDF Files", "pdf");
        fileChooser.addChoosableFileFilter(pdfFilter);

        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            try {
                String extractedText = extractTextFromPDF(selectedFile);

                // Define regular expressions to extract information from the PDF text
                Pattern PeriodePattern = Pattern.compile("Période\\s*[:\\.]\\s*(.*)");
                Pattern matriculePattern = Pattern.compile("Matricule\\s*:\\s*(\\d+)");
                Pattern emploiPattern = Pattern.compile("Emploi\\s*[:\\.]\\s*(.*)");
                Pattern positionPattern = Pattern.compile("Position\\s*[:\\.]\\s*(.*)");
                Pattern NSSPattern = Pattern.compile("N° SS\\s*:\\s*(\\d+)");
                Pattern CoefficientPattern = Pattern.compile("Coefficient\\s*:\\s*(\\d+)");
                Pattern SalairebrutPattern = Pattern.compile("Salaire brut\\s(.*)");
                Pattern TotaldescotisationsetcontributionsPattern = Pattern.compile("Total des cotisations et contributions\\s+([\\d\\s]+\\.[\\d]{2})");
                Pattern NetapayeravantimpôtsurlerevenuPattern = Pattern.compile("Net à payer avant impôt sur le revenu\\s(.*)");
                Pattern NetpayePattern = Pattern.compile("Net payé\\s(.*)");
                Pattern chpatronialesPattern = Pattern.compile("Total des cotisations et contributions\\s+([\\d\\s]+\\.[\\d]{2})");

                Matcher PeriodeMatcher = PeriodePattern.matcher(extractedText);
                String Periode = null;
                if (PeriodeMatcher.find()) {
                    Periode = PeriodeMatcher.group(1);
                }

                Matcher matriculeMatcher = matriculePattern.matcher(extractedText);
                String matricule = null;
                if (matriculeMatcher.find()) {
                    matricule = matriculeMatcher.group(1);
                }

                Matcher NSSMatcher = NSSPattern.matcher(extractedText);
                String NSS = null;
                if (NSSMatcher.find()) {
                    NSS = NSSMatcher.group(1);
                }

                // Extract emploi and position from the extracted text
                Matcher emploiMatcher = emploiPattern.matcher(extractedText);
                String emploi = null;
                if (emploiMatcher.find()) {
                    emploi = emploiMatcher.group(1);
                }

                Matcher positionMatcher = positionPattern.matcher(extractedText);
                String position = null;
                if (positionMatcher.find()) {
                    position = positionMatcher.group(1);
                }

                Matcher CoefficientMatcher = CoefficientPattern.matcher(extractedText);
                String Coefficient = null;
                if (CoefficientMatcher.find()) {
                    Coefficient = CoefficientMatcher.group(1);
                }

                Matcher SalairebrutMatcher = SalairebrutPattern.matcher(extractedText);
                String Salairebrut = null;
                if (SalairebrutMatcher.find()) {
                    Salairebrut = SalairebrutMatcher.group(1);
                }

                Matcher TotaldescotisationsetcontributionsMatcher = TotaldescotisationsetcontributionsPattern.matcher(extractedText);
                String Totaldescotisationsetcontributions = null;
                if (TotaldescotisationsetcontributionsMatcher.find()) {
                    Totaldescotisationsetcontributions = TotaldescotisationsetcontributionsMatcher.group(1);
                }

                Matcher NetapayeravantimpôtsurlerevenuMatcher = NetapayeravantimpôtsurlerevenuPattern.matcher(extractedText);
                String Netapayeravantimpôtsurlerevenu = null;
                if (NetapayeravantimpôtsurlerevenuMatcher.find()) {
                    Netapayeravantimpôtsurlerevenu = NetapayeravantimpôtsurlerevenuMatcher.group(1);
                }

                Matcher NetpayeMatcher = NetpayePattern.matcher(extractedText);
                String Netpaye = null;
                if (NetpayeMatcher.find()) {
                    Netpaye = NetpayeMatcher.group(1);
                }

                Matcher chpatronialesMatcher = chpatronialesPattern.matcher(extractedText);
                String chpatroniales = null;
                if (chpatronialesMatcher.find()) {
                    chpatroniales = chpatronialesMatcher.group(1);
                }
              int id =4;
                // Display the extracted information
                System.out.println("**PDF Data:**");
                System.out.println("Période: " + Periode);
                System.out.println("Matricule: " + matricule);
                System.out.println("Emploi: " + emploi);
                System.out.println("Position: " + position);
                System.out.println("NSS: " + NSS);
                System.out.println("Coefficient: " + Coefficient);
                System.out.println("Total des cotisations et contributions: " + Totaldescotisationsetcontributions);
                System.out.println("Net à payer avant impôt sur le revenu: " + Netapayeravantimpôtsurlerevenu);
                System.out.println("Net payé: " + Netpaye);
                System.out.println("Cotisations patronales: " + chpatroniales);
                
             
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("No file selected.");
        }
    }

    private static String extractTextFromPDF(File pdfFile) throws IOException {
        try (PDDocument document = PDDocument.load(pdfFile)) {
            PDFTextStripper stripper = new PDFTextStripper();
            stripper.setSortByPosition(true);
            stripper.setStartPage(1); // Assuming you want to extract from all pages
            return stripper.getText(document);
        }
    }
}*/
