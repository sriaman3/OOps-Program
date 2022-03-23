package com.classtwo;

public class Inheritance {
	public static void main(String args[]){  
	Dog d=new Dog();  
	d.bark();  
	d.eat(); 
	}
}

class Animal{  
	
	Animal(){
		System.out.println("This is the Animal Class");
	}
	void eat(){
		System.out.println("eating...");
	}  
}  
class Dog extends Animal{  
	void bark(){
		System.out.println("barking...");
		eat();
	}
}  