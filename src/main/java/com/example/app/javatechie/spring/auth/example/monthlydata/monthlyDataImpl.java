package com.example.app.javatechie.spring.auth.example.monthlydata;




import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.javatechie.spring.auth.example.client.Client;
import com.example.app.javatechie.spring.auth.example.mission.DTOmission;
import com.example.app.javatechie.spring.auth.example.mission.Mission;
import com.example.app.javatechie.spring.auth.example.salaries.SalariesRepository;
import com.example.app.javatechie.spring.auth.example.monthlydata.monthlyData;

	@Service
	public class monthlyDataImpl implements monthlyDataService  {

	    @Autowired
	    public monthlyDataRepo monthlyDataRepo;
	    @Autowired
	    public  SalariesRepository salariesRepository;
	    
	    @Override
	    public String addMonthlyData(monthlyData monthlyData) {
	    	
	    	   monthlyData MonthlyData = new monthlyData(
	    			monthlyData.getId(),
	    			monthlyData.getSalariesid(),
	    			monthlyData.getMissionid(),
	    			monthlyData.getCraid(),
	    			monthlyData.getFacture(), 
	    			monthlyData.getAutre(),
	    			monthlyData.getTotalPercu(), 
	    			monthlyData.getCout(),
	    			monthlyData.getFraisrepas(),
	    			monthlyData.getFraiskilo(),
	    			monthlyData.getChargesalarial(),
	    			monthlyData.getChargeannexe()
	    						    			
	    			    		
	                );	           	    		    	
	    	monthlyDataRepo.save(monthlyData);
	        // Return the ID of the saved simulator, or adjust based on your logic:
	        return String.valueOf(monthlyData.getId()); // Convert ID to String
	    }

	    @Override
	    public List<monthlyData> findAll() {
	        return monthlyDataRepo.findAll();
	    }
	    @Override
	    public monthlyData findById(int id) {
	        if (monthlyDataRepo.findById(id).isPresent()) {
	            return monthlyDataRepo.findById(id).get();
	        }
	        return null;
	    }
	    
	       
	    @Override
	    public monthlyData save(monthlyData monthlyData) {

	    	monthlyDataRepo.save(monthlyData);

	        return monthlyData;

	    }

	    
	    @Override
        public monthlyData update(int id, monthlyData updatedMonthlyData) {

	    	monthlyData existingmonthlyData = findById(id);

            if (existingmonthlyData != null) {

           

            	
            	existingmonthlyData.setAutre(updatedMonthlyData.getAutre());
            	existingmonthlyData.setCout(updatedMonthlyData.getCout());
            	existingmonthlyData.setFacture(updatedMonthlyData.getFacture());
            	existingmonthlyData.setTotalPercu(updatedMonthlyData.getTotalPercu());
            	existingmonthlyData.setCraid(updatedMonthlyData.getCraid());
            	existingmonthlyData.setMissionid(updatedMonthlyData.getMissionid());
            	existingmonthlyData.setSalariesid(updatedMonthlyData.getSalariesid());          	         
            	return monthlyDataRepo.save(updatedMonthlyData);

            }

            return null;

        }
        
        @Override

    	public void delete(int id) {

        	monthlyData monthlyData = findById(id);

        	monthlyDataRepo.delete(monthlyData);

    	}
       
	}



