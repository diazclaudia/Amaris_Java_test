package com.example.dockerize.springbootapp.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {
	private int id;
	@JsonProperty("employee_name") 
	private String employeeName;
	@JsonProperty("employee_salary") 
	private int employeeSalary;
	@JsonProperty("employee_age") 
	private int employeeAge;
	@JsonProperty("profile_image") 
	private String profileImage;
	@JsonProperty("employee_anual_salary") 
	private float employeeAnualSalary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public int getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}
	public String getProfileImage() {
		return profileImage;
	}
	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}
	public float getEmployeeAnualSalary() {
		return employeeAnualSalary;
	}
	public void setEmployeeAnualSalary(float f) {
		this.employeeAnualSalary = f;
	}

	
}
