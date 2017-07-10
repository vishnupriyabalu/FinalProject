package com.finproj.Finprojbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.finproj.Finprojbackend.dao.Supplier_DAO;
import com.finproj.Finprojbackend.model.Supplier;


public class Supplier_testcase {
	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.finproj.Finprojbackend");
		
		context.refresh();
	
		// Inserting a Category Object.
		Supplier_DAO supplier_DAO=(Supplier_DAO)context.getBean("supplierDAO");
		
		//Insertion TestCase
		Supplier supplier=new Supplier();
		
		supplier.setSupname("annai");
		supplier.setSupaddrs("chidambarm");

		supplier_DAO.insertUpdateSupplier(supplier);		
		System.out.println("Supplier Inserted");
		
		//Retrieval TestCase
		
		/*Category category=categoryDAO.getCategory(2);
		System.out.println("Category Name:"+category.getCatname());
		System.out.println("Category Description:"+category.getCatdesc());*/
		
		//Deletion TestCase
		/*Category category=categoryDAO.getCategory(2);
		categoryDAO.deleteCategory(category);
		System.out.println("The Category Deleted");*/
		
		//Retrieving the Data
		
		/*List<Category> list=categoryDAO.getCategoryDetails();
		
		for(Category category:list)
		{
			System.out.println(category.getCatid()+":"+category.getCatname()+":"+category.getCatdesc());
		}*/
		
		//Update the Category
		/*Category category=categoryDAO.getCategory(3);
		category.setCatname("WifiEnMobile");
		categoryDAO.insertUpdateCategory(category);
		System.out.println("The Category Updated");*/
		

	
}

}
