package com.classfive;

import java.util.ArrayList;

public class ArrayListIsEmpty {
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Is ArrayList Empty: " + al.isEmpty());
		System.out.println(!al.isEmpty());
		
		if(!al.isEmpty()) {
			al.add("Ravi");
			al.add("Vijay");
			al.add("Ajay");
		}
		System.out.println("After Insertion");
		System.out.println("Is ArrayList Empty: " + al.isEmpty());
	}
}