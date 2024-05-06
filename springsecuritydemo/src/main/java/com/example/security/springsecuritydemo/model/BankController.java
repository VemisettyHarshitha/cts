package com.example.security.springsecuritydemo.model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
public class BankController {
	
	@GetMapping("/")
	public String test() {
		return "welcome to bank application";
	}
	@GetMapping("/info")
	public String info() {
		return "General Banking Application";
	}
	@GetMapping("/user")
	public String userDetails() {
		return "user details are displayed";
	}
	@GetMapping("/admin")
	public String adminDetails() {
		return "admin details are displayed";
	}
	@GetMapping("/update")
	public String updateDetails() {
		return "updated details are displayed";
	}
	@GetMapping("/delete")
	public String deleteDetails() {
		return "deleted details are displayed";
	}
	@GetMapping("/balance")
	public String balanceDetails() {
		return "balance details are displayed";
	}
	

}
