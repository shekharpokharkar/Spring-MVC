package com.seleniumExpress.StaticVsInstance;

public class Student {
	
	static int x =10;
	int y =20;
	
	static
	{
		System.out.println("Parent class static block");
		System.out.println("x"+x);
	}

	
	{
		System.out.println("Parent class Instance block");
		System.out.println("x"+x);
		System.out.println("y"+y);
	}

	public static void m1()
	{
		System.out.println("Parent class static method");
	}
	
	public  void m2()
	{
		System.out.println("Parent class Instance method");
	}

	public Student() {
		System.out.println("Parent class Constructor");
	}
	
	
}
