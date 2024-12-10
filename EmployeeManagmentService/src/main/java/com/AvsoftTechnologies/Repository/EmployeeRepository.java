package com.AvsoftTechnologies.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AvsoftTechnologies.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
