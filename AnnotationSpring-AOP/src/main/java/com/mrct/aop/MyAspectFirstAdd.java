package com.mrct.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyAspectFirstAdd {
	@Before("com.mrct.aop.LogicExperssionsPointCuts.setter()")
	public void addingValue() {
		System.out.println("@@@@@@@@@ Before Advice Setter @@@@@@@@@@ ");
	}
}
