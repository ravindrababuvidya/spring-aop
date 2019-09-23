package com.mrct.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyAspectFirstGet {
	@Before("com.mrct.aop.LogicExperssionsPointCuts.getter()")
	public void getValue() {
		System.out.println("@@@@@@@@@ Before Advice GET @@@@@@@@@@ ");
	}
}
