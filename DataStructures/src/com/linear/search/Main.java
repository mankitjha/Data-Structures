package com.linear.search;

public class Main {

	public static void main(String[] args) {
		
		int[] inputArray = {20,35,-15,7,55,1,-22};
		System.out.println(linearSearch(inputArray,20));
		System.out.println(linearSearch(inputArray,-22));
		System.out.println(linearSearch(inputArray,-15));
		System.out.println(linearSearch(inputArray,0));
	}
	
	public static int linearSearch(int [] inputArray,int value) {
		for(int i=0;i<inputArray.length;i++) {
			if(inputArray[i] == value) {
				return i;
			}
		}
		return -1;
	}
}
