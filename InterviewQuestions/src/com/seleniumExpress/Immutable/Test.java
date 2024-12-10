package com.seleniumExpress.Immutable;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<String> ehobbies = new ArrayList<>();
		ehobbies.add("Swimming");
		ehobbies.add("gymming");
		ehobbies.add("cycling");
		ehobbies.add("Ridding");

		EmployeeList emp = new EmployeeList(1, "shekhar", ehobbies);
		System.out.println(emp);
		System.out.println("==After get Method====");
		List<String> hobbies = emp.geteHobbies();
		hobbies.add("Reading");

		System.out.println(emp);
		System.out.println("===After Constructor===");
		ehobbies.add("Dancing");
		System.out.println(emp);
	}

}
