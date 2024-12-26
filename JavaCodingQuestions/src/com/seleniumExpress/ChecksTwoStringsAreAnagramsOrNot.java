package com.seleniumExpress;

import java.util.Arrays;

public class ChecksTwoStringsAreAnagramsOrNot {

	public static void main(String[] args) {

		// two strings are considered anagrams if they have the same characters with the
		// same frequency, but the order of the characters is different
		
		
		String str="geeks ";
		String str2="skeeg";
		
		String replace = str.replace("\\s", str);
		System.out.println(replace);
		
		if(str.length()!=str2.length()||str.length()>str2.length()||str.length()<str2.length())
		{
			System.out.println("Given string are not anagram");
		}
		str.trim();
		char[] strArr = str.toLowerCase().toCharArray();
		char[] strArr2 = str2.toLowerCase().toCharArray();
		
		Arrays.sort(strArr);
		Arrays.sort(strArr2);
		
		boolean equals = Arrays.equals(strArr, strArr2);
		System.out.println(equals);
		boolean flag=false;
		/*
		 *  for(int i=0;i<strArr.length;i++) {
		 * if(strArr[i]!=strArr2[i]) { flag=true; break; } }
		 */
		if(flag == true)
		{
			System.out.println("Given Both string are not anagram");
		}
		else
		{
			System.out.println("Given Both string are anagram");
		}
		
		
		}


}
