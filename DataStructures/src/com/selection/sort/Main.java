package com.selection.sort;

public class Main {
		
	public static void main(String[] args) {
		
		int[] values = {20,8,-15,10,5};
		for(int unsortedPartitionIndex = values.length - 1; unsortedPartitionIndex > 0; unsortedPartitionIndex--) {
			
			int largest = 0;
			for(int i =1;i<=unsortedPartitionIndex;i++) {
				if(values[i] > values[largest]) {
					largest = i;
				}
			}
			swap(values,largest,unsortedPartitionIndex);
		}
		for(int i =0;i<values.length;i++) {
			System.out.println(values[i]);
		}
	}
	
	public static void swap(int[] array,int i, int j) {

		int temp=array[i];
		array[i]= array[j];
		array[j] = temp;
	}
}
