package com.aman;

public class Testing {
	
	public static void main(String args[]) {
		Testing testing = new Testing();
		testing.swapNumbers(10, 20);
	}
	
	void swapNumbers(int a, int b) {
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println(a + ":" + b);
	}
	
}
  



/*
 * int a =10; int b =20; int c;
 * 
 * a =20; b=10
 */