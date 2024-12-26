package com.seleniumExpress;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DuplicateOccuranceOfCharacter {

	public static void main(String[] args) {
		
		
		String str="jacvajjajjag";
		char[] charArray = str.toCharArray();
		
		Map<Character ,Integer>occure=new HashMap<>();
		for(Character str1:charArray)
		{
			if(!occure.containsKey(str1))
			{
				occure.put(str1, 1);
			}
			else
			{
				
				occure.put(str1, occure.get(str1)+1);
			}
			
	
		}
		
		System.out.println(occure);
		
//		System.out.println("Find the duplicate Occurance");
//		
//		 Iterator<String> iterator = occure.keySet().iterator();
//		
//		 while(iterator.hasNext())
//		 {
//			 String next = iterator.next();
//			 if(occure.get(next) > 1)
//			 {
//				 System.out.println(next);
//			 }
//		 }
		
	}

}
