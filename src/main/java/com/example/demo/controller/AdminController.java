package com.example.demo.controller;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public class AdminController {

	@RequestMapping
	public String main() {
		
		
		
		
		return "main";
	}
	
	
}
