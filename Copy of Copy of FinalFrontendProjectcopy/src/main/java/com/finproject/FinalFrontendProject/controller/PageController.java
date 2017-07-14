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
	@RequestMapping("/thanku")
	public String ShowThanku()
	{
		System.out.println("--Moving to Thanku Page");
		return "Thanku";
	}
	@RequestMapping("/Loginf")
	public String ShowLoginfail()
	{
		System.out.println("--Moving to Login Page");
		return "Loginfail";
	}

	@RequestMapping("/cartfail")
	public String ShowCartfail()
	{
		System.out.println("--Moving to Login Page");
		return "cartwithoutlogin";
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

}
