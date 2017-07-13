package com.finproject.FinalFrontendProject.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.finproj.Finprojbackend.dao.CartDAO;
import com.finproj.Finprojbackend.dao.ProductDAO;
import com.finproj.Finprojbackend.model.Cart;

@Controller
public class OrderController {
@Autowired 
CartDAO cartDAO;
@Autowired
ProductDAO productDAO;
@RequestMapping("/checkout")
public String orderconfirm(HttpSession session,Model m)
{
	String username=(String)session.getAttribute("username");
	List<Cart> list=cartDAO.getCartItem(username);
	int grandtotal=0;
	for(Cart cart:list)
	{
		grandtotal=grandtotal+(cart.getQuantity()*cart.getPrice());
	}
	m.addAttribute("grandtotal", grandtotal);
	m.addAttribute("cartitems", list);
	return "Orderconfirm";
}
	}
