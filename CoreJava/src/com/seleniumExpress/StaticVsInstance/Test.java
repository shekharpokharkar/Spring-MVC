package com.seleniumExpress.StaticVsInstance;

public class Test {
	
	static
	{
		System.out.println("Inside Static block");
		m1();
		Test t=new Test();
		t.m2();
	}
	
	public static void m1()
	{
		System.out.println("Inside Static Method");
	}
	
	public  void m2()
	{
		System.out.println("Inside Instance Method");
	}

	
	
}
