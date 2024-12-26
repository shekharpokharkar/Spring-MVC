package com.SeleniumExpress;

import java.util.Comparator;
import java.util.List;

public class SortFilterEvenNumber {

	public static void main(String[] args) {

		List<Integer> listOfInteger = List.of(101, 412, 130, 514, 105, 216, 1700, 118, 109, 220);
		/*
		 * Ascending Order
		 */
		List<Integer> listOfEvenIntegerAscendingOrder = listOfInteger.stream().sorted().toList();
		listOfEvenIntegerAscendingOrder.forEach(s -> System.out.println(s));
		System.out.println("*********************");
		/*
		 * dscending Order
		 */
		List<Integer> listOfIntegerDscendingOrder = listOfInteger.stream().sorted((a, b) -> (a < b) ? 1 : -1).toList();

		List<Integer> listOfIntegerDscendingOrder1 = listOfInteger.stream().sorted((a, b) -> -a.compareTo(b)).toList();

		List<Integer> listOfIntegerDscendingOrder2 = listOfInteger.stream().sorted(Comparator.reverseOrder()).toList();

		listOfIntegerDscendingOrder2.forEach(s -> System.out.println(s));
		/*
		 * Min & Max
		 */
		Comparator<Integer> c = (a, b) -> {
			return -a.compareTo(b);
		};

		Integer minNumber = listOfInteger.stream().min(c).get();

		System.out.println("Minimun Number is:"+minNumber);
		Comparator<Integer> c1 = (a, b) -> {
			return -a.compareTo(b);
		};

		Integer minNumber1 = listOfInteger.stream().max(c1).get();

		System.out.println("Minimun Number is:"+minNumber1);

	}

}
