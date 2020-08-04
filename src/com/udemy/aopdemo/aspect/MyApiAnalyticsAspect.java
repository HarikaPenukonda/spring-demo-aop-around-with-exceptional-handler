package com.udemy.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyApiAnalyticsAspect {
	
	@Before("com.udemy.aopdemo.aspect.AopExpressions.forDaoPackageNoGetterSetter()") // Apply pointcut declaration to advice
	public void performApiAnalytics() 
	{
		System.out.println("\n===> Performing API analytics ");
		
	}

}
