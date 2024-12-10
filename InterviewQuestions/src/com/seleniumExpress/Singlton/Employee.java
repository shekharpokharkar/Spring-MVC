package com.seleniumExpress.Singlton;

public class Employee {

	private static Employee emp = null;

	private Employee() {

	}

	public static Employee getEmployee() {

		if(emp == null)
		{
			
		
		synchronized (Employee.class) {

			if (emp == null) {
				emp = new Employee();
			}
		}
		}
		return emp;
	}

}
