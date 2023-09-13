package com.swapping2numbers;

public class Reversestring {
	public static void main(String[] args) {
		String str="vansh verma";
		String rev= "";
		
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			
			
		}
		System.out.println("reversd string is:"+rev);
		
		
	}
	

}
