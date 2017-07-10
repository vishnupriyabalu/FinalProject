package com.finproject.FinalFrontendProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.finproj.Finprojbackend.model.User;

@Controller
public class PageController
{
	@RequestMapping("/Login")
	public String ShowLogin()
	{
		System.out.println("--Moving to Login Page");
		return "Login";
	}

	
	
@RequestMapping("/index")
public String ShowHome()
{
	System.out.println("--Moving to Home Page");
	return "index";
}


@RequestMapping("/Register")
public String ShowRegister()
{
	System.out.println("--Moving to Register Page---");
	return "Register";
}
@RequestMapping("/About")
public String ShowAbout()
{
	System.out.println("--Moving to Aboutus Page---");
	return "AboutUs";
}
@RequestMapping("/Contact")
public String ShowContact()
{
	System.out.println("--Moving to Contactus Page---");
	return "ContactUS";
}
@RequestMapping("/perform_logout")
public String ShowLogout()
{
	System.out.println("--Moving to Logout Page---");
	return "Register";
}
}
