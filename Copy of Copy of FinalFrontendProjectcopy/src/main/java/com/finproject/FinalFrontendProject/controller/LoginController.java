/*package com.finproject.FinalFrontendProject.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.finproj.Finprojbackend.dao.Category_dao;
import com.finproj.Finprojbackend.dao.ProductDAO;
import com.finproj.Finprojbackend.dao.Supplier_DAO;
import com.finproj.Finprojbackend.dao.UserDAO;
import com.finproj.Finprojbackend.model.Cart;
import com.finproj.Finprojbackend.model.Category;
import com.finproj.Finprojbackend.model.Product;
import com.finproj.Finprojbackend.model.Supplier;
import com.finproj.Finprojbackend.model.User;

public class LoginController {

	@Autowired(required=true)
	User user;
	
	@Autowired(required=true)
	UserDAO userDAO;
	
	@Autowired
	Category category;

	@Autowired
	Category_dao categoryDAO;
	
	@Autowired
	Supplier supplier;
	
	@Autowired
	Supplier_DAO supplierDAO;
	
	@Autowired
	Product product;
	
	@Autowired
	ProductDAO productDAO;
	
	@Autowired
	Cart cart;*/
	
	/*	@RequestMapping("/isValidUser")
	public ModelAndView showMessage(@RequestParam(value = "username") String username,
			@RequestParam(value = "password") String password) {
		System.out.println("in controller");

		String message;
		ModelAndView mv ;
		if (userDAO.isValidUser(username,password)) 
		{
			message = "Successfully Logged in";
			 mv = new ModelAndView("product");
		} else{
			message="Please enter a valid username and password";
			mv=new ModelAndView("Login");
		}
	
		mv.addObject("message", message);
		mv.addObject("username", username);
		return mv;
	}
	
	
	@RequestMapping("/Logout")
	public ModelAndView logout(HttpServletRequest request,HttpSession session)
	{
		ModelAndView mv=new ModelAndView("index");
		session.invalidate();
		session=request.getSession(true);
		mv.addObject("logoutMessage","you are successfully logged out");
		mv.addObject("loggedOut","true");
		return mv;
	}
	@RequestMapping("/")
	public String index(HttpSession session){
   	
   	 session.setAttribute("catlist",categoryDAO.getCategoryDetails());
		return "index";
	}
	@RequestMapping("/Login")
	public ModelAndView Login()
	{
		System.out.println("login page");
		ModelAndView mv=new ModelAndView("Login");
		mv.addObject("user",user);
		return mv;
	}*/
	
	/*
     * Register method is used to handle user details  related functionality
     */
/*	@RequestMapping("/Register")
	public ModelAndView registerhere()
	{
		ModelAndView mv = new ModelAndView("Register");
		mv.addObject("user", user);
	
		return mv;
	}
	@RequestMapping(value="Success",method = RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute User user)
	{
		ModelAndView mv;
		String msg;
		msg="You have registered successfully.Please log in to continue";
		userDAO.insertUpdateUser(user);
	  
		mv= new ModelAndView("/Login");
		mv.addObject("msg",msg);
		return mv;
}
	
}*/
	

