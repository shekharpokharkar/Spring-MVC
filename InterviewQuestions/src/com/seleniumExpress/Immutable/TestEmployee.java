package com.seleniumExpress.Immutable;

public class TestEmployee {

	public static void main(String[] args) {
		
		Company c=new Company("Solengy Power", 10);
		Employee emp=new Employee("sabar", 10,c);
		System.out.println(emp);
			emp.getCompany().setCompanyName("Aven");	
			System.out.println(emp);
			c.setCompanyName("abc");
			System.out.println(c);
			System.out.println(emp);
	}

}
