package com.finproject.FinalFrontendProject.controller;

import java.util.List;

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
		
		cartDAO.addtocart(cart);
		List<Cart> list=cartDAO.getCartItem(username);
		m.addAttribute("cartitems",list);
		return "Cart";
		
	}
	
	
	@RequestMapping(value="/updatecartitem/${citemid }")
	public String updatecartitem(@PathVariable("citemid")int citemid,@RequestParam("quantity") int quantity,HttpSession session,Model m)
	{
   Cart cart=(Cart)cartDAO.getCartItem(citemid);

int stock=productDAO.getProduct(cart.getProdid()).getQuantity();
cart.setQuantity(quantity);

cartDAO.updatecartitem(cart);
String username=(String)session.getAttribute("username");

List<Cart> list=cartDAO.getCartItem(username);
m.addAttribute("cartitems",list);
return "Cart";
	}
	
	
	@RequestMapping(value="/deletecartitem/${citemid }")
	public String deletecartitem(@PathVariable("citemid")int citemid,@RequestParam("quantity") int quantity,HttpSession session,Model m)
	{
Cart cart=(Cart)cartDAO.getCartItem(citemid);
cartDAO.deletecartitem(cart);
String username=(String)session.getAttribute("username");
List<Cart> list=cartDAO.getCartItem(username);
m.addAttribute("cartitems",list);
return "Cart";
}
}