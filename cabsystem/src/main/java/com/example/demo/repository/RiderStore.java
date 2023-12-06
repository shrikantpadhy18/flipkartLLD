package com.example.demo.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.demo.model.CabRider;

@Repository
public class RiderStore {

	private Map<Integer,CabRider>driverStorage = new HashMap<>();
	
	public CabRider addStore(int driverid,CabRider rider) {
		if(driverStorage.get(driverid) == null) {
			driverStorage.put(driverid, rider);
			return rider;
		}
		else {
			return null;
		}
		//return 
	}
	
	public Map<Integer,CabRider> getDriverStores(){
		return driverStorage;
	}

}
