package com.swapping2numbers;
import java.util.Scanner;


public class Perfectnumber {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int sum=0;
		System.out.println("enter the number for perect square");
		int num=s1.nextInt();
		
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum+=i;
				
				
				}
			}
	
	if(sum==num) {
		System.out.println("number is a perfect number");
		
	}
	else {
		System.out.println("number is not a perfect number");
		
	}}}
	

	
	
	


