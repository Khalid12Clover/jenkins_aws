package com.javatechie.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class index {
	@RequestMapping("/Jenkins")
	public String welcome(HttpSession session) {
    	
		return "This Application is deployed using Jenkins Pipeline";
    }
	
	@GetMapping("/AWS")
	public String HelloAWS()
	{
		return "Integration of ECS and CloudFormation";
	}
}
