package com.finproj.Finprojbackend;
import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.finproj.Finprojbackend.dao.ProductDAO;
import com.finproj.Finprojbackend.model.Product;

public class ProductTestCase {
	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.finproj.Finprojbackend");
		
		context.refresh();
		
		// Inserting a Category Object.
		ProductDAO productDAO=(ProductDAO)context.getBean("productDAO");
		
		//Insertion TestCase
		
		Product product=new Product();
		product.setProdname("glasspen");
		product.setProddesc("expensive");
		product.setSupid(8);
		product.setQuantity(3);
		product.setPrice(100);
		product.setCatid(6);
		
		productDAO.insertUpdateProduct(product);		
		System.out.println("Product Inserted");
		
		
	}
}
