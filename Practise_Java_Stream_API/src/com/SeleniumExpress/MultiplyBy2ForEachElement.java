package com.SeleniumExpress;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MultiplyBy2ForEachElement {

	public static void main(String[] args) {
	
		List<Integer> listOfInteger = List.of(11,12,13,14,15,16,17,18,19,20);
		List<Integer> listOfEvenInteger = listOfInteger.stream().map((i)->i*2).toList();
		listOfEvenInteger.forEach(s->System.out.println(s));
	}

}
