package com.swapping2numbers;
public class Maxminarray {
	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50,60};
		int max=a[0],min=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
				
			}
		}
		System.out.println("maximun value of array is:"+max);


	for(int i=1;i<a.length;i++) {
		
	if(a[i]<min) {
			min=a[i];
			}
			}
	System.out.println("minimum array element is:"+min);
			}

}
