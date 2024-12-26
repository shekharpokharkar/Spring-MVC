package com.seleniumExpress.Singlton;

public class Test {

	public static void main(String[] args) {


		Employee emp=Employee.getEmployee();
		System.out.println(emp.hashCode());
		Employee emp1=Employee.getEmployee();
		System.out.println(emp1.hashCode());
	}

}
