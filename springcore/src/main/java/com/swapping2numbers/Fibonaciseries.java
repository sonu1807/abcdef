package com.swapping2numbers;
import java.util.Scanner;

public class Fibonaciseries {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int n1=0,n2=1,n3;
		System.out.println("enter the number of elements");
		int n=s1.nextInt();
		
		System.out.println(n1);
		System.out.println(n2);
		
		for(int i=1;i<=n;i++) {
			n3=n1+n2;
		System.out.println(n3);
			n1=n2;
			n2=n3;
			
			
		}
		
				
		
		
		
	}

}
