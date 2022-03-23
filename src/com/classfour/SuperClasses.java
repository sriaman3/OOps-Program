package com.classfour;

public class SuperClasses {

	public static void main(String[] args) {
		Dogs d = new Dogs();
		d.work();
	}

}

class Animals {
	void eat() {
		System.out.println("eating...");
	}
}

class Dogs extends Animals {
	void eat() {
		System.out.println("eating bread...");
	}

	void bark() {
		System.out.println("barking...");
	}

	void work() {
		super.eat();
		bark();
	}
}