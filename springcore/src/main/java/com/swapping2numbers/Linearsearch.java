package com.swapping2numbers;

public class Linearsearch {
	public static void main(String[] args) {
	
		int a[]= {50,65,54,38,67};
		
		int search_ele=54;
		boolean flag=false;
		for(int i=0;i<a.length;i++){
			
			if(search_ele==a[i])
			{
				System.out.println("element found at index:"+i);
				flag=true;
				break;
				
			}
				
			}
			if(!flag) {
			System.out.println("emement not found");
			
			
		}
			
		
		
		
	}
	}


