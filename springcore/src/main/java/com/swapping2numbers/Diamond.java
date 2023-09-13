package com.swapping2numbers;

public class Diamond { 
	public static void main(String[] args) {
		int n=1;
		for(int i=1;i<=11;i++) {
			for(int j=1;j<=n-1;j++) {
				System.out.print("  ");
				}
			for( int j=1;j<=2*i-1;j++) {
				System.out.print("*");
				}
			System.out.println();
		} 
		for(int i=1;i>=11;i--) {
			for(int j=1;j<=n-1;j++) {
				System.out.print("  ");
				}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
				}
			System.out.println();
			
		}
		
	}
	

}
