package com.example.dockerize.springbootapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dockerize.springbootapp.domain.*;
import com.example.dockerize.springbootapp.dto.*;
import com.example.dockerize.springbootapp.service.EmployeeService;

@Component
public class EmployeeService {
	@Autowired
	private EmployeeDTO employeeDTO;  
	
	public Employee getEmployee(String id) {	
		Employee employee = employeeDTO.getEmployee(id);
		employee.getData().setEmployeeAnualSalary(getSalary(employee.getData().getEmployeeSalary()));;
		return employee;
	}
	
	public Employees getEmployees() {
		Employees employees = employeeDTO.getEmployees();
		for (Data n : employees.getData()){
			n.setEmployeeAnualSalary(getSalary(n.getEmployeeSalary()));
		}
		return employees;
	}
	
	public float getSalary(float salary) {
		return (salary * 12);
	}

}
