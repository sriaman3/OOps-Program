package com.classfive;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist   
		
	      list.add("Mango");//Adding object in arraylist    
	      list.add("Apple");    
	      list.add("Banana");    
	      list.add("Grapes");  
	      
	      //Printing the arraylist object   
	      System.out.println(list); 
	      System.out.println(list.get(3));
	      
	      for(int i=1;i<list.size();i++) {
	    	 if(i==1) {
	    		 System.out.println(list.get(i));
	    	 }
	      }
	}

}
