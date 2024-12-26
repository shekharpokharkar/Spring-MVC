package com.seleniumExpress;

import java.util.HashMap;
import java.util.Map;

public class Count_the_characters_digits_and_Special_Characters_from_the_given_String {

	public static void main(String[] args) {

		String str = "Nacre@123%";

		Map<String, Integer> cmap = new HashMap<>();
		cmap.put("Character", 0);
		cmap.put("digits", 0);
		cmap.put("SpecialCharacter", 0);
		int i = 0;


		while (i <= str.length() - 1) {

			if (Character.isDigit(str.charAt(i))) {

		
				cmap.put("digits", cmap.get("digits") + 1);

			} else if (Character.isLetter(str.charAt(i))) {


				cmap.put("Character", cmap.get("Character") + 1);

			} else {

			
				cmap.put("SpecialCharacter", cmap.get("SpecialCharacter") + 1);

			}
			i++;
		}

		 System.out.println(cmap);
		
		
	}

}
