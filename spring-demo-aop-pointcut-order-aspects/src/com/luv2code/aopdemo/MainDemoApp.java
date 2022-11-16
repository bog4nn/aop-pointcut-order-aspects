package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		// get the bean from spring container
		MembershipDAO theMembershipDAO = context.getBean("membershipDAO",MembershipDAO.class);
		// call the business method	
		theAccountDAO.addAccount();
		
		// call the business method member account
		theMembershipDAO.addAccount();
		
		// call the account dao getter/setter methods
		theAccountDAO.setName("long");
		theAccountDAO.setServiceCode("Loggin");
		
		String name = theAccountDAO.getName();
		String service = theAccountDAO.getServiceCode();
		
		// close the context
		context.close();
	}

}
