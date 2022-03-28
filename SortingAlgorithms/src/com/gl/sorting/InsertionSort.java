package com.gl.sorting;

public class InsertionSort {

	public void implementationOfInsertionSort(int[] arr) {
		int partition = 1;
		int i = 1, j = i - 1;
		int temp = 0;
		
		while (partition < arr.length && (isSorted(arr)!=true)) {
			j = i - 1;
			temp = arr[i];

			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
			partition++;
			i++;
			print(arr);
			System.out.println();
		}
	}
	
	public boolean isSorted(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				return false;
			}
		}
		return true;
	}
	
	public void print(int[] arr) {
		for(int e : arr) {
			System.out.print(e + " ");
		}
	}

	public static void main(String[] args) {
		
		int[] array = {5,3,8,6,2,1};
		InsertionSort ob = new InsertionSort();
		System.out.println("Before Sorting ::\n ");
		ob.print(array);
		System.out.println();
		System.out.println("Insertion Sort in progress :");
		ob.implementationOfInsertionSort(array);
		System.out.println("\n\nAfter Insertion Sort ::\n ");
		ob.print(array);
		
		
		
	}

}
