package com.example.app.javatechie.spring.auth.example.client;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.javatechie.spring.auth.example.client.DTOclient;
import com.example.app.javatechie.spring.auth.example.salaries.Salaries;
import com.example.app.javatechie.spring.auth.example.client.Client;


@Service
public class ClinetServiceImp implements ClientService  {

    @Autowired
    public ClientRepo ClientRepo;
  
    @Override
    public String addClient(DTOclient dto) {
    	Client Client = new Client(
    			 dto.getId(),
                 dto.getLibelle(), 
                 dto.getNumtva(),
                 dto.getAddress(),
                 dto.getPays()
               
                );
             
        ClientRepo.save(Client);

        // Return the ID of the saved simulator, or adjust based on your logic:
        return String.valueOf(Client.getId()); // Convert ID to String
    }

    @Override
    public List<Client> findAll() {
        return ClientRepo.findAll();
    }

    @Override
    public Client findById(int id) {
        if (ClientRepo.findById(id).isPresent()) {
            return ClientRepo.findById(id).get();
        }
        return null;
    }
    
    
    @Override
    public Client save(Client Client) {

    	ClientRepo.save(Client);

        return Client;

    }
        
        @Override
        public Client update(int id, Client updatedClient) {

        	Client existingClient = findById(id);

            if (existingClient != null) {

            	existingClient.setLibelle(updatedClient.getLibelle());

            	existingClient.setNumtva(updatedClient.getNumtva());

            	existingClient.setAddress(updatedClient.getAddress());
            	
            	existingClient.setPays(updatedClient.getPays());

            	         
                return ClientRepo.save(existingClient);

            }

            return null;

        }
        
        @Override

    	public void delete(int id) {

        	Client client = findById(id);

    		ClientRepo.delete(client);

    	}


}
