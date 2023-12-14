package com.example.dockerize.springbootapp;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.dockerize.springbootapp.service.*;

@SpringBootTest
class SpringBootAppApplicationTests {
	@Autowired
	private EmployeeService employeeService;
	
	@Test
	public void getSalary_Ok() {
		float salary = 100;
		float expected = 100*12;
	    float salaryAnual = employeeService.getSalary(salary);
	 
	     assertThat(salaryAnual).isEqualTo(expected);
	 }

}


