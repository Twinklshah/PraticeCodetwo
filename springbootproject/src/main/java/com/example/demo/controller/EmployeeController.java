package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController //so that spring boot understand this is rest controller
@RequestMapping("/employee")  //it is used to map the incoming request to the specific controller
public class EmployeeController {
	
	@Autowired EmployeeService employeeService;
	
	
	@PostMapping("/save-emp")
	public Employee saveEmp(@RequestBody Employee emp) {
		Employee e  = employeeService.saveEmployee(emp);
		return e;
		
	}
	

}
