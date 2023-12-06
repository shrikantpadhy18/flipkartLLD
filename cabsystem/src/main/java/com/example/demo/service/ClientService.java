package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Client;
import com.example.demo.repository.ClientStore;


@Service
public class ClientService {
	
	@Autowired
	private ClientStore store;
	
	public Client saveToClientStore(Client client) {
		return store.addStore(client.getClientid(), client);
	}
}
