package com.classseven;

public class SubStringClass {

	public static void main(String[] args) {
			SubStringClass.idexOfMethod();
		/*
		 * String s="SachinTendulkar"; System.out.println("Original String: " + s);
		 * System.out.println("Substring starting from index 6: "
		 * +s.substring(6));//Tendulkar
		 * System.out.println("Substring starting from index 0 to 6: "+s.substring(0,6))
		 * ; //Sachin
		 */	}
	
	static void charAtMethod() {
		String name="javatpoint";  
		char ch=name.charAt(9);//returns the char value at the 10th index  
		System.out.println(ch);  
	}
	
	static void idexOfMethod() {
		String name="javatpoint";  
		//int ch=name.indexOf('a',3);//returns exact index of the char value 
		int ch = name.indexOf("po", 1);
		System.out.println(ch);  
	}
	
	static void stringContainsMethod() {
		String name="what do you know about me";  
		System.out.println(name.contains("do you know"));  
		System.out.println(name.contains("about"));  
		System.out.println(name.contains("hello"));  
	}
	
	static void charArrayMethod() {
		String s1 = "Welcome to Javatpoint";  
        char[] ch = s1.toCharArray();  
        int len = ch.length;  
        System.out.println("Char Array length: " + len);  
        System.out.println("Char Array elements: ");  
        for (int i = 0; i < len; i++) {  
            System.out.println(ch[i]);  
        }  
	}
	
	static void trimMethod() {
		String s1="  hello string   ";  
		System.out.println(s1+"javatpoint");//without trim()  
		System.out.println(s1.trim()+"javatpoint");//with trim() 
	}
	
	static void splitMethod() {
		String s1="java string split method by javatpoint";  
		String[] words=s1.split("\\s");//splits the string based on whitespace 
		
		
		for(int i=0;i<words.length;i++) {
			//System.out.println(words[i]);
		}
		
		//using java foreach loop to print elements of string array  
		for(String w:words){  
			System.out.println(w);  
		}  
	}

}
