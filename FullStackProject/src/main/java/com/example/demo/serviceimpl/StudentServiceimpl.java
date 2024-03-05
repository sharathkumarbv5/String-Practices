package com.example.demo.serviceimpl;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
@Service
public abstract class StudentServiceimpl implements StudentService{
	@Autowired
	StudentRepository studentrepository;
	public List<Student> getStudent(){
		return studentrepository.findAll();
	}
	public Student getStudentByid(Integer id) {
		Optional<Student> student=studentrepository.findById(id);
		return student.orElse(null);
	}
	public Student getStudentByName(String name) {
		Optional<Student> student=studentrepository.findByName(name);
		return student.orElse(null);
	}
	public Student postStudent(Student student) {
		return studentrepository.save(student);
	}


	public String deletetStudent(int id) {
		Optional<Student> stu = studentrepository.findById(id);
		if(stu.isPresent()) {
		 studentrepository.deleteById(id);
		 return "deleted successfully";
		} else {
			 return "student with id "+ id+" not found !!";
		}
	}


	public Student updateStudent(Student student) throws Exception {
		
		Optional<Student> stu = studentrepository.findById(student.getId());
		if(stu.isPresent()) {
		Student updatedStudent = studentrepository.save(student);
		 return updatedStudent;
		} else {
			throw new Exception("student not found !!");
		}
	}



}
