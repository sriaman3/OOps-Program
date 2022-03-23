package com.classtwo;

public class Contructor {

	public static void main(String[] args) {
		
		GFG geek1 = new GFG(2, 1);
		
		GFG geek2 = new GFG();
		
		/*
		 * System.out.println("GeekName :" + geek1.name + " and GeekId :" + geek2.id);
		 */	}

}

class GFG {
	
    // data members of the class.
    String name;
    int id;
    
    GFG(){
    	System.out.println("I am non-parametrized constructor");
    }
 
    // Constructor would initialize data members
    // With the values of passed arguments while
    // Object of that class created
    GFG(int a, int b)
    {
        int c = a+b;
        System.out.println(c);
    }
}
