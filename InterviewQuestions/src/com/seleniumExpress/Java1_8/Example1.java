package com.seleniumExpress.Java1_8;

import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Example1 {

	public static void main(String[] args) {
		// if odd so it print o and if even so it print e

		List<Integer> numbers = Arrays.asList(1, 2, 4, 5, 6, 7, 8, 9);
		List<String> result = numbers.stream().map(num -> num % 2 == 0 ? "E" + num : "o" + num)
				.collect(Collectors.toList());
		// result.forEach(s->System.out.println(s));

		// Print summ of all Numbers;

		IntSummaryStatistics collect = numbers.stream().collect(Collectors.summarizingInt(Integer::intValue));
		/*
		 * System.out.println(collect.getSum()); System.out.println(collect.getMax());
		 * System.out.println(collect.getAverage());
		 */

		List<Integer> numbers1 = Arrays.asList(1, 10, 20, 30, 15);
		Double collect2 = numbers1.stream().map((n) -> n * n).filter((i) -> i > 100)
				.collect(Collectors.averagingInt(Integer::new));
		IntSummaryStatistics collect3 = numbers1.stream().map((n) -> n * n).filter((i) -> i > 100)
				.collect(Collectors.summarizingInt(Integer::new));
		System.out.println("Average" + collect2);
		System.out.println("Average" + collect3.getAverage());

		// Number starting with 2
		List<Integer> ilist = List.of(2, 21, 45, 201, 402, 23, 58, 69, 2222);

		List<String> collect4 = ilist.stream().map((i) -> Integer.toString(i)).filter((i) -> i.startsWith("2"))
				.collect(Collectors.toList());
		collect4.stream().map(i -> Integer.valueOf(i)).forEach(System.out::println);

		// find the duplicate number present in the list

		List<Integer> iduplicate = List.of(1, 11, 12, 20, 3, 1, 25, 12, 36, 45, 48, 20);

		Set<Integer> collect5 = iduplicate.stream().filter(e -> Collections.frequency(iduplicate, e) > 1)
				.collect(Collectors.toSet());
		System.out.println(collect5);
	}

}
