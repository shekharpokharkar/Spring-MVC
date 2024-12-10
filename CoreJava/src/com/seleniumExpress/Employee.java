package com.seleniumExpress;

public class Employee {
	
	private static Employee emp;
	
	private int eid;
	private String ename;
	
	private Employee ()
	{
		super();
	}
	
	public static Employee getEmployee(int id,String name)
	{
	if(emp == null)
	{
		emp=new Employee();
		emp.eid=id;
		emp.ename=name;
	}
	return emp;
	}
	

}
