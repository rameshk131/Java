package com.java.program;

import java.util.Arrays;

public class QuickSort {
	
	//int A[];

	public static void main(String args[])    {
		
		QuickSort qs = new QuickSort();
        int arr[] = {10, 7, 8, 9, 1, 5};       
        qs.sort(arr,0,arr.length-1);        
        System.out.print("Sorted array: ");		
		System.out.println(Arrays.toString(arr));
       
    }
	
		
	void sort(int arr[], int start, int end) {		
		if (start < end) {			
			int p = partition(arr,start, end);		
			sort(arr, start, p - 1);
			sort(arr, p + 1, end);
		}
	}
	
	public  int partition(int arr[],int start,int end){
		
		int pivot = arr[end];
		int pIndex = start;
			
		for(int i = start ; i< end; i++){			
			if(arr[i] <= pivot){
				swap(arr,pIndex,i);
				pIndex = pIndex+1;
				
			}
		}		
		swap(arr,pIndex,end);		
		return pIndex;		
	}
	
	private void swap(int arr[],int i, int j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
	

}
