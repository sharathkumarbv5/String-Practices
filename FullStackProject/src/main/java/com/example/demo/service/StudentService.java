package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.List;

import com.example.demo.entity.Student;
@Service
public interface StudentService {
public List<Student> getStudent();
	public Student getStudentById(Integer id);
//	public Student getStudentByName(String name);



	public Student postStudent(Student student);

	public String deletetStudent(int id);
	public Student updateStudent(Student student) throws Exception;
	public Student getStudentByName(String name);
}


