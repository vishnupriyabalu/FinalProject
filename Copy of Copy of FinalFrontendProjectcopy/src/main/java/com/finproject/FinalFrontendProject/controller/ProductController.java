package com.finproject.FinalFrontendProject.controller;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.LinkedHashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.finproj.Finprojbackend.dao.Category_dao;
import com.finproj.Finprojbackend.dao.ProductDAO;
import com.finproj.Finprojbackend.dao.Supplier_DAO;
import com.finproj.Finprojbackend.model.Category;
import com.finproj.Finprojbackend.model.Product;
import com.finproj.Finprojbackend.model.Supplier;

@Controller
public class ProductController 
{
	@Autowired
	Supplier_DAO supplierDAO;
	
	@Autowired
	Category_dao categoryDAO;
	

	@Autowired
	ProductDAO productDAO;
	
	public ProductController() {
	
		System.out.println("Product controller constructor called------------->");
	}
	
	@RequestMapping("/pro")
	public String showProduct(Model m)
	{
	System.out.println("inside show product page--------->");		
		Product product=new Product();
		
		m.addAttribute("catlist",this.getCatList());
		m.addAttribute("suplist",this.getSupList());
		m.addAttribute("product",product);
		
		List<Product> prodlist=productDAO.getProductDetails();
		m.addAttribute("prodlist",prodlist);
		
		
		return "Product";
	}
	
	@RequestMapping(value="/InsertProduct",method=RequestMethod.POST)
	public String insertProduct(@ModelAttribute("product") Product product, Model m,@RequestParam("pimage") MultipartFile filedet,BindingResult result) 

	{
		System.out.println("---Product Inserted---");
		productDAO.insertUpdateProduct(product);	
		System.out.println("------------images  storing started-----");
		
		String path="K:\\MyProject\\FinalFrontendProject\\src\\main\\webapp\\resources";
		String fileinfo=path+product.getProdid()+".jpg";
		File f=new File(fileinfo);
		if(!filedet.isEmpty())
		{
			try
			{
				byte buff[]=filedet.getBytes();
				FileOutputStream fos=new FileOutputStream(f);
				BufferedOutputStream bs=new BufferedOutputStream(fos);
				
				bs.write(buff);
			}
			catch(Exception e)
			{
				System.out.println("Exception arised");
			}
		}
		else
		{
		System.out.println("-----file uploading problem---");
		}
		System.out.println("----------images stored-----------");
		List<Product> prodlist=productDAO.getProductDetails();
		m.addAttribute("prodlist",prodlist);
		
		if(result.hasErrors())
		{
			return "Product";
		}
		return "Product";
	
	}

	
	@RequestMapping(value="/updateProduct/{prodid}")
	public String updateProduct(@PathVariable("prodid")int prodid,Model m)
	{
		
		Product product=productDAO.getProduct(prodid);
		m.addAttribute("product",product);
		m.addAttribute("catlist",this.getCatList());
		m.addAttribute("suplist",this.getSupList());
		List<Product> prodlist=productDAO.getProductDetails();
		m.addAttribute("prodlist",prodlist);
		
		return "redirect:/Product";
	}
	
	@RequestMapping(value="/deleteProduct/{prodid}")
	public String deleteProduct(@PathVariable("prodid")int prodid,Model m)
	{
		
		Product product=productDAO.getProduct(prodid);
		productDAO.deleteProduct(product);
		
		Product product1=new Product();
		m.addAttribute("product",product1);
		m.addAttribute("catlist",this.getCatList());
		m.addAttribute("suplist",this.getSupList());
		
		List<Product> prodlist=productDAO.getProductDetails();
		m.addAttribute("prodlist",prodlist);
		
		return "Product";
	}
	
	public LinkedHashMap<Integer,String> getCatList()
	{
		List<Category> list=categoryDAO.getCategoryDetails();
		
		LinkedHashMap<Integer,String> catlist=new LinkedHashMap<Integer,String>();
		
		for(Category cat:list)
		{
			catlist.put(cat.getCatid(),cat.getCatname());
		}
		
		return catlist;
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
	
	@RequestMapping(value="/displayProduct")
	public String displayProduct(Model m)
	{
		List<Product> prodlist=productDAO.getProductDetails();
		m.addAttribute("prodlist",prodlist);
		
		return "ProductPage";
	}
	@RequestMapping(value="/productdesc/{prodid}")
	public String showproductdesc(@PathVariable("prodid") int prodid,Model m)
	{
		Product product=productDAO.getProduct(prodid);
		m.addAttribute("prodinfo", product);
		return "Productdesc";
	}
	
}
