package com.classthree;

public class BreakClass {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
            // terminate loop when i is 5.
            if (i == 5) {
                break;
            }  
            System.out.println("i: " + i);
        }
        System.out.println("Loop complete.");

	}

}
