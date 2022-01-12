package com.constructor;


	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class BankTest {
	    
		public static ApplicationContext context;
		public static void main(String[] args) {
			 
			context =new ClassPathXmlApplicationContext("beansbank.xml");
			
			BankAccountController controller=(BankAccountController) context.getBean("BankAccountController");	
			
			controller.withdraw(9865,9854);
			controller.deposit(7644,9876);
			controller.getbalance(98756);
			controller.fundTransfer(9897,4567,9876);
		}

	}

