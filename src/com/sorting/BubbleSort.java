package com.sorting;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int[] myArray = {20,35,-15,7,55,1,-22};
		
		for(int lastUnsortedIndex= myArray.length-1; lastUnsortedIndex>0; lastUnsortedIndex-- ) {
			
			for(int i=0; i<lastUnsortedIndex; i++) {
				
				if (myArray[i]>myArray[i+1]) {
					swap(myArray,i,i+1);
				}
			}
			
		}
		System.out.println("The sorted Array by using Bubble Sort");
		for(int i=0; i<myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		if (i==j) {
			return;
		}
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j]=temp;
	}

}
