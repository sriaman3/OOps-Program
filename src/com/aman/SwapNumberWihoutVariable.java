package com.aman;

public class SwapNumberWihoutVariable {

	public static void main(String[] args) {
		SwapNumberWihoutVariable.swapNumber();
	}

	
	static void swapNumber() {
		int a =5;
		int b=10;
		a=a+b; //15
		b=a-b; //5
		a=a-b;
	}
}
