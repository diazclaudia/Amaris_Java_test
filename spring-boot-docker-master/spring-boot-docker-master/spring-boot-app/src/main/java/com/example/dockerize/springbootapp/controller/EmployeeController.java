package com.example.dockerize.springbootapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.dockerize.springbootapp.domain.*;
import com.example.dockerize.springbootapp.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
	      this.employeeService = employeeService;
	}
	
	@RequestMapping("/ping")
	@ResponseBody
	private String ping() {
		return "pong";
	}
	
	@RequestMapping("/employee/{id}")
	@ResponseBody
	private Employee getEmployee(@PathVariable String id) {
		return employeeService.getEmployee(id);
	}
	
	@RequestMapping("/employees")
	@ResponseBody
	private Employees getEmployees() {
		return employeeService.getEmployees();
	}
	
}
