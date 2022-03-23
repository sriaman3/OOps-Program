package com.classfour;

public class ThisExamples {

	public static void main(String[] args) {
		AB a=new AB("10"); 
	}

}

class AB {
	AB() {
		System.out.println("hello a");
	}

	AB(String x) {
		this();
		System.out.println(x);
		
	}
}