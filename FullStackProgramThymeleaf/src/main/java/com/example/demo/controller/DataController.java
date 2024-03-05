package com.example.demo.controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
@RestController
public class DataController {
	@PostMapping("/data")
	public String acceptdata(@RequestParam String data)
	{
		return data;
	
	}
	
}
