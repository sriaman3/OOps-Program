package com.programs;

public class LambdaProgram {

	public static void main(String[] args) {
		
		Interf i = (a)->{ 
			//System.out.println(a*a);  //Without return statement
			return a*a;
			};
		//i.m1(5);
		System.out.println(i.m1(5));
		i.m3();
		Interf.m2();
	}

}


interface Interf{
	
	//public void m1(int a, int b);
	
	public int m1(int a);
	//public void add(int a, int b, int c);  //This is not possible here in lambda expression. We cannot take 2 abstract method
	
	static void m2() {
		System.out.println("Aman");
	}
	
	default void m3() {
		System.out.println("Arpit");
	}
}
