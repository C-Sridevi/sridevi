package com.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EightTest {
	public static void main( String[] args ) {
	    ApplicationContext ctx = 
	       new ClassPathXmlApplicationContext("beansEight.xml");
	    EightB b = (EightB) ctx.getBean("EightB");
	    b.doSomething();

	    // Explicitly closing application 
	    // context to force bean cleanup
	    ((ClassPathXmlApplicationContext)ctx).close();    
	  }

}
