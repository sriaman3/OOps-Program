package com.classtwo;

public class AbstractClass {
	
	public static void main(String args[]){    
		    Santro santro = new Santro();
		    santro.numberOfGears();
		    
		    Alto alto = new Alto();
		    alto.numberOfGears();
		    alto.accelerate();
		    
	}
}

abstract class Car {
	   public void accelerate() {
	      System.out.println("Do something to accelerate");
	   }
	   public void applyBrakes() {
	      System.out.println("Do something to apply brakes");
	   }
	   public abstract void numberOfGears();
	}

class Alto extends Car {
	   public void numberOfGears() {
	      System.out.println("Implement changeGears() method for Alto Car");
	   }
	}
	class Santro extends Car {
	   public void numberOfGears() {
	      System.out.println("Implement changeGears() method for Santro Car");
	   }
	}  

 
