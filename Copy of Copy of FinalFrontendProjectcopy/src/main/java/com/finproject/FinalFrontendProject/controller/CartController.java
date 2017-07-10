package com.finproject.FinalFrontendProject.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.finproj.Finprojbackend.dao.CartDAO;
import com.finproj.Finprojbackend.dao.ProductDAO;
import com.finproj.Finprojbackend.model.Cart;
import com.finproj.Finprojbackend.model.Product;
@Controller

public class CartController {
	@Autowired
	CartDAO cartDAO;
	@Autowired 
	ProductDAO productDAO;
	@RequestMapping(value="/addtocart/{prodid}")
	public String addtocart(@PathVariable("prodid") int prodid,@RequestParam("quantity") int quantity,HttpSession session,Model m)
	{
		Cart cart=new Cart();
		String username=(String)session.getAttribute("username");
		cart.setCartid(1001);
		cart.setProdid(prodid);
		cart.setQuantity(quantity);
		cart.setStatus("N");
		cart.setUsername(username);
		
		Product product=productDAO.getProduct(prodid);
		cart.setProdname(product.getProdname());
		cart.setPrice(product.getPrice());
		
		return "Cart";
		
	}

}
