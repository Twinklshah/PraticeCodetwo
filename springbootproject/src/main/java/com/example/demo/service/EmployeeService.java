package com.example.demo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service  //this is here we are going to implement our business logic
@Transactional //once the data is persist in the database (it makes sure that the data is saved successfully)
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	
	public Employee saveEmployee(Employee emp) {
		Employee e =employeeRepository.save(emp);
		return e;
		
	}
	
	
	
	

}
