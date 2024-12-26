package com.SeleniumExpress.Example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		Employee E1 = new Employee("shekhar", 15000.00, "Pune", 1);
		Employee E2 = new Employee("Akshay", 25006.00, "satara", 2);
		Employee E3 = new Employee("Sanket", 2300.00, "Sangli", 3);
		Employee E4 = new Employee("Aman", 75896.00, "Kolhapur", 4);
		Employee E5 = new Employee("Rohan", 21001.00, "Patan", 5);
		Employee E6 = new Employee("Tushar", 96520.00, "Nashik", 6);
		Employee E7 = new Employee("magar", 55555.00, "satara", 7);
		Employee E8 = new Employee("atual", 1230.00, "Sangli", 8);
		Employee E9 = new Employee("Amol", 74850.00, "Kolhapur", 9);
		Employee E10 = new Employee("Rohini", 11520.00, "Patan", 10);
		Employee E11 = new Employee("Tulsiram", 1452.00, "Nashik", 11);

		List<Employee> empList = Arrays.asList(E1, E2, E3, E4, E5, E6,E7, E8, E9, E10, E11);
		/*
		 * Sort the emp based on salaries in descending order
		 */

		Comparator<Employee> c = ((a, b) -> {
			Double salary1 = a.geteSalary();
			Double salary2 = b.geteSalary();

			return -salary1.compareTo(salary2);
		});

		empList.stream().sorted(c).forEach(s -> System.out.println(s));

		System.out.println("**********************************");
		
		/*
		 * Top 3 Salaried Employee
		 */
		System.out.println("********* Top 3 Salaried Employee***********");
		
		empList.stream().sorted(c).limit(3).forEach(s -> System.out.println(s));
		System.out.println("**********************************");
		
		System.out.println("**All Employee Having salary less than 3rd highest Salary***");
		
		empList.stream().sorted(c).skip(3).forEach(s -> System.out.println(s));

		System.out.println("**********************************");
		System.out.println("***Group All Employee according to city**");
		Map<String, List<Employee>> collect = empList.stream().collect(Collectors.groupingBy(e->e.getCity()));

		for(Map.Entry<String, List<Employee>> x:collect.entrySet())
		{
			System.out.print(x.getKey()+"==");
			System.out.print(x.getValue());
			System.out.println();
		}

	
	}

}
