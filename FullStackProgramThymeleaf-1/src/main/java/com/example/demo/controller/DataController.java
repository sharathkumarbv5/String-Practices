package com.example.demo.controller;

//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DataController {
	@PostMapping("/data")
	public int acceptdata(@RequestParam int  a,@RequestParam int  b)
	{
		return (a+b);
	
		}

}
	

