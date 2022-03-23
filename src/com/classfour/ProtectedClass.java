package com.classfour;

public class ProtectedClass {
	
	protected int i = 10;
	 
	protected void sum() {
		 System.out.println("Sum");
	 }
	
	public static void main(String[] args) {
		ProtectedClass pclass = new ProtectedClass();
		System.out.println(pclass.i);
		pclass.sum();
	}
}


class DemoProtectClass extends ProtectedClass{
	
	ProtectedClass pclass = new ProtectedClass();
	void test() {
		pclass.sum();
	}
}