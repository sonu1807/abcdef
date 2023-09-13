package com.swapping2numbers;

public class Duplicateelements {
	public static void main(String[] args) {
		
		String arr[]= {"java","c++","python","c#","java","c++"};
		boolean flag=false;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].equals(arr[j]))
				{
					
		flag=true;
		System.out.println(" duplicate elements found are:"+   arr[i]);
		
		}
				
		
					
			}
			
			}
		if(!flag) {
			System.out.println("no duplicates elements found");
		}
		
	
		
	}
	

}
