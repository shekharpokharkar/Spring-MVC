package com.SeleniumExpress.Example2;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// How many employees are there in the organization?

		List<Employee> employeeList = Employee.getEmployeeList();
		// How many employees are there in the organization?
		long count = employeeList.stream().count();
		System.out.println("Total employees in the organization:" + count);

		// Sort the List of Employee objects based on salary in Ascending order
		Comparator<Employee> c = new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {

				double salary1 = e1.getSalary();
				double salary2 = e2.getSalary();

				if (salary1 < salary2) {
					return -1;
				} else if (salary1 > salary2) {
					return 1;
				}

				return 0;
			}
		};
		employeeList.stream().sorted(c).forEach(System.out::println);
		// How many male and female employees are there in the organization?

		Map<String, Long> collect = employeeList.stream()
				.collect(Collectors.groupingBy(e -> ((Employee) e).getGender(), Collectors.counting()));

		for (Entry<String, Long> x : collect.entrySet()) {
			System.out.println(x.getKey());
			System.out.println(x.getValue());
		}
//. How many employees are there in each department?

		Map<String, Long> collect2 = employeeList.stream()
				.collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.counting()));
		System.out.println(collect2);

		// Get the name of all the department
		System.out.println("********Get the name of all the department*********");
		// List<String> collect3 =
		// employeeList.stream().map(emp->emp.getDepartment()).distinct().collect(Collectors.toList());
		List<String> collect3 = employeeList.stream().map(emp -> emp.getDepartment()).collect(Collectors.toList());
		collect3.stream().distinct().forEach(System.out::println);

		// Find the average salary of the male and female employee

		System.out.println("********Find the average salary of the male and female employee*********");

		Map<String, Double> collect4 = employeeList.stream().collect(
				Collectors.groupingBy(emp -> emp.getGender(), Collectors.averagingDouble(emp -> emp.getSalary())));

		System.out.println(collect4);

		// . Fetch the highest-paid male and female employee
		System.out.println("*****Fetch the highest-paid male and female employee*******");

		Comparator<Employee> c1 = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				Double s1 = o1.getSalary();
				Double s2 = o2.getSalary();

				return s1.compareTo(s2);
			}
		};
		Map<String, Optional<Employee>> collect5 = employeeList.stream()
				.collect(Collectors.groupingBy(emp -> emp.getGender(), Collectors.maxBy(c1)));

		for (Entry<String, Optional<Employee>> x : collect5.entrySet()) {
			String key = x.getKey();
			Optional<Employee> value = x.getValue();
			System.out.println(key + "=" + value.get().getSalary());
		}

		// Fetch the lowest-paid male and female employee

		System.out.println("*****Fetch the lowest-paid male and female employee*******");

		Comparator<Employee> c2 = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				Double s1 = o1.getSalary();
				Double s2 = o2.getSalary();

				return s1.compareTo(s2);
			}
		};
		Map<String, Optional<Employee>> collect6 = employeeList.stream()
				.collect(Collectors.groupingBy(emp -> emp.getGender(), Collectors.minBy(c2)));

		for (Entry<String, Optional<Employee>> x : collect6.entrySet()) {
			String key = x.getKey();
			Optional<Employee> value = x.getValue();
			System.out.println(key + "=" + value.get().getSalary());
		}

		// Get the highest-paid employee in each department

		System.out.println("*****Get the highest-paid employee in each department******");

		Map<String, Optional<Employee>> collect7 = employeeList.stream()
				.collect(Collectors.groupingBy(emp -> emp.getDepartment(), Collectors.maxBy(c1)));

		for (Entry<String, Optional<Employee>> x : collect7.entrySet()) {
			String key = x.getKey();
			Optional<Employee> value = x.getValue();
			System.out.println(key + "=" + value.get().getSalary());
		}

		// Get the details of the highest paid employee in the organization?

		System.out.println("*****Get the details of the highest paid employee in the organization******");

		Optional<Employee> max = employeeList.stream().max(c);
		System.out.println(max.get());

		// Find the average salary of each department?
		System.out.println("***** Find the average salary of each department******");

		Map<String, Double> collect8 = employeeList.stream().collect(
				Collectors.groupingBy(emp -> emp.getDepartment(), Collectors.averagingDouble(emp -> emp.getSalary())));
		for (Entry<String, Double> x : collect8.entrySet()) {
			String key = x.getKey();
			Double value = x.getValue();
			System.out.println(key + "=" + value);
		}

		// Get the details of the youngest male employee in the product development
		// department?

		System.out.println(
				"*****Get the details of the youngest male employee in the product development department*****");

		Comparator<Employee> c3 = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				Integer a1 = o1.getAge();
				Integer a2 = o2.getAge();
				return a1.compareTo(a2);
			}
		};

		Optional<Employee> e = employeeList.stream()
				.filter(emp -> (emp.getDepartment().equalsIgnoreCase("Product Development")
						&& emp.getGender().equalsIgnoreCase("Male")))
				.min(c3);
		System.out.println(e.get());
		// Who has the most working experience in the organization?
		System.out.println("*****Who has the most working experience in the organization*****");

		Comparator<Employee> c4 = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				Integer a1 = o1.getYearOfJoining();
				Integer a2 = o2.getYearOfJoining();
				return -a1.compareTo(a2);
			}
		};

		Optional<Employee> max2 = employeeList.stream().max(c4);
		System.out.println(max2.get());
//What is the average salary and total salary of the whole organization?
		DoubleSummaryStatistics collect9 = employeeList.stream()
				.collect(Collectors.summarizingDouble(emp -> emp.getSalary()));
		System.out.println("Avg:" + collect9.getAverage());
		System.out.println("Max:" + collect9.getMax());
		System.out.println("Min:" + collect9.getMin());
		System.out.println("Sum:" + collect9.getSum());
		System.out.println("Count:" + collect9.getCount());
// Separate the employees who are younger or equal to 30 years from those older than 30 years.

		Map<Boolean, List<Employee>> collect10 = employeeList.stream()
				.collect(Collectors.partitioningBy(emp -> emp.getAge() > 30));

		for (Entry<Boolean, List<Employee>> x : collect10.entrySet()) {
			
			if(x.getKey().equals(true))
			{
				System.out.println("===============Greter than 30 years=============== ");
				x.getValue().forEach(System.out::println);
			}
			else if(x.getKey().equals(false))
			{System.out.println("===============less than 30 years=============== ");
			
				x.getValue().forEach(System.out::println);
			}
		}

		
		//
		
		Map<Integer, String> collect11 = employeeList.stream().collect(Collectors.toMap(Employee::getId,Employee::getName));
		System.out.println(collect11);
	
	
	}
	
	

}
