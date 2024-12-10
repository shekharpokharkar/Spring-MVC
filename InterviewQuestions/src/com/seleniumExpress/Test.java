package com.seleniumExpress;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {

		Manager s = new Manager();
		s.setmName("shadab");

		Bank axis = new Bank("Axis", s);
		System.out.println(axis);
		
		s.setmName("sp");
		System.out.println(axis);
		
		axis.getManager().setmName("Rohit");
		System.out.println(axis);
	}

}
