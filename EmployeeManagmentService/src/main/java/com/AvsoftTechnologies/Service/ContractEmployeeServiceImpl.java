package com.AvsoftTechnologies.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AvsoftTechnologies.Entity.Employee;
import com.AvsoftTechnologies.Repository.EmployeeRepository;

@Service
public class ContractEmployeeServiceImpl implements  EmployeeService {

	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void saveEmployee(Employee employee) {
		Employee employee2 = employeeRepository.save(employee);
	}

	@Override
	public void delete(int id) {
		
		employeeRepository.deleteById(id);
	}

	@Override
	public Employee getEmployee(int id) {
		Optional<Employee> emp = employeeRepository.findById(id);
		
		if(emp.isPresent())
		{
			return emp.get();
		}
		return null;
	}

}
