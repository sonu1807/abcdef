package com.swapping2numbers;

import java.util.Scanner;

public class Reversenumber {
	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		int rem;
		System.out.println("enter the number");
		
		int num=s1.nextInt();
		int rev=0;
		while(num!=0)
		{
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		
				}
		System.out.println("reversed number is:" +rev);
		
		}

}
