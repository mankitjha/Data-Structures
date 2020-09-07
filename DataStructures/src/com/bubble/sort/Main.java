package com.bubble.sort;

public class Main {
	
	public static void main(String[] args) {
		int[] values = {20,8,-15,10,5};
		
		// for loop to iterate through the array to bubble the bigger values at the end
		for(int unsortedPartitionIndex = values.length - 1; unsortedPartitionIndex > 0; unsortedPartitionIndex--) {
			
			// inner for loop to compare the values of (i)th index with (i+1)th index
			for( int index =0; index < unsortedPartitionIndex; index++) {
				if(values[index] > values[index+1]) {
					swap(values,index,index+1);
				}
			}
		}
		
		// for loop for printing the sorted array.
		for(int i =0;i<values.length;i++) {
			System.out.println(values[i]);
		}
	}
	
	// Method to swap the values.
	public static void swap(int[] array,int i, int j) {

			int temp=array[i];
			array[i]= array[j];
			array[j] = temp;
	}
}

