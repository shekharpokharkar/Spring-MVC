package com.test2;

public class child extends Parent {
	
	public static int x=100;//0
	static//1
	{
		System.out.println("child class static block");
	}
	public int y=250;
	{
		System.out.println("child class instance block");
	}
	
	public static void m1()//2
	{
		System.out.println("child class static method");
		System.out.println(x);
	}
	public void m2()
	{
		System.out.println("child class instance method");
		System.err.println("x="+x+" "+"y="+y+Parent.i);
	}

}