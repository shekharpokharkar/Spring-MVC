package com.AvsoftTechnologies.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.AvsoftTechnologies.Entity.Employee;
import com.AvsoftTechnologies.Service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService empservice;

	@PostMapping("/saveEmployee")
	public String saveEmployee(@RequestBody Employee employee) {
		
		if(employee.getType().equals("c"))
		{
			
		}
		else if(employee.getType().equals("p"))
		{
			
		}
		empservice.saveEmployee(employee);

		return "Employee Saved Sucessfully";

	}
}
