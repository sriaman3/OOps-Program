package com.aman;

public class DuplicateElement {

	public static void main(String[] args) {
		// Initialize array
		int[] arr = new int[] { 1, 2, 2, 4, 3, 7, 8, 8, 3 };
		System.out.println("Duplicate elements in given array: ");
		// Searches for duplicate element
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])  
					System.out.println(arr[j]);
			}
		}
		
	}

}
    //Armastrong Number. 153 = 1+125+1 = 153 

/*
 * for (int i = 0; i < arr.length; i++) { sum = sum + arr[i]; }
 * System.out.println("Sum of all the elements of an array: " + sum);
 */