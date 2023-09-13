package com.swapping2numbers;

import java.util.Scanner;

public class palindrome {


	
		public static void main(String[] args) {
			
			Scanner s1=new Scanner(System.in);
			System.out.println("enter a number");
			
			
			int num=s1.nextInt();


		int temp=num;
		int rev=0;
		
		
		while(num>0) {
			
			int digit=num%10;
			rev=rev*10+digit;
			num/=10;
			
		}
		
		if(temp==rev) {
			
			System.out.println(temp+  " number is palindrome");
		}
		else {
			System.out.println(temp + "number is not palindrome");
			
		}
		
}
}
