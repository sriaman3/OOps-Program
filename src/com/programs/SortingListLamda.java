package com.programs;

import java.util.ArrayList;
import java.util.Collections;

public class SortingListLamda {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(1);
		al.add(-1);
		al.add(0);
		al.add(10);
		
		Collections.sort(al,(i1,i2)->(i1>i2)?-1:(i1<i2)?1:0); 
		
		System.out.println(al);
		
		//Lamda expression return is optional, wherever we are using functional interface, we are allowed to use lamda expression
	}

}
