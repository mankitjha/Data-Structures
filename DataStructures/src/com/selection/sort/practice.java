package com.selection.sort;

public class practice {

	public static void main(String[] args) {
		
		int[] arr = {20,-25,10,4,44};
	
		for(int unsortedPartitionIndex=arr.length-1;unsortedPartitionIndex>0;unsortedPartitionIndex--) {
			
			int position =0;
			for(int index=1;index<=unsortedPartitionIndex;index++) {
				
				if(arr[index]>arr[position]) {
					position = index;
				}
			}
			swap(arr,position,unsortedPartitionIndex);
		}
		
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public static void swap(int[] array, int i,int j) {
		int temp;
		temp=array[i];
		array[i]=array[j];
		array[j]= temp;
	}

}
