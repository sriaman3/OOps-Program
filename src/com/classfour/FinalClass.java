package com.classfour;

public class FinalClass {

	public static void main(String[] args) {
		Bike9 obj = new Bike9();
		obj.run();
	}

}

class Bike9 {
	
	 int speedlimit = 90;// final variable

	void run() {
		speedlimit = 400;
		System.out.println(speedlimit);
	}
}