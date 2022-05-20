package com.classthree;

public class ForLoopClass {
	
	
	public static void main(String[] args) {
		ForLoopClass.pyramidExample();
		
		//which prints table of 1 
		for(int i=1;i<=10;i++){  
	        System.out.println(i*5);  
	    }  
	}
	
	
	static void pyramidExample() {
		for(int i=1;i<=5;i++){  //for row
			for(int j=1;j<=i;j++){   // for column           
			       System.out.print("* ");  
			 }  
			 	System.out.println();//new line  
			}  
	}   
}
