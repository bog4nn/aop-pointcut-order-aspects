package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
	private String name;
	private String serviceCode;
	
	
	
	public void addAccount() {	
		// getClass  give us the class name for display
		System.out.println(getClass()+":DOING MY DB WORK:ADD AN ACCOUNT");
	}



	public String getName() {
		System.out.println(getClass()+":int getName");
		return name;
	}



	public void setName(String name) {
		System.out.println(getClass()+":in setName");

		this.name = name;
	}



	public String getServiceCode() {
		System.out.println(getClass()+":in getServiceCode");

		return serviceCode;
	}



	public void setServiceCode(String serviceCode) {
		System.out.println(getClass()+":in setServiceCode");

		this.serviceCode = serviceCode;
	}
	
}
