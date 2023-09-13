package com.swapping2numbers;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
				
		int fact=1;
		System.out.println("enter the number for factorial");
		int num=s1.nextInt();
		
		for(int i=1;i<=num;i++) {
			fact*=i;
					
			
		}
		System.out.println("factorial of given number is:"+fact);
		
		
		
	}

}
