package com.classfour;

public class FinalClasses extends Bike {

	void run() {
		System.out.println("running safely with 100kmph");
	}

	public static void main(String[] args) {
		FinalClasses honda = new FinalClasses();
		honda.run();
	}

}

 class Bike {
	 void run() {
		System.out.println("running");
	}
}