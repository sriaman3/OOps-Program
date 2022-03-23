package com.classtwo;

public class MethodClass {
	
	public static void main(String[] args) {
		
		MethodClass methodClass = new MethodClass();
		
		int total = MethodClass.add(10, 29);
		System.out.println(total);
		methodClass.sum(10, 20);
	}
	
	//Method having return type
	static int add(int a, int b) {
		int c = a+b;
		return c;
	}
	
	//Method having no return type
	  void sum(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}
}
