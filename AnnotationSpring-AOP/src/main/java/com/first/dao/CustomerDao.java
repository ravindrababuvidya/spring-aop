package com.first.dao;

import org.springframework.stereotype.Component;

@Component
public class CustomerDao {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void saveCustomer() {
		System.out.println("Customer Details Saved");
	}
	
	public void updateCustomer() {
		System.out.println("Customer Details update");
	}
}
