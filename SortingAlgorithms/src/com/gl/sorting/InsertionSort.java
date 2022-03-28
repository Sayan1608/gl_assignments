package com.gl.sorting;

public class InsertionSort {

	public void implementationOfInsertionSort(int[] arr) {
		int partition = 1;
		int i = 1, j = i - 1;
		int temp = 0;

		while (partition < arr.length) {
			j = i - 1;
			temp = arr[i];

			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
			partition++;
			i++;
		}
	}
	
	public void print(int[] arr) {
		for(int e : arr) {
			System.out.print(e + " ");
		}
	}

	public static void main(String[] args) {
		
		int[] array = {3,8,5,2,4,6};
		InsertionSort ob = new InsertionSort();
		System.out.println("Before Sorting ::\n ");
		ob.print(array);
		System.out.println("\n\nAfter Insertion Sort ::\n ");
		ob.implementationOfInsertionSort(array);
		ob.print(array);
		
		
		
	}

}
