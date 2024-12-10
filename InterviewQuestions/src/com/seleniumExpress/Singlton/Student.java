package com.seleniumExpress.Singlton;

public class Student {

	private int id;
	private String name;
	private static Student stu = null;

	private Student() {

	}

	public static Student getStudent() 
	{
		if (stu == null) {

			synchronized (Student.class) 
			{
				if (stu == null) 
				{
					stu = new Student();
				}
			}
		}
		return stu;
	}

}
