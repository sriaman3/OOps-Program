package com.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListSorting {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(1);
		al.add(-1);
		al.add(0);
		al.add(10);
		Collections.sort(al); //Default order for integer is ASC
		System.out.println(al);
		
		Collections.sort(al, new MyComparator()); // want order is DESC
		
		System.out.println(al);

	}
	
	
}


 class MyComparator implements Comparator<Integer> {
	 
	 // Comparator is an functional interface and it is having only one method i.e. called compare

	@Override
	public int compare(Integer o1, Integer o2) {
		return (o1>o2)?-1:(o1<o2)?1:0;
	}
	
}
