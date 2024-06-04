package com.example.app.javatechie.spring.auth.example.salaries;



import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.javatechie.spring.auth.example.Justificatif.Justificatif;
import com.example.app.javatechie.spring.auth.example.Justificatif.JustificatifRepo;
import com.example.app.javatechie.spring.auth.example.mission.Mission;
import com.example.app.javatechie.spring.auth.example.mission.MissionRepo;
import com.example.app.javatechie.spring.auth.example.salaries.DTOsalaries;
import com.example.app.javatechie.spring.auth.example.salaries.Salaries;


@Service
public class MyServiceSalariesImp implements MyServiceSalaries {

    @Autowired
    public SalariesRepository SalariesRepository;
    @Autowired
   public MissionRepo missionRepo;
    @Autowired
   public JustificatifRepo justificatifRepo;
    
    
    @Override
    public String addSalaries(DTOsalaries dto) {
        Salaries salaries = new Salaries(
        		 dto.getId(),
                 dto.getPrenom(), 
                 dto.getNom(),
                 dto.getDateNaiss(),
                 dto.getAdresse(), 
                 dto.getPays(), 
                 dto.getMatricule(),
                 dto.getNumSS(), 
                 dto.getDateEntre(),
                 dto.getDateSortie(),
                 dto.getEmploi(),      
                 dto.getStatut(), 
                 dto.getPosition(),
                 dto.getCoefficient()
               
                );
        
        
        SalariesRepository.save(salaries);

        // Return the ID of the saved simulator, or adjust based on your logic:
        return String.valueOf(salaries.getId()); // Convert ID to String
    }

    @Override
    public List<Salaries> findAll() {
        return SalariesRepository.findAll();
    }

    @Override
    public Salaries findById(Integer id) {
        if (SalariesRepository.findById(id).isPresent()) {
            return SalariesRepository.findById(id).get();
        }
        return null;
    }
    
    
    @Override
    public Salaries save(Salaries Salaries) {

    	SalariesRepository.save(Salaries);

        return Salaries;
    }

    @Override
    public Salaries update(int id, Salaries updatedSalaries) {

    	Salaries existingSalaries = findById(id);

        if (existingSalaries != null) {

        	existingSalaries.setPrenom(updatedSalaries.getPrenom());

        	existingSalaries.setNom(updatedSalaries.getNom());

        	existingSalaries.setAdresse(updatedSalaries.getAdresse());
        	
        	existingSalaries.setPays(updatedSalaries.getPays());

        	
        	existingSalaries.setdateNaiss(updatedSalaries.getdateNaiss());

        	existingSalaries.setDateEntre(updatedSalaries.getDateEntre());

        	existingSalaries.setDateSortie(updatedSalaries.getDateSortie());

        	existingSalaries.setCoefficient(updatedSalaries.getCoefficient());

        	existingSalaries.setEmploi(updatedSalaries.getEmploi());

        	existingSalaries.setStatut(updatedSalaries.getStatut());
  
        	existingSalaries.setPosition(updatedSalaries.getPosition());

        	existingSalaries.setMatricule(updatedSalaries.getMatricule());


            return SalariesRepository.save(existingSalaries);

        }

        return null;

    }
    
    @Override

	public void delete(int id) {
	Salaries salaries = findById(id);
      
       Optional<Justificatif> j=justificatifRepo.findBySalariesId(id);
       if (j.isPresent()) {
       justificatifRepo.delete(j.get());}
		SalariesRepository.delete(salaries);
		

	}
   
   
}
