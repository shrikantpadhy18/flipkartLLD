package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Client {
	private int clientid;
	private String clientname;
	private String emailid;
	private String address;
	public int getClientid() {
		return clientid;
	}
	public void setClientid(int clientid) {
		this.clientid = clientid;
	}

}
