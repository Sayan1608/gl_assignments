package com.gl.sorting;

public class QuickSort {

	public void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int p_index = partition(arr, low, high);
			quickSort(arr, low, p_index - 1);
			quickSort(arr, p_index + 1, high);
		}
	}

	// Taking first element as pivot
	/*
	 * private int partition(int[] arr, int low, int high) { int pivot = arr[low];
	 * 
	 * int i = low; int j = high;
	 * 
	 * while (i < j) { while (i <= high && arr[i] <= pivot)
	 * 
	 * i++; while (j >= low && arr[j] > pivot)
	 * 
	 * j--;
	 * 
	 * if (i < j) { swap(arr, i, j); } } swap(arr, j, low); return j; }
	 */

	// Taking last element as pivot
	/*
	 * private int partition(int[] arr, int low, int high) { int pivot = arr[high];
	 * 
	 * int i = low; int j = high;
	 * 
	 * while (i < j) { while (i <= high && arr[i] < pivot)
	 * 
	 * i++; while (j >= low && arr[j] >= pivot)
	 * 
	 * j--;
	 * 
	 * if (i < j) { swap(arr, i, j); } } swap(arr, i, high); return i; }
	 */

	// Taking middle element as pivot
	private int partition(int[] arr, int low, int high) {
		int mid = (low + high) / 2;
		int pivot = arr[mid];

		int i = low;
		int j = high;

		while (i < j) {
			while (i <= high && arr[i] < pivot)

				i++;
			while (j >= low && arr[j] > pivot)

				j--;

			if (i < j) {
				swap(arr, i, j);
			}
		}
//		swap(arr, i, high);
		return j;
	}

	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public void print(int[] arr) {
		for (int e : arr) {
			System.out.print(e + " ");
		}
	}

	public static void main(String[] args) {
		QuickSort qs = new QuickSort();

		int[] arr = { 10, 9, 8, 7, 6, 5 };

		System.out.println("Before Quick Sort ::");
		qs.print(arr);
		System.out.println();
		System.out.println("After Quick Sort ::");
		qs.quickSort(arr, 0, arr.length - 1);
		qs.print(arr);
	}

}
