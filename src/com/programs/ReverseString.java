package com.programs;

public class ReverseString {
	
	public static void main(String args[]) {
		
		String  rev="";
		
		String str = "HelloJAva";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		System.out.print(rev);
	}

}

/*
 * int temp=num; 
 * while(num>0) 
 * { 
 * r=num%10; 
 * sum=(sum*10)+r; 
 * num=num/10; }
 */
