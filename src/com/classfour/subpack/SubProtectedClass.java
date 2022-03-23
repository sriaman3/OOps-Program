package com.classfour.subpack;

import com.classfour.ProtectedClass;

public class SubProtectedClass extends ProtectedClass{

	public static void main(String[] args) {
		
		SubProtectedClass pclass = new SubProtectedClass();
		System.out.println(pclass.i);
		pclass.sum();
	}

}
