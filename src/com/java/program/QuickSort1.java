package com.java.program;

import java.util.Arrays;

public class QuickSort1 {

	int A[];
	// Driver program to test above functions
	public static void main(String args[]) {
		// int arr[] = {1, 3, 9, 8, 2, 7, 5};
		int arr[] = { 10, 7, 8, 9, 1, 5 };
		// int arr[] = {1, 2, 3, 7, 2, 8, 5};
		int n = arr.length;
		// print unsorted array using Arrays.toString()
		System.out.print("Unsorted array: ");
		System.out.println(Arrays.toString(arr));

		QuickSort1 ob = new QuickSort1();
		ob.sort(arr, 0, n - 1);

		System.out.print("Sorted array: ");
		// print sorted array
		System.out.println(Arrays.toString(arr));
	}

	/*
	 * The main function that implements QuickSort arr[] --> array to be sorted,
	 * start --> Starting index, end --> Ending index
	 */
	void sort(int arr[], int start, int end) {
		this.A = arr;
		if (start < end) {
			/*
			 * pi is partitioning index, A[pi] is now at right place
			 */
			int p = partition(start, end);

			// Recursively sort elements left of pivot
			// and elements right of pivot
			sort(A, start, p - 1);
			sort(A, p + 1, end);
		}
	}

	/*
	 * In this function last element is chosen as pivot, then elements are
	 * arranged such that,all elements smaller than pivot are arranged to left
	 * of pivot and all greater elements to right of pivot
	 */

	int partition(int start, int end) {
		int pivot = A[end]; // choosing pivot element
		int pIndex = start; // Index of first element 0

		for (int i = start; i < end; i++) {
			/*
			 * If current element is smaller than or equal to pivot then
			 * exchange it with element at pIndex and increment the pIndex
			 */
			if (A[i] <= pivot) {
				// swap A[pIndex] and A[i]
				swap(pIndex, i);
				pIndex = pIndex + 1;
			}
		}
		// swap A[pIndex] and A[end] (or pivot)
		swap(pIndex, end);
		return pIndex;
	}
	
	// function two swap two numbers.
		// we will pass index of array to swap
		private void swap(int i, int j) {
			int temp = A[i];
			A[i] = A[j];
			A[j] = temp;
		}
}