package com.example.app.javatechie.spring.auth.example.CRA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.app.javatechie.spring.auth.example.CRA.DTOCRA;
import com.example.app.javatechie.spring.auth.example.client.Client;
import com.example.app.javatechie.spring.auth.example.mission.Mission;
import com.example.app.javatechie.spring.auth.example.CRA.CRA;

	@Service
	public class CRAImp implements CRAService  {

	    @Autowired
	    public CRARepo CRARepo;
	  
	    @Override
	    public String addCRA(DTOCRA dto) {
	    	CRA CRA = new CRA(
	    			 dto.getId(),
	                 dto.getMois(), 
	                 dto.getNbjour(),
	                 dto.getMontantH(),
	                 dto.getMontantTTC(), 
	                 dto.getMissionid()       
	                );
	             
	    	CRARepo.save(CRA);

	        // Return the ID of the saved simulator, or adjust based on your logic:
	        return String.valueOf(CRA.getId()); // Convert ID to String
	    }

	    @Override
	    public List<CRA> findAll() {
	        return CRARepo.findAll();
	    }

	    @Override
	    public CRA findById(Integer id) {
	        if (CRARepo.findById(id).isPresent()) {
	            return CRARepo.findById(id).get();
	        }
	        return null;
	    }
	    
	       
	    @Override
	    public CRA save(CRA CRA) {

	    	CRARepo.save(CRA);

	        return CRA;

	    }

	    
	    
	    @Override
        public CRA update(int id, CRA updatedCRA) {

	    	CRA existingCRA = findById(id);

            if (existingCRA != null) {

            	  existingCRA.setMission(updatedCRA.getMission());
      	        existingCRA.setMois(updatedCRA.getMois());
      	        existingCRA.setNbjour(updatedCRA.getNbjour());
      	        existingCRA.setMontantH(updatedCRA.getMontantH());
      	        existingCRA.setMontantTTC(updatedCRA.getMontantTTC());	
            	         
                return CRARepo.save(existingCRA);

            }

            return null;

        }
        
        @Override

    	public void delete(int id) {

        	CRA CRA = findById(id);

        	CRARepo.delete(CRA);

    	}
        
        
        //to create fonction getCraByMissionid
        @Override
        public List<CRA> getCraByMissionId(int id) {
        	return CRARepo.findByMissionId(id);
        	
        }
	}



