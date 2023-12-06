package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class CabRider {
	public int driverid;
	private String name;
	private int age;
	private String gender;
	private String vehicleInfo;
	private int coordinates[] = new int[2];
	
	public int[] getCoordinates() {
		return coordinates;
	}
}
