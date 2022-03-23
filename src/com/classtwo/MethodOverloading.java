package com.classtwo;

public class MethodOverloading {
	
	public static void main(String args[]) {
		System.out.println(ChangingArgument.add(11,11));  
		System.out.println(ChangingArgument.add(11,11,11));
		
		System.out.println(ChangingDataType.add(11,11));  
		System.out.println(ChangingDataType.add(12.3,12.6));
	}

}

class ChangingArgument{  
static int add(int a,int b){
	return a+b;
	}  
static int add(int a,int b,int c){
	return a+b+c;
	}  
}  

class ChangingDataType{  
static int add(int a, int b){
	return a+b;
	}  
static double add(double a, double b){
	return a+b;
	}  
}  

class Adder{  
static int add(int a,int b){
	return a+b;
	}  
static double add1(int a,int b){
	return a+b;
	}  
}  