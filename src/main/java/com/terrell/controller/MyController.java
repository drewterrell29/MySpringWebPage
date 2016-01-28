package com.terrell.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class MyController {
	
@RequestMapping("/")
	
	public String hello() {
		return "Hello";
	}


	public int MyFavoriteNumber() {
		
		return 24;
	}
}
