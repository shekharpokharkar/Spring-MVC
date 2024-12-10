package com.seleniumExpress;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.OptionalInt;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		
		Stream<Integer> stream = Stream.of(10,11,12,13,4,11,10,11,12,13,415,16);
		System.out.println("********************");
		/*
		 * IntStream intStream = stream.mapToInt(value->value.intValue()); int distinct
		 * = intStream.sum(); System.out.println(distinct);
		 */
		System.out.println("********************");
		IntSummaryStatistics summaryStatistics = stream.collect(Collectors.summarizingInt(value -> value));
		int max = summaryStatistics.getMax();
		System.out.println("max:"+max);
		System.out.println("********************");
		int arr[]=new int[] {10,11,12};
		IntStream stream2 = Arrays.stream(arr);
		OptionalInt max2 = stream2.max();
		int asInt = max2.getAsInt();
		System.out.println(asInt);
		System.out.println("********************");
		System.out.println("Available Processors:"+Runtime.getRuntime().availableProcessors());
	}
}
