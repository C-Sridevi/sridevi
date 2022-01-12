package com.constructor;

import org.springframework.context.ApplicationContext;


import org.springframework.context.support.ClassPathXmlApplicationContext;



public class ConstructorTest {
	
	private static ApplicationContext context;

	public static void main(String[] args) {

	context=new ClassPathXmlApplicationContext("beans.xml");

	//Address1 address= (Address1) context.getBean("Address1");
  Address1 address = (Address1) context.getBean("Address1");
  address.display();

	Customer1 customer=	 (Customer1) context.getBean("Customer1");
	customer.display();
	}

}


