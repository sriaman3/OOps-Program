package com.programs;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		try {
			int a[] = new int[5]; 
			a[5] = 30/0; //may throw an exception
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch (ArithmeticException e) {
			System.out.println(e);
		}catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Rest of the Codes");
		
	}

}
