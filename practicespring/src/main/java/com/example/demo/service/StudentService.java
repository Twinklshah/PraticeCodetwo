package com.example.demo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
@Transactional
public class StudentService {
	 @Autowired
	 private StudentRepository studentRepository;
	 
	 public Student saveStudent(Student std) {
		 Student se=studentRepository.save(std);
		return se;
		 
	 }

}
