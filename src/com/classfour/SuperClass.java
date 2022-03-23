package com.classfour;

public class SuperClass {

	public static void main(String[] args) {
		Dog d=new Dog();  
		d.printColor();
	}

}

class Animal {
	String color = "white";
	
	public Animal() {
		
	}
}

class Dog extends Animal {
	String color = "black";
	
	public Dog() {
		super();
	}

	void printColor() {
		System.out.println(color);// prints color of Dog class
		System.out.println(super.color);// prints color of Animal class
		
	}
}