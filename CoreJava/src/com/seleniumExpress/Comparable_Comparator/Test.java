package com.seleniumExpress.Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		/*
		 * TreeSet<Integer> tset=new TreeSet<>();
		 * 
		 * tset.add(102); tset.add(512); tset.add(952); tset.add(99);
		 * 
		 * System.out.println(tset);
		 */

		// TreeSet<Student> tset = new TreeSet<>();
		ArrayList<Student> tset = new ArrayList<Student>();
		Student s1 = new Student(121, "shekhar", 96363l);
		Student s2 = new Student(520, "sagar", 96363l);
		Student s3 = new Student(30, "akshay", 96363l);
		Student s4 = new Student(69, "zhagde", 96363l);
		Student s5 = new Student(201, "haidar", 96363l);

		tset.add(s1);
		tset.add(s2);
		tset.add(s3);
		tset.add(s4);
		tset.add(s5);

		Collections.sort(tset);

		tset.forEach(s -> System.out.println(s));
		Collections.sort(tset.reversed());
		System.out.println("============");
		tset.forEach(s -> System.out.println(s));
		System.out.println("============");
		Collections.sort(tset,new StudentName());
		tset.forEach(s -> System.out.println(s));
	}

}
