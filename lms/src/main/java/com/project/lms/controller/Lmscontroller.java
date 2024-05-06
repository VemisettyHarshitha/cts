package com.project.lms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Lmscontroller {
	@GetMapping("/")
	public String login() {
		return "login";
	}
	@GetMapping("/validate1")
	public String validate1(@RequestParam("employeeId") String lid,
			@RequestParam("password") String pwd ) {
		if (lid.equals("harshi")&& pwd.equals("1234")) 
			return "valid";
		else
			return "invalid";
		
		
	}

}
