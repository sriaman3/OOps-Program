package com.programs;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {

	public static void main(String[] args) {
		
		//Eg-1
		IntStream.range(1, 10).forEach(System.out::print);
		System.out.println();
		
		//Eg-2
		IntStream.range(1, 10).skip(4).forEach(x -> System.out.println(x));
		System.out.println();
		
		//Eg-3
		System.out.println(IntStream.range(1, 10).sum());
		System.out.println();
		
		//Eg-4
		Stream.of("Aman","Abshu","Vishnu").sorted().findFirst().ifPresent(System.out::print);
		
		//Eg-5
		//String[] names = ["Aman"];
	}

}
