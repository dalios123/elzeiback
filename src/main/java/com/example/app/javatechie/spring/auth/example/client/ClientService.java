package com.example.app.javatechie.spring.auth.example.client;

import java.util.List;



import com.example.app.javatechie.spring.auth.example.client.DTOclient;
import com.example.app.javatechie.spring.auth.example.salaries.Salaries;
import com.example.app.javatechie.spring.auth.example.client.Client;


public interface ClientService {

	public String addClient(DTOclient dto);
	List <Client> findAll();
	Client findById(int id);

	Client update(int id, Client updateClient);
	Client save(Client Client);
	 void delete(int id);

}
