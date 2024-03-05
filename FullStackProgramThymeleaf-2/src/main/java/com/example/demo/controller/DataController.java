package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DataController {
	@PostMapping("/data")
	public String acceptdata(@RequestParam String  a,@RequestParam double  b,@RequestParam double  c
			,@RequestParam double  d,@RequestParam double  e)
	{
		
		return "Hey!"+a+",Your Percentage is :"+((b+c+d+e)/4);
	
		}

}
