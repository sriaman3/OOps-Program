package com.classfive;

public class ArrayClass {

	public static void main(String[] args) {
		
		ArrayClass.testArrayException();
		int a[]={33,3,4,5,8,9,10};//declaration, instantiation and initialization 
	
		System.out.println("lenght"+":"+a.length);
		
		//printing array  
		for(int i=0;i<a.length;i++){//length is the property of array  
			System.out.println(a[i]); 
		}
		
	}
		static void testArrayException() {
			int arr[]={50,60,70,80};
		
			for(int i=0;i<arr.length;i++){  
			System.out.println(arr[i]);  
			}  
		}
}



 