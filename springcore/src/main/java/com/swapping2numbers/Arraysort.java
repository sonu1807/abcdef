package com.swapping2numbers;

public class Arraysort {
	public static void main(String[] args) {
		int temp=0;
		
		int arr[] = {50,54,76,30,77};
		System.out.println("array elements before sorting");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				}
				
				
				System.out.println("arrays after sorting"+arr[i]);
				
						
			}
			
		}
				
		
	}


