package com.classfive;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {

	public static void main(String[] args) {
		
		//Creating HashSet and adding elements  
		  HashSet<String> set=new HashSet<String>(); 
		  
		  set.add("Ravi");  
		  set.add("Vijay");  
		  set.add("Ravis");  
		  set.add("Ajay"); 
		  
		  //Traversing elements  
		  Iterator<String> itr=set.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
	}

}
