package com.ekaplus.sorting;

import java.util.ArrayList;
import java.util.TreeMap;

public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  insertionSort(new int[]{3,5,22,2,1,12});
	}

	static void insertionSort(int[] arr) {
		
		
		int key = arr[0];
		int j = 0;

		for (int i : arr)
			System.out.print(" "+i);
		for (int i = 1; i < arr.length; i++) {
			key = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;

		}System.out.println();
		for (int i : arr)
			System.out.print(" "+i);

	}

}
