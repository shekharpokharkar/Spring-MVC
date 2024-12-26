package com.seleniumExpress;

import java.util.regex.Pattern;

public class Check_given_string_contains_Special_Characters_or_not {

	public static void main(String[] args) {
		String str = "nacre@#12";
		int i = 0;

		String replaceAll = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(replaceAll);

		boolean flag = Pattern.compile("[^a-zA-Z0-9]").matcher(str).find();

		if (flag == true) {
			System.out.println("Yes ! Given String Contains Special_Characters");
		} else {
			System.out.println("Given String not contain Special_Characters");
		}

	}

}
