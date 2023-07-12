package com.git.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controllers {
	
	@GetMapping("/home")
	public String home() {
		return "Thsi is home page";
	}
	@GetMapping("/src")
	public String SRC() {
		return "Thsi is src page";
	}

}
