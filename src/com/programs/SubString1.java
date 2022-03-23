package com.programs;

public class SubString1 {

	public static void main(String[] args) {
		
		String str[] =  
			{  
			"Praveen Kumar",  
			"Yuvraj Singh",  
			"Harbhajan Singh",  
			"Gurjit Singh",  
			"Virat Kohli",  
			"Rohit Sharma",  
			"Sandeep Singh",  
			"Milkha Singh"  
			}; 
		
		String surName = "Singh";  
		int surNameSize = surName.length(); 
		
		for(int i=0;i<str.length;i++) {
			int len = str[i].length();
			String substr = str[i].substring(len-surNameSize);
			if(substr.equals(surName))  
		    {  
		        System.out.println(str[i]);  
		    }  
		}
		
	}

}
