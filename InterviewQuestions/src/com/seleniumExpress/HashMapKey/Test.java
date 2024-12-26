package com.seleniumExpress.HashMapKey;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		
		FakeStudent fakeMutableStudent=new FakeStudent("Abhilash");
	
		Student stuObjImmutable = fakeMutableStudent;
		
		HashMap<Student,String> strMap=new HashMap<>();
		strMap.put(stuObjImmutable, "India");
		System.out.println("===="+strMap.get(stuObjImmutable));
		
		//Immutablitity is breaken
		
		fakeMutableStudent.setFakestudentName("priya");
		System.out.println(strMap.get(stuObjImmutable));
		
		
				

	}

}
