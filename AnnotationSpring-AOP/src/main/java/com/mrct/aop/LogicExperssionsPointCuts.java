package com.mrct.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogicExperssionsPointCuts {
	@Pointcut("execution(* com.first.dao.*.set*(..))")
	public void getter() {
		System.out.println("Pointcut Getter ");
	};
	@Pointcut("execution(* com.first.dao.*.get*(..))")
	public void setter() {
		System.out.println("Pointcut setter ");
	};
}
