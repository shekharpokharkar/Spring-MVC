package com.seleniumExpress;

import java.util.HashSet;

public class HashMap {

	public static void main(String[] args) {
		
		
		/*
		 * HashSet<Integer> hset=new HashSet<>(); hset.add(102); hset.add(22);
		 * hset.add(55); hset.add(950); hset.add(540); hset.add(120); hset.add(120);
		 * hset.add(120);
		 * 
		 * System.out.println(hset);
		 */
		HashSet<Student> hset=new HashSet<>();
		
		hset.add(new Student(101, "shekhar",952l)); 
		hset.add(new Student(540, "zheesahan",90l));
		hset.add(new Student(65, "sakore",94l)); 
		hset.add(new Student(10, "gomati",63l)); 
		hset.add(new Student(211, "polkha",54l)); 
		hset.add(new Student(85, "birajdar",33l)); 
		hset.add(new Student(20, "farukh",12l));
		hset.add(new Student(20, "farukh",12l));
		hset.add(new Student(20, "farukh",12l));
		
		hset.forEach(s->System.out.println(s));
	}
	

}
