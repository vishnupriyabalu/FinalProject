package com.finproj.Finprojbackend;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Myconfiguration {
	@Bean("myBean")
	public Mybean getMyBean()
	{
		System.out.println("--- Bean Created and Stored in IOC Container---");
		return new Mybean();
	}
}
