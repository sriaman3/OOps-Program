package com.classseven;

public class ImmutableStringClass {

	public static void main(String[] args) {
		   String s="Sachin";  
		   s = s.concat(" Tendulkar");//concat() method appends the string at the end  
		   System.out.println(s);//will print Sachin because strings are immutable objects
	}

}
