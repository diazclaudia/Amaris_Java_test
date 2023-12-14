package com.example.dockerize.springbootapp.dto;

import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

import com.example.dockerize.springbootapp.domain.*;

@Controller
public class EmployeeDTO {

	
	public Employee getEmployee(String id) {
		String uri = "https://dummy.restapiexample.com/api/v1/employee/"+id;
		
		RestTemplate restTemplate = new RestTemplate();
		
		Employee employee = restTemplate.getForObject(uri, Employee.class);
		
		return employee;
	}
	
	public Employees getEmployees() {
		String uri = "https://dummy.restapiexample.com/api/v1/employees";
		
		RestTemplate restTemplate = new RestTemplate();
		
		Employees employees = restTemplate.getForObject(uri, Employees.class);
	
		
		return employees;
	}
}
