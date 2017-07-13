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
		/*
		Supplier supplier1=supplierDAO.getSupplier(2);
		System.out.println("Supplier Name:"+supplier.getSupname());
		System.out.println("Supplier Description:"+supplier.getSupdesc());
		
		//Deletion TestCase
		Supplier supplier=supplierDAO.getSupplier(2);
		supplierDAO.deleteSupplier(supplier);
		System.out.println("The Supplier Deleted");
		
		//Retrieving the Data
		
		List<Supplier> list=supplierDAO.getSupplierDetails();
		
		for(Supplier supplier:list)
		{
			System.out.println(supplier.getSupid()+":"+supplier.getSupname()+":"+supplier.getSupdesc());
		}
		
		//Update the Supplier
		Supplier supplier=supplierDAO.getSupplier(3);
		supplier.setSupname("WifiEnMobile");
		supplierDAO.insertUpdateCategory(supplier);
		System.out.println("The Supplier Updated");
		*/

	
}

}
