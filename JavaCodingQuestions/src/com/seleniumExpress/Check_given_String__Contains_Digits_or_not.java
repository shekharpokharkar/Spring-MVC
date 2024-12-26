package com.seleniumExpress;

public class Check_given_String__Contains_Digits_or_not {

	public static void main(String[] args) {
		String str = "nacre@#12";
		int i = 0;
		boolean flag = false;

		while (i <= str.length() - 1) {

			if (Character.isDigit(str.charAt(i))) {
			
				flag=true;
				break;
			}
			i++;
		}

		if (flag==true) {
			System.out.println("Yes ! Given String Contains Digits");
		} else {
			System.out.println("Given String not contain Digits");
		}

	}

}
