package com.example.demo.repository;

import java.util.Map;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

import com.example.demo.model.Client;

@Repository
public class ClientStore {
	private Map<Integer,Client>clientStorage = new HashMap<>();
	private Object lock = new Object();
	
	public Client addStore(int clientId,Client client) {
		synchronized(lock) {
			
		
			if(clientStorage.get(clientId) == null) {
				clientStorage.put(clientId, client);
				return client;
			}
			else {
				return null;
			}
		}
		//return 
	}
	
}
