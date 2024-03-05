package com.example.demo.contoller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
@RestController
public class StudentController {
	@Autowired
	 StudentService studentservice;
	@GetMapping(value="/val")
	public List<Student> getStudent() {
		return studentservice.getStudent();
	}
	@GetMapping(value="/val{id}")
	public Student getStudentById(@PathVariable Integer id) {
		return studentservice.getStudentById(id);
	}
	@GetMapping(value="/val1{name}")
	public Student getStudentByName(@PathVariable String name) {
		return studentservice.getStudentByName(name);
	}
	@PostMapping(value="/insert")
	public Student postStudent(@RequestBody Student student) {
		return studentservice.postStudent(student);
	}
	@DeleteMapping(value="/delete/{id}")
	public String deleteStudent(@PathVariable("id") int id) {
		return studentservice.deletetStudent(id);
	}
	@PutMapping(value="/update")
	public Student updateStudent(@RequestBody Student student) throws Exception {
		return studentservice.updateStudent(student);
	}
}