package com.mrct.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.first.dao.CustomerDao;
import com.mrct.config.AopConfig;

public class AOPTest {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context = 
			new AnnotationConfigApplicationContext(AopConfig.class);
	CustomerDao customerDao = (CustomerDao) context.getBean("customerDao");
	customerDao.saveCustomer();
	customerDao.updateCustomer();
	customerDao.setName("Ravindra");
	System.out.println(customerDao.getName());
}
}
