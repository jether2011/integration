package com.jetherrodrigues.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jetherrodrigues.model.Client;
import com.jetherrodrigues.repository.IClient;

@Service
public class ClientService {
	@Autowired
	private IClient client;
	
	public void save(Client client) {
		this.client.save(client);
	}
	
	public List<Client> findAll(){
		return client.findAll();
	}
}
