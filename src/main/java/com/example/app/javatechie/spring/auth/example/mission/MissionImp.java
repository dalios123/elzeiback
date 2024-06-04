package com.example.app.javatechie.spring.auth.example.mission;

import java.util.ArrayList;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.javatechie.spring.auth.example.salaries.Salaries;
import com.example.app.javatechie.spring.auth.example.salaries.SalariesRepository;

	@Service
	public class MissionImp implements MissionService  {

	    @Autowired
	    public MissionRepo missionRepo;
	    @Autowired
	    public  SalariesRepository salariesRepository;
	    
	    @Override
	    public String addMission(Mission dto) {
	    	List<Salaries> s = new ArrayList<Salaries>();	    	
	    	for(Salaries salariess : dto.getSalariesid()){
	    		Salaries ss = salariesRepository.findById(salariess.getId()).get();
	    		s.add(ss);
	    	}
	    	Mission mission = new Mission(
	    			 dto.getId(),
	    			 dto.getCodemission(),
	                 dto.getDatedebut(), 
	                 dto.getDatefin(), 
	                 dto.getTjm(),
	                
	                 dto.getClientid(),
	                 s                
	                );	           	    		    	
	    	missionRepo.save(mission);
	        // Return the ID of the saved simulator, or adjust based on your logic:
	        return String.valueOf(mission.getId()); // Convert ID to String
	    }

	    @Override
	    public List<Mission> findAll() {
	        return missionRepo.findAll();
	    }
	    @Override
	    public Mission findById(int id) {
	        if (missionRepo.findById(id).isPresent()) {
	            return missionRepo.findById(id).get();
	        }
	        return null;
	    }
	    
	       
	    @Override
	    public Mission save(Mission Mission) {

	    	missionRepo.save(Mission);

	        return Mission;

	    }

	    
	    @Override
        public Mission update(int id, Mission updatedMission) {

	    	Mission existingMission = findById(id);

            if (existingMission != null) {
            	
            	existingMission.setCodemission(updatedMission.getCodemission());
      	        existingMission.setDatedebut(updatedMission.getDatedebut());
      	        existingMission.setDatefin(updatedMission.getDatefin());
      	        existingMission.setTjm(updatedMission.getTjm());
      	        existingMission.setClientid(updatedMission.getClientid());
      	        existingMission.setSalariesid(updatedMission.getSalariesid());
            	         
            	return missionRepo.save(existingMission);

            }

            return null;

        }
        
        @Override

    	public void delete(int id) {

        	Mission mission = findById(id);

        	missionRepo.delete(mission);

    	}
        @Override
        public Mission getMissionBySalariesMission(int id) {
        	return missionRepo.findBySalariesidId(id);
        	
        }
		@Override
		public Mission getMissionByClientId(int id) {
			return missionRepo.findByClientidId( id);

		}
	    
	}



