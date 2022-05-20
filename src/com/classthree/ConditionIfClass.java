package com.classthree;

public class ConditionIfClass {

	public static void main(String[] args) {
		//ConditionIfClass.checkNumberEvenOdd();
		ConditionIfClass.IfElseIfExample();
		int age=5;  
	    //checking the age  
	    if(age>18){  
	        System.out.print("Age is greater than 18");  
	    }else {
	    	System.out.println("Age is less than 18");
	    }
	}
	
	static void checkNumberEvenOdd() {
		 int number=3; 
		 
		 if(number%2==0){  
		        System.out.println("even number");  
		    }else{  
		        System.out.println("odd number");  
		    }  
	   }
	
	static void IfElseIfExample () {
		 int marks=615;  
	      
		    if(marks<50){  
		        System.out.println("fail");  
		    }  
		    else if(marks>=50 && marks<60){  
		        System.out.println("D grade");  
		    }  
		    else if(marks>=60 && marks<70){  
		        System.out.println("C grade");  
		    }  
		    else if(marks>=70 && marks<80){  
		        System.out.println("B grade");  
		    }  
		    else if(marks>=80 && marks<90){  
		        System.out.println("A grade");  
		    }else if(marks>=90 && marks<100){  
		        System.out.println("A+ grade");  
		    }else{  
		        System.out.println("Invalid!");  
		    }   
	}

}
