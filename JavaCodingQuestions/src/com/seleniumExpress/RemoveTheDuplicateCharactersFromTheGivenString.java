package com.seleniumExpress;

import java.util.Arrays;

public class RemoveTheDuplicateCharactersFromTheGivenString {

	public static void main(String[] args) {

		String str = "banaans";
		// Approch1
		StringBuilder sb = new StringBuilder();
		str.chars().distinct().forEach(c -> sb.append((char) c));
		System.out.println(sb);

		// Approch2
		StringBuilder sb1 = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);
			int indexOf = str.indexOf(charAt, i + 1);
			if (indexOf == -1) {
				sb1.append(charAt);
			}
		}
		System.out.println(sb1);

		// Approch3
		char[] charArray = str.toCharArray();

		Arrays.sort(charArray);
		System.out.println(charArray);
		int i = 0,j=0;
		boolean flag =false;
		while (i <= (charArray.length - 1)) {
		
			j=i+1;
			
			while(j<=(charArray.length - 1))
			{
				if(charArray[i] != charArray[j])
				{
					break;
					
				}
				charArray[j]='0';
				
				j++;
			}
			
			i++;
		}
		System.out.println(charArray);
		
	}

}
