package com.seleniumExpress;

import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class reverse_Of_The_String {

	public static void main(String[] args) {

		String str = "Nacrej";

		// Reverse the string using Stream API
		String reversed = str.chars() // Create an IntStream
				.mapToObj(c -> (char) c) // Convert int to Character
				.collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
					Collections.reverse(list); // Reverse the list of characters
					return list.stream(); // Convert list back to stream
				})).map(String::valueOf) // Convert characters back to strings
				.collect(Collectors.joining()); // Join the characters into a single string
		System.out.println("Reversed String:" + reversed);

		System.out.println("=============================");

		String collect = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
					Collections.reverse(list);
					System.out.println(list);
					return list.stream();
				}

				)).map(c -> String.valueOf(c)).collect(Collectors.joining());

		System.out.println("collect:" + collect);

//Approch 2

		StringBuffer bf = new StringBuffer(str);
		StringBuffer reverse = bf.reverse();
		System.out.println("Revresed String :" + reverse);
//Approch 3

		char[] charArray = str.toCharArray();
		printArray(charArray);
		System.out.println("==============================");
		int i = 0, j = charArray.length - 1;
		while (i < j) {
			printArray(charArray);
			swap(i, j, charArray);
			i++;
			j--;
			System.out.println("**********************************");
		}

	}

	protected static void printArray(char[] charArray) {

		for (char c : charArray) {
			System.out.print(c + ",");
		}
		System.out.println();
	}

	private static void swap(int i, int j, char[] charArray) {

		char temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;

		System.out.println("i:" + i + " j:" + j);
		printArray(charArray);
	}

}
