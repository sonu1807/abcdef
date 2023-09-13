package com.swapping2numbers;

public class Transposematrix {
	public static void main(String[] args) {
		int original[][]= {{1,4,5},{5,4,3},{5,4,6}};
		
		int transpose[][]= new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				transpose[i][j]=original[j][i];
				}
	}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("array without transpose is:"+original[i][j]);
				
			}
			System.out.println();
			
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("array after transpose is:  "+transpose[i][j]);
				
			}
			System.out.println();
		}
		
		
		}
	}


