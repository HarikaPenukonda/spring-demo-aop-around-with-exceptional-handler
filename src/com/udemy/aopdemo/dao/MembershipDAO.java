package com.udemy.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	
	public String addAnyMethod() {
		
		System.out.println(getClass() + " : DOING STUFF: ADDING A MEMBERSHIP ACCOUNT ");
		return "hello";
	}
	
public boolean goToSleep() {
		
		System.out.println(getClass() + " :go to sleep ");
		return true;
	}

}
