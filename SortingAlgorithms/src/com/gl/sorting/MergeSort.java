package com.gl.sorting;

public class MergeSort {

	public void mergeSort(int[] arr, int left, int right) {

		if (left < right) {
			int mid = (left + right) / 2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}
	}

	private void merge(int[] arr, int left, int mid, int right) {

		int i = left;
		int j = mid + 1;
		int k = left;
		int[] temp = new int[arr.length];

		while (i <= mid && j <= right) {

			if (arr[i] >= arr[j]) {
				temp[k] = arr[j];

				j++;
			} else {
				temp[k] = arr[i];
				i++;
			}
			k++;

		}

		if (i > mid) {
			while (j <= right) {
				temp[k++] = arr[j++];
			}
		}

		if (j > right) {
			while (i <= mid) {
				temp[k++] = arr[i++];
			}
		}

		for (int z = left; z < k; z++) {
			arr[z] = temp[z];
		}
	}

	public void print(int[] arr) {
		for (int e : arr) {
			System.out.print(e + " ");
		}
	}

	public static void main(String[] args) {
		MergeSort ob = new MergeSort();
		int[] arr = { 100, 50, 22, 17, 18, 20 };
		System.out.println("Before Sorting ::\n ");
		ob.print(arr);
		ob.mergeSort(arr, 0, arr.length - 1);
		System.out.println("\n\nAfter Merge Sort ::\n ");
		ob.print(arr);

	}

}
