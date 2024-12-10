package com.seleniumExpress.StaticVsInstance;

public class ChildStudent extends Student {
	static int a =10;
	int b =20;
	
	static
	{
		System.out.println("Child class static block");
		System.out.println("x"+x);
		System.out.println("a"+a);
	}

	
	public ChildStudent() {
		System.out.println("child class constructor");
	}

	{
		System.out.println("Child class Instance block");
		System.out.println("x"+x);
		System.out.println("y"+y);
		System.out.println("a"+a);
		System.out.println("b"+b);
	}

	public static void m1()
	{
		System.out.println("Child class static method");
	}
	
	public  void m2()
	{
		System.out.println("Child class Instance method");
	}
}
