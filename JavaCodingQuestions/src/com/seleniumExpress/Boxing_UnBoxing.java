package com.seleniumExpress;

public class Boxing_UnBoxing {

	public static void main(String[] args) {

		// String to primitive
		String i = "10";
		int int1 = Integer.parseInt(i);
		System.out.println(int1);

		// String to Wrapper
		Integer valueOf2 = Integer.valueOf(i);
		System.out.println(valueOf2);

		// primitive to Wrapper
		int j = 20;
		Integer valueOf = Integer.valueOf(int1);
		System.out.println(valueOf);
		
		//primitive to String
		String valueOf3 = String.valueOf(j);
		System.out.println(valueOf3);

		// Wrapper to primitive
		Integer k = new Integer(30);
		int intValue = k.intValue();
		System.out.println(intValue);
		
		//Wrapper to String
		String string = k.toString();
		System.out.println(string);

	}

}
