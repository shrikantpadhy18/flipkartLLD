package com.example.demo.Formatters;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {
	@JsonProperty("CODE")
	int code;
	
	@JsonProperty("MESSAGE")
	String message;
	
	public Response(int code, String message) {
		// TODO Auto-generated constructor stu
		this.code = code;
		this.message = message;
	}
	@JsonIgnore
	public Response getResponse() {
		return this;
	}

}
