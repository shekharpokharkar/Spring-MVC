package com.seleniumExpress;

import java.util.Scanner;

public class Remove_given_Character_from_String {

	public static void main(String[] args) {
		
		String str="nacre Software";
		
		/*
		 * String replaceAll = str.replaceAll("[^b-z]","");
		 * System.out.println("By Using Regular Expression:"+replaceAll);
		 */
		
		char ch='0';
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the character");
		ch=sc.next().charAt(0);
		
		String valueOf = String.valueOf(ch);
		
		int i=0;
		
		while(i <= str.length()-1)
		{
			if(str.charAt(i) == ch)
			{
		
				String replace = str.replace(valueOf, "");
		
				str=replace;
			}
			i++;
		}
		System.out.println(str);
	}

}
