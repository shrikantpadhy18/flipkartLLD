package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class BookingData {
	private String username;
	private int[] source = new int[2];
	private int[] destination = new int[2];
	
	
	public int[] getSource() {
		return source;
	}
	public int[] getDestination() {
		return destination;
	}
}
