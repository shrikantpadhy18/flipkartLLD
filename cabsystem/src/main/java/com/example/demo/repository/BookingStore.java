package com.example.demo.repository;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.BookingData;
import com.example.demo.model.CabRider;
import java.util.HashMap;
import java.util.Map;


@Repository
public class BookingStore {
	@Autowired
	private RiderStore rider;
	
	private Map<Integer,CabRider>bookedRide = new HashMap<>();
	private Object lock = new Object();
	
	public int addBookingInfo(BookingData bookInfo) {
		synchronized(lock) {
			
		
			Map<Integer,CabRider> driverStores = rider.getDriverStores();
			int src[] = bookInfo.getSource();
			int dest[] = bookInfo.getDestination();
		
			int driverid = -1;
			long max = Long.MAX_VALUE;
			for(Map.Entry<Integer,CabRider> e : driverStores.entrySet()) {
				int id = e.getKey();
				CabRider driver = e.getValue();
				int location = driver.getCoordinates()[0] + driver.getCoordinates()[1];
				if(Math.abs(location - (src[0] + src[1])) < max) {
					max = Math.abs(location - (src[0] + src[1]));
					driverid = id;
				}
			}
			if(driverid == -1) {
				return -1;
			}
			CabRider riderInfo = driverStores.get(driverid);
			driverStores.remove(driverid);
			bookedRide.put(driverid, riderInfo);
			return driverid;
		}
	}
}
