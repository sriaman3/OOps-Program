package com.classfive;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]={{1,2,3},
					{2,4,5},
					{4,4,5}};  
		
		//printing 2D array  
		for(int i=0;i<3;i++){  // rows  i=0 j=1
		 for(int j=0;j<3;j++){  //printing the data
		   System.out.print(arr[i][j]+" ");  
		 }  
		 System.out.println();  
		}  
	}

}
