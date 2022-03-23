package com.classseven;

public class StringComparision {

	public static void main(String[] args) {
		   
		StringComparision.stringConcat();
		/*
		 * String s1="Sachin"; String s2="Sachin"; String s3=new String("Sachin");
		 * String s4="Saurav"; System.out.println(s1.equals(s2));//true
		 * System.out.println(s1.equals(s3));//true
		 * System.out.println(s1.equals(s4));//false
		 */	}
	
	static void doubleEqualOperator() {
		   String s1="Sachin";  
		   String s2="Sachin";  
		   String s3=new String("Sachin");  
		   System.out.println(s1==s2);//true (because both refer to same instance)  
		   System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool) 
	}
	
	static void stringConcat() {
		   String s="Sachin"+" Tendulkar";  
		   System.out.println(s);//Sachin Tendulkar 
		   
		   String s1=50+30+"Sachin"+40+40;  
		   System.out.println(s1);
	}
		//Note: After a string literal, all the + will be treated as string concatenation operator.
}
