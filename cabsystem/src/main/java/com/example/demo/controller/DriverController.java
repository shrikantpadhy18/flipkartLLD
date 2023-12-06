package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Formatters.Response;
import com.example.demo.model.CabRider;
import com.example.demo.service.CabRiderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;


@RestController
public class DriverController {
	
	@Autowired
	private CabRiderService cabRider;
	
	@PostMapping(value = "/v1/driver/register",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Response>addDriver(@RequestBody CabRider riderInfo){
		CabRider riderResponse = cabRider.addRiderInfo(riderInfo);
		
		try {
			
			if(riderResponse == null) {
				String errorMessage = "Failed to add client because its a duplicate entry";
				Response failure = new Response(HttpStatus.INTERNAL_SERVER_ERROR.value(), errorMessage);
	            return new ResponseEntity<>(failure, HttpStatus.INTERNAL_SERVER_ERROR);
			}
			else
			{
				String successMessage = "Driver Details successfully added";
				Response success = new Response(HttpStatus.OK.value(), successMessage);
	            return new ResponseEntity<>(success, HttpStatus.OK);
			}
			
			
		}
		catch(Exception e) {
			
			String errorMessage = "Failed to add Driver";
			Response failure = new Response(HttpStatus.INTERNAL_SERVER_ERROR.value(), errorMessage);
            return new ResponseEntity<>(failure, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
