package com.finproject.FinalFrontendProject.controller;

import java.util.LinkedHashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.finproj.Finprojbackend.dao.Supplier_DAO;
import com.finproj.Finprojbackend.model.Supplier;


@Controller
public class SupplierController 
{
	@Autowired
	Supplier_DAO supplierDAO;
	
	@RequestMapping("/abc")
	public String showSupplier(Model m)
	{
		
		
		Supplier supplier=new Supplier();
		m.addAttribute("suplist",this.getSupList());
		m.addAttribute("supplier",supplier);
		
		List<Supplier> suplist=supplierDAO.getSupplierDetails();
		m.addAttribute("suplist",suplist);
		
		
		return "Supplier";
	}
	
	@RequestMapping(value="/InsertSupplier",method=RequestMethod.POST)
	public String insertSupplier(@ModelAttribute("supplier") Supplier supplier,Model m)
	{
		System.out.println("---Supplier Inserted---");
		supplierDAO.insertUpdateSupplier(supplier);	
		
		List<Supplier> suplist=supplierDAO.getSupplierDetails();
		m.addAttribute("suplist",suplist);
		
		return "Supplier";
	}
	
	@RequestMapping(value="/updateSupplier/{supid}")
	public String updateSupplier(@PathVariable("supid")int supid,Model m)
	{
		
		Supplier supplier=supplierDAO.getSupplier(supid);
		m.addAttribute("supplier",supplier);
		m.addAttribute("suplist",this.getSupList());
		List<Supplier> suplist=supplierDAO.getSupplierDetails();
		m.addAttribute("suplist",suplist);
		
		return "Supplier";
	}
	
	@RequestMapping(value="/deleteSupplier/{supid}")
	public String deleteSupplier(@PathVariable("supid")int supid,Model m)
	{
		
		Supplier supplier=supplierDAO.getSupplier(supid);
		supplierDAO.deleteSupplier(supplier);
		
		Supplier supplier1=new Supplier();
		m.addAttribute("supplier",supplier1);
		m.addAttribute("suplist",this.getSupList());
		List<Supplier> suplist=supplierDAO.getSupplierDetails();
		m.addAttribute("suplist",suplist);
		
		return "Supplier";
	}
	
	public LinkedHashMap<Integer,String> getSupList()
	{
		List<Supplier> list=supplierDAO.getSupplierDetails();
		
		LinkedHashMap<Integer,String> suplist=new LinkedHashMap<Integer,String>();
		
		for(Supplier sup:list)
		{
			suplist.put(sup.getSupid(),sup.getSupname());
		}
		
		return suplist;
	}
	
	
	
	
}
