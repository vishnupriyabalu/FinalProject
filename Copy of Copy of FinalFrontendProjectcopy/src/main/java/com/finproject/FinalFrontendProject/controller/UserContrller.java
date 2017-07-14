package com.finproject.FinalFrontendProject.controller;

import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.finproj.Finprojbackend.dao.ProductDAO;
import com.finproj.Finprojbackend.dao.UserDAO;
import com.finproj.Finprojbackend.model.Product;
import com.finproj.Finprojbackend.model.Supplier;
import com.finproj.Finprojbackend.model.User;
@Controller
public class UserContrller
{
	@Autowired
	ProductDAO productDAO;
	
	@Autowired
	UserDAO userDAO;
	@RequestMapping("/loginsuccess")
	public String loginSuccess(HttpSession session,Model m)
	{
		String page=null;
		 System.out.println("----it is in User controller Login Success module----");
			
		boolean LoggedIn=true;
	     
		//retrieving username
		String username=SecurityContextHolder.getContext().getAuthentication().getName();
		 session.setAttribute("username", username);
	      session.setAttribute("LoggedIn", LoggedIn);
	      System.out.println(username);	
	      System.out.println(LoggedIn);	
		     
		//retrieving the role
		Collection<GrantedAuthority> authorities=(Collection<GrantedAuthority>)SecurityContextHolder.getContext().getAuthentication().getAuthorities();
      
       for(GrantedAuthority role:authorities)
      {
    	  System.out.println("RoleName:"+role.getAuthority()+"username:"+username);
    	   if(role.getAuthority().equals("ROLE_ADMIN"))
          {
    	   page="Adminhome";
    	 }
      else
      { System.out.println("----Login Successfull----");
		
    	  List<Product> list=productDAO.getProductDetails();
     	  m.addAttribute("prodlist",list);
    	    page="Userhome";
      }
    	 
      }
       return page;
		
	}
	@RequestMapping(value="/InsertUser",method=RequestMethod.POST)
	public String insertUser(@ModelAttribute("user") User user,Model m)
	{   System.out.println("---User Insertion Processing---");
	
		userDAO.insertUpdateUser(user);	
		
		List<User> userlist=userDAO.getUserDetails();
		m.addAttribute("userlist",userlist);
		System.out.println("---User Inserted---");
		
		return "Login";
	}
	
	@RequestMapping("/isValidUser")
	public ModelAndView showMessage(@RequestParam(value = "username") String username,
			@RequestParam(value = "password") String password) {
		System.out.println("in controller");

		String message;
		ModelAndView mv=new ModelAndView();
		if (userDAO.isValidUser(username,password)) 
		{
			message = "Successfully Logged in";
			} else{
			message="Please enter a valid username and password";
			mv=new ModelAndView("Loginincorrect");
		}
	
		mv.addObject("message", message);
		mv.addObject("username", username);
		return mv;
	}
	
	
}

