package com.aman;

import java.util.Scanner;

public class Variable {
	
	  
	public static void main(String[] args) {
		 
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter you name");
		
		String str = input.nextLine();
		
		System.out.println("My Name is" + str);
		
		input.close();

	}
	
}


