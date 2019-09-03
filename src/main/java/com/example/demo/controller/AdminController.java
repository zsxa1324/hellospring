package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

	@RequestMapping("/main")
	public String main() {
		
		System.out.println("작업 완료성공");
		
		
		return "main";
	}
	
	
}

