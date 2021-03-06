package com.example.SpringApplication2.entities;

public class Course {
	
	private long id;
	private String name;
	private String Department;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Course(long id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		Department = department;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", Department=" + Department + "]";
	}
	
	
	
	

}
