package com.classfour;

public class PrivateClass {
	
	  private int i = 10;
	 
	 private void sum() {
		 System.out.println("Sum");
	 }
	
	public static void main(String[] args) {
		PrivateClass pclass = new PrivateClass();
		System.out.println(pclass.i);
		pclass.sum();
	}

}

class Demo extends PrivateClass{
	
	PrivateClass pclass = new PrivateClass();
	void test() {
		//pclass.sum();
	}
}
