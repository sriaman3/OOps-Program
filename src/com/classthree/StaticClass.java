package com.classthree;

public class StaticClass {

	public static void main(String[] args) {

		/*
		 * Counter c1 = new Counter(); Counter c2 = new Counter(); Counter c3 = new
		 * Counter();
		 */

		
		  
		  Counter2 c1=new Counter2(); Counter2 c2=new Counter2(); Counter2 c3=new
		  Counter2();
		 

	}
}

// Without Static Variable
class Counter {
	int count = 0;// will get memory each time when the instance is created

	Counter() {
		count++;// incrementing value
		System.out.println(count);
	}
}

// With Static Variable
class Counter2 {
	static int count = 0;// will get memory only once and retain its value

	Counter2() {
		count++;// incrementing the value of static variable
		System.out.println(count);
	}
}
