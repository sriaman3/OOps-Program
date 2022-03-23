package com.aman;

public class TestDemo {


	public static void main(String args[]){  
		Dog d=new Dog();  
		d.work(); 
	}
}  
class Dog extends TestSuper2{  
	void eat(){System.out.println("eating bread...");}  
	void bark(){System.out.println("barking...");}  
	void work(){  
		super.eat();  
		bark();  
	}  
}  
class TestSuper2{  
	void eat(){
		System.out.println("eating...");
	} 
}  
