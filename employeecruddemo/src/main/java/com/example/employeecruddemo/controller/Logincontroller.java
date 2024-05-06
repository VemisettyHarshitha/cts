package com.example.employeecruddemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.employeecruddemo.Service.ProductService;
import com.example.employeecruddemo.model.Product;

@Controller
public class Logincontroller {
	@GetMapping("/")
	public String login() {
		return "login";
	}
	@GetMapping("/validate")
	public String validate(@RequestParam("loginid")String lid,
			@RequestParam("password")String pwd) {
		if(lid.equals("harshi")&& pwd.equals("1234")) 
			return "valid";
		else
			return "invalid";
	
		//return "validate";
	}
	
	@GetMapping("/add")
	public String add() {
		return "add";
	}
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/addData")
	public String addData(@RequestParam("pid")int id,
			@RequestParam("pname") String name,
			@RequestParam("price") int price,
			@RequestParam("quantity") int qty) {
		  Product product=new Product (id,name,price,qty);
			productService.addProduct(product);
		
		return "valid";
	}
	@GetMapping("/display")
	public String display(Model model) {
		List<Product> products=productService.getAllProducts();
		model.addAttribute("products",products);
		return "showProducts";
	}
	
	
	@GetMapping("/search")
	public String search() {
		return "search";
	}
	@GetMapping("/SearchProduct")
	public String SearchProduct(@RequestParam String pid, Model model) {
		//Product product= productService.getProductById(pid);
		List <Product> products =productService.searchProduct(pid);
		model.addAttribute("products",products);
		return "showProducts";
	}
	@GetMapping("/delete1")
	public String delete1() {
		
		return "delete1";
	}
	@GetMapping("/DeleteProduct")
	public String DeleteProduct(@RequestParam int pid, Model model) {
		productService.deleteById(pid);
		List<Product> products=productService.getAllProducts();
		model.addAttribute("products",products);
		return "showProducts";
	}
	@GetMapping("/logout")
	public String logout() {
		return "null";
	}
	@GetMapping("/back")
	public String back() {
		return "valid";
	}
	
	
}
