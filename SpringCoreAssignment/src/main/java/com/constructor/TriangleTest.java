package com.constructor;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TriangleTest {

	public static void main(String[] args) 
	 {
	ApplicationContext context = new ClassPathXmlApplicationContext("beansT.xml");
	Triangle triangle = (Triangle) context.getBean("triangle");
	triangle.draw();
	 }

}
