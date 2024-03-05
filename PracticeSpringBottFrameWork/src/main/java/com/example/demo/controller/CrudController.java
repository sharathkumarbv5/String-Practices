package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Student;

@RestController
public class CrudController {
	@GetMapping(value="/val")
	public String Value() {
		return "hello";
	}
	@GetMapping(value="/path1")
	public int number() {
		return 29;
	}
	@GetMapping(value="/path2")
	public Student getStudent() {
		return new Student(11,"sharu");
	}
	@GetMapping(value="/path3")
	public Employee getEmployee() {
		return new Employee(01,"Employee-1");
	}
	

}
