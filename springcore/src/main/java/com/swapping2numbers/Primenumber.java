package com.swapping2numbers;
import java.util.Scanner;


public class Primenumber {
	public static void main(String[] args){
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the number");
		int num =s1.nextInt();
		
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
				
				
			}}
			if(count==2) {
				System.out.println("number is prime");
				
			}
			
			else {
				System.out.println("number is not prime");
				
			}
			
		}
				
		
		
	}
	


