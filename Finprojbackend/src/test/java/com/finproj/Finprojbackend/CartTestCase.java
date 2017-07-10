package com.finproj.Finprojbackend;

import java.util.List;

import org.eclipse.jdt.internal.compiler.classfmt.AnnotationMethodInfoWithAnnotations;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.finproj.Finprojbackend.dao.CartDAO;
import com.finproj.Finprojbackend.model.Cart;

public class CartTestCase {

	public static void main(String args[]){
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.finproj.Finprojbackend");
		context.refresh();
		
		CartDAO cartDAO=(CartDAO)context.getBean("cartDAO");
		Cart cart=new Cart();
		cart.setCartid(1001);
		cart.setProdid(3);
		cart.setProdname("glasspen");
		cart.setPrice(100);
		cart.setQuantity(2);
		cart.setStatus("N");
		cart.setUsername("hari");
		
		cartDAO.addtocart(cart);
		System.out.println("------Added to cart----");
		
		List<Cart> list=cartDAO.getCartItem("hari");
		for(Cart cart1:list)
		{
			System.out.println(cart1.getCartid()+":::");
			System.out.println(cart1.getProdid()+":::");
			System.out.println(cart1.getProdname()+":::");
			System.out.println(cart1.getPrice()+":::");
			System.out.println(cart1.getQuantity()+":::");
			
			
		}
	}
}
