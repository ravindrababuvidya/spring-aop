package com.mrct.beans;


import org.springframework.stereotype.Component;

@Component

public class Address {
	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
}
