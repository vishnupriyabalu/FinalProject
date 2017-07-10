package com.finproj.Finprojbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mybeantest {
	public static void main(String arg[])
	{
		System.out.println("---Test Case - AnnotationConfigApplication Context Object Created---");
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.finproj.Finprojbackend");
		
		context.refresh();
		
		System.out.println("---My Bean Created---");
		
		Mybean mybean=(Mybean)context.getBean("myBean");
		mybean.display();
	}

}
