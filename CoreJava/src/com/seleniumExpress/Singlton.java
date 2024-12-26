package com.seleniumExpress;

public class Singlton {

	public static void main(String[] args) {
		
		Employee e = Employee.getEmployee(10,"shekhar");
		System.out.println(e.hashCode());
		Employee e1 = Employee.getEmployee(101,"shekhar");
		System.out.println(e1.hashCode());
	}
}
