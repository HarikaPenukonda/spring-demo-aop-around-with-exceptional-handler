package com.udemy.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.udemy.aopdemo.dao.AccountDAO;
import com.udemy.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		// read the spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the bean from spring container
		AccountDAO theAccountDAO = 
				context.getBean("accountDAO", AccountDAO.class);
		
		// GET MEMBERSHIP BEAN FROM SPRING CONTAINER
		MembershipDAO theMembershipDAO = 
				context.getBean("membershipDAO",MembershipDAO.class);
		
		// call the business method
		Account myAccount = new Account();
		myAccount.setName("Madhu");
		myAccount.setLevel("Platinum");
		theAccountDAO.addAccount(myAccount, true); // will only match on addAccount for this param type
		theAccountDAO.doWork();
		
				
		// call the accountdao getter/setter methods
		theAccountDAO.setName("Harika");
		theAccountDAO.setServiceCode("Diamond");
		
		String name = theAccountDAO.getName();
		String code = theAccountDAO.getServiceCode();
		
		System.out.println("Name: " +name);
		System.out.println("Service: " +code);

		
		// call the membership method
		theMembershipDAO.addAnyMethod(); // will not match, as its no param
		theMembershipDAO.goToSleep();
		// close the context
		context.close();
	}

}
