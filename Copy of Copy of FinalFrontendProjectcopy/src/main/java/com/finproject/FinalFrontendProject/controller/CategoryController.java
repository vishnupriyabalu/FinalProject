package com.finproject.FinalFrontendProject.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.finproj.Finprojbackend.dao.Category_dao;
import com.finproj.Finprojbackend.model.Category;
import com.finproj.Finprojbackend.model.Product;


@Controller
public class CategoryController 
{

	@Autowired
	Category_dao categoryDAO;
	
	@RequestMapping("/Category")
	public String showCategoryPage(Model m)
	{
		System.out.println("---Category Page Displaying-----");
		List<Category> list=categoryDAO.getCategoryDetails();
		m.addAttribute("catdetail",list);
		boolean flag=true;
		m.addAttribute("flag",flag);
		return "Category";
	}
	
	@RequestMapping(value="/AddCategory",method=RequestMethod.POST)
	public String addCategory(@RequestParam("catname") String catname,@RequestParam("catdesc") String catdesc,Model m)
	{
		System.out.println("---Add Category Starting-----");
		
		System.out.println(catname+":::"+catdesc);
		
		Category category=new Category();
		category.setCatname(catname);
		category.setCatdesc(catdesc);
		
		categoryDAO.insertUpdateCategory(category);
		List<Category> list=categoryDAO.getCategoryDetails();
		m.addAttribute("catdetail",list);
		boolean flag=false;
		m.addAttribute("flag",flag);
		
		System.out.println("---Category Added----");
		return "redirect:/Category";
	}
	@RequestMapping(value="/deletecategory/{catid}")
	public String deletecategory(@PathVariable("catid")int catid,Model m)
	{
		System.out.println("-------------category delete----------");
		Category category=categoryDAO.getCategory(catid);
		categoryDAO.deleteCategory(category);
		List<Category> list=categoryDAO.getCategoryDetails();
		m.addAttribute("catdetail",list);
		boolean flag=false;
		m.addAttribute("flag",flag);
	
		return "redirect:/Category";
	}
	@RequestMapping(value="/updatecategory/{catid}")
	public String getUpdatecategory(@PathVariable("catid")int catid,Model m)
	{
		System.out.println("--------- getting category object to be updated----------");
		Category category=categoryDAO.getCategory(catid);
		categoryDAO.deleteCategory(category);
		m.addAttribute("category",category);
		List<Category> list=categoryDAO.getCategoryDetails();
		m.addAttribute("catdetail",list);
		boolean flag=true;
		m.addAttribute("flag", flag);
		return "Category";
	}
	@RequestMapping(value="/updatecategory",method=RequestMethod.POST)
	public String updateCategory(@RequestParam("catid") int catid,@RequestParam("catname") String catname,@RequestParam("catdesc") String catdesc,Model m)
	{
		
		
		
		
System.out.println("---Update Category Starting-----");
		
		System.out.println(catname+":::"+catdesc);
		
		Category category=new Category();
		category.setCatname(catname);
		category.setCatdesc(catdesc);
		
		categoryDAO.insertUpdateCategory(category);
		List<Category> list=categoryDAO.getCategoryDetails();
		m.addAttribute("catdetail",list);
		boolean flag=false;
		m.addAttribute("flag",flag);
		
		System.out.println("---Category Added----");
		return "redirect:/Category";

	}
	
}

