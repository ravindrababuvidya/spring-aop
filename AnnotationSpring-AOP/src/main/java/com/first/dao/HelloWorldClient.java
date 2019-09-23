package com.first.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.mrct.beans.HelloWorldServices;

public class HelloWorldClient {
	Log log = LogFactory.getLog(HelloWorldClient.class);
	@Autowired
	private HelloWorldServices helloWorldServices;
	
	public String showMessage(String msg) {
		return helloWorldServices.sayHi(msg);
    }
	
}
