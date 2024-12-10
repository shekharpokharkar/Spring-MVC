package com.seleniumExpress.DifferentWaysObjectCreation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.seleniumExpress.Immutable.Company;

public class Test   {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		System.out.println("******By Using New instance Method of Class********");
		Company emp=(Company)Class.forName("com.seleniumExpress.Immutable.Company").newInstance();
		System.out.println(emp);
		
		System.out.println("******By Using New instance Method of Constructor Class********");
		
		Constructor<Company> comp = Company.class.getConstructor();
		Company company = comp.newInstance();
		System.out.println(company);
		
		System.out.println("******By Using Clone Method of Object Class********");
		
		
	}

}
