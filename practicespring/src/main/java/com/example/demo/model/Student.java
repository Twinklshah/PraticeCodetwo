package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    
	private Long id;
	private String Name;
	private Long Rollno;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
			
	public Long getRollno() {
		return Rollno;
	}
	public void setRollno(Long rollno) {
		Rollno = rollno;
	}

	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(Long id, String name, Long rollno) {
		super();
		this.id = id;
		Name = name;
		Rollno = rollno;
	}
	
	
	
	
	

}
