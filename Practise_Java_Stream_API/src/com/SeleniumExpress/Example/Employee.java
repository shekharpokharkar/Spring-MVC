package com.SeleniumExpress.Example;

public class Employee {
	private String eName;
	private Double eSalary;
	private String city;
	private Integer eId;

	public Employee(String eName, Double eSalary, String city, Integer eId) {

		this.eName = eName;
		this.eSalary = eSalary;
		this.city = city;
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public double geteSalary() {
		return eSalary;
	}

	public void seteSalary(Double eSalary) {
		this.eSalary = eSalary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer geteId() {
		return eId;
	}

	public void seteId(Integer eId) {
		this.eId = eId;
	}

	@Override
	public String toString() {
		return "Employee [eName=" + eName + ", eSalary=" + eSalary + ", city=" + city + ", eId=" + eId + "]";
	}

}
