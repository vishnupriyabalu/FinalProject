package com.finproj.Finprojbackend;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.finproj.Finprojbackend.dao.Category_dao;
import com.finproj.Finprojbackend.model.Category;
public class Categorytestcase {
	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.finproj.Finprojbackend");
		
		context.refresh();
	
		// Inserting a Category Object.
		Category_dao categoryDAO=(Category_dao)context.getBean("categoryDAO");
		
		//Insertion TestCase
		
		Category category=new Category();
		
		category.setCatname("WIFIMobile");
		category.setCatdesc("This Mobile is WIFI Enabled. You can Enjoy Internet");

		categoryDAO.insertUpdateCategory(category);		
		System.out.println("Category Inserted");
		
		//Retrieval TestCase
		
		/*Category category1=categoryDAO.getCategory(2);
		System.out.println("Category Name:"+category.getCatname());
		System.out.println("Category Description:"+category.getCatdesc());*/
		
		//Deletion TestCase
	/*	Category category=categoryDAO.getCategory(2);
		categoryDAO.deleteCategory(category);
		System.out.println("The Category Deleted");
		
		//Retrieving the Data
		
		List<Category> list=categoryDAO.getCategoryDetails();
		
		for(Category category2:list)
		{
			System.out.println(category2.getCatid()+":"+category2.getCatname()+":"+category2.getCatdesc());
		}
		
		//Update the Category
		Category category=categoryDAO.getCategory(3);
		category.setCatname("WifiEnMobile");
		categoryDAO.insertUpdateCategory(category);
		System.out.println("The Category Updated");
		*/

	
}
}
