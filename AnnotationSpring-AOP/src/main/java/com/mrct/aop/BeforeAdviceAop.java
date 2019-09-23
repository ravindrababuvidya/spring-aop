package com.mrct.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Aspect
@Component
@Order(3)
public class BeforeAdviceAop {
	@Before("execution(public void save*())")
	public void executeBeforeSaveCustomer() {
		System.out.println("@@@@@@@@@ Before Advice Exectuted @@@@@@@@@@ ");
	}
	
	@After("execution(public * update*())")
	public void executeAfterUpdateCustomer() {
		System.out.println("@@@@@@@@@ After Advice Exectuted @@@@@@@@@@ ");
	}
	
	

}
