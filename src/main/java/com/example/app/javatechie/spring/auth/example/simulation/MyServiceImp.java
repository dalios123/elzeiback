package com.example.app.javatechie.spring.auth.example.simulation;

import java.util.List;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.javatechie.spring.auth.example.salaries.Salaries;
import com.example.app.javatechie.spring.auth.example.simulation.DTO;
import com.example.app.javatechie.spring.auth.example.simulation.Simulateur;
import com.example.app.javatechie.spring.auth.example.simulation.SimulateurRepository;

@Service
public class MyServiceImp implements MyService {

    @Autowired
    public SimulateurRepository simulateurRepository;

    @Override
    public String addSimulateur(DTO dto) {
        Simulateur simulateur = new Simulateur(
                dto.getId(),
                dto.getCout(), 
                dto.getTjm(),
                dto.getQt(),
                dto.getFactureHt(), 
                dto.getDispo(),
                dto.getAstreintes(), 
                dto.getQt2(),
                dto.getFactureHt2(),
                dto.getDispo2(),      
                dto.getAutres(), 
                dto.getQt3(),
                dto.getFactureHt3(),
                dto.getDispo3(), 
                dto.getTotalDispoo(),
                
                
                dto.getBrutAnn(),
                dto.getSalaireBrut(),
                dto.getSalaireNetHorsPAS(),
                dto.getFraisRepas(),
                dto.getFraisKilo(),
                dto.getAutresFraisSurFacture(),
                dto.getTotalPercuHorsExtra(),
                dto.getMedecineDeTravail(),
                dto.getTaxeDapprentissage(),
                dto.getAdessat(),              
                dto.getTaxeCCI(),
                dto.getContinuue(),
                dto.getAssuranceRespCivile(),
                dto.getComplementMutOp1(),
                dto.getCvaeSurCAgenere(),
                dto.getChargesPatronalesURSSAF(),
                dto.getChargesSalariales(),
                dto.getChargesPatronalesAnn(),
                dto.getCoutTotal(),
                
                
                
                dto.getSolde(),
                dto.getTotalPercu(),
                dto.getExtraPossibleHorsPAS()
                
       
        );

        simulateurRepository.save(simulateur);

        // Return the ID of the saved simulator, or adjust based on your logic:
        return String.valueOf(simulateur.getId()); // Convert ID to String
    }
    @Override
    public List<Simulateur> findAll() {
        return simulateurRepository.findAll();
    }
   
    @Override
	public Simulateur findById(Integer id) {
		if(simulateurRepository.findById(id).isPresent()){
			return simulateurRepository.findById(id).get();
		}
		return null;
	}
    
    
  
}
