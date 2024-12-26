package com.AvsoftTechnologies.Service;

import com.AvsoftTechnologies.Entity.Employee;

public interface EmployeeService {

	public void saveEmployee(Employee employee);

	public void delete(int id);

	public Employee getEmployee(int id);

}
