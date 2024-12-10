package com.SeleniumExpress;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterEvenNumber {

	public static void main(String[] args) {
	
		List<Integer> listOfInteger = List.of(11,12,13,14,15,16,17,18,19,20);
		List<Integer> listOfEvenInteger = listOfInteger.stream().filter(i->(i % 2 ==0)).collect(Collectors.toList());
		listOfEvenInteger.forEach(s->System.out.println(s));
	}

}
