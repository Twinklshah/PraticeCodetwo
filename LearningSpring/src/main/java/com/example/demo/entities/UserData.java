package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="FirstTable")
@Entity
public class UserData {
	public UserData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserData(int id, String name, String city, String status) {
		super();
		this.id = id;
		this.name = name;
		City = city;
		this.status = status;
	}

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	
	private String name;
	
	private String City;
	
	private String status;

	@Override
	public String toString() {
		return "UserData [id=" + id + ", name=" + name + ", City=" + City + ", status=" + status + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
