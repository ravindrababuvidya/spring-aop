package com.mrct.test;



import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.first.dao.HelloWorldClient;
import com.mrct.beans.Address;
import com.mrct.beans.Person;
import com.mrct.config.AppConfig;
import com.mrct.config.AppRunner;



public class TestMain {
	public static void main(String[] args) {
		Log log=LogFactory.getLog(TestMain.class);
	
		log.warn("Main Method Called");
		AnnotationConfigApplicationContext aca=new AnnotationConfigApplicationContext(AppRunner.class);
		HelloWorldClient helloWorldClient =aca.getBean(HelloWorldClient.class);
		//System.out.println(helloWorldClient.showMessage());
		System.out.println("Annotation Example Core "+helloWorldClient.showMessage("Ravindra Babu"));
		
		ApplicationContext aca1=new AnnotationConfigApplicationContext(AppConfig.class);
		Person person = aca1.getBean(Person.class);
		person.setId(1);
		person.setName("Ravindra Babu");
		Address address = aca1.getBean(Address.class);
		address.setCity("Hyderabad");
		System.out.println("Id: \t"+person.getId()+" name : \t"+person.getName()+"city: \t"+person.getAddress().getCity());
	}
}
