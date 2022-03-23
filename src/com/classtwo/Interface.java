package com.classtwo;

public class Interface implements Printable, Showable{
	
	public void print(){
		System.out.println("Hello");
		}  
	
	public static void main(String args[]){  
		Interface obj = new Interface();  
		obj.print();  
	 }  
}

interface Showable{  
void print();  
}  

interface Printable{  
void print();  
}  
  
  //Shape & Area
  //Circle & Rectangle