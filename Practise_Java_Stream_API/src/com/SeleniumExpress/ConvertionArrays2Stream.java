package com.SeleniumExpress;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConvertionArrays2Stream {

	public static void main(String[] args) {
		
		Integer arr[]= {11,12,15,12,11,15,21,15,2,11,15};
		Stream<Integer> stream = Arrays.stream(arr);
		List<Integer> list = stream.distinct().toList();
		list.forEach(s->System.out.println(s));
		/*
		 * Stream<Integer> of = Stream.of(arr);
		 * 
		 * List<Integer> list = stream.sorted((a,b)->-a.compareTo(b)).toList();
		 * list.forEach(s->System.out.println(s)); // Integer integer =
		 * stream.max((a,b)->a.compareTo(b)).get(); //
		 * System.out.println("Max:"+integer); Integer integer2 =
		 * stream.min((a,b)->a.compareTo(b)).get();
		 * 
		 * System.out.println("Min:"+integer2);
		 */
		
	}

}
