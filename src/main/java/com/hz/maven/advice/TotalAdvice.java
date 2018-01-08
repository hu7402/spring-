package com.hz.maven.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class TotalAdvice {
	public void before(){
		System.out.println("_________前置通知_________");
	}
	public void afterRunning(){
		System.out.println("_________后置通知_________");
	}
	public void afterException(){
		System.out.println("_________异常后通知_________");
	}
	public Object around(ProceedingJoinPoint point) throws Throwable{
		System.out.println("_________环绕前通知_________");
		Object object=point.proceed();
		System.out.println("_________环绕后通知_________");
		return object;
		
	}
	public void after(){
		System.out.println("++++++++++++++finally通知++++++++++++");
	}
}
