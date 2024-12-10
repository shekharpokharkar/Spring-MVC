package com.seleniumExpress.Comparable_Comparator;

import java.util.Comparator;

public class StudentName implements Comparator<Student>{

	@Override
	public int compare(Student stu1, Student stu2) {
		
		
		return stu1.getsName().compareTo(stu2.getsName());
	}

}
