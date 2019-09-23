package com.mrct.config;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.first.dao.HelloWorldClient;
import com.mrct.beans.HelloWorldServices;
import com.mrct.beans.HelloworldServiceImpl;
import com.mrct.test.TestMain;

@Configuration
public class AppRunner {
	Log log=LogFactory.getLog(AppRunner.class);
	
	
	@Bean
	public HelloWorldServices createHelloWorldServices() {
		log.info("helloworld Service class instance created");
		return new HelloworldServiceImpl();
	}
	@Bean
	public HelloWorldClient createHelloWorldClient() {
		log.info("HelloWorldClient  class instance created");
		return new HelloWorldClient();
	}
	
}
