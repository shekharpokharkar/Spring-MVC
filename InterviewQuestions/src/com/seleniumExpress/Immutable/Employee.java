package com.seleniumExpress.Immutable;

public final class Employee {

	private final String name;
	private final int empId;
	private final Company company;

	

	public Employee(String name, int empId, Company company) {

		this.name = name;
		this.empId = empId;
		this.company = new Company(company.getCompanyName(),company.getCompanySize());
	}

	public String getName() {
		return name;
	}

	public int getEmpId() {
		return empId;
	}

	public Company getCompany() {
		
		return new Company(company.getCompanyName(),company.getCompanySize()) ;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", company=" + company + "]";
	}

}
