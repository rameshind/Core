package com.ekaplus.sorting;

public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       selectionSort(new int[]{34,56,2,5,77,1,4567});
	}

	static void selectionSort(int[] arr) {
		int mid_idx=0;
		for (int i = 0; i < arr.length - 1; i++) {
          mid_idx=i;
          for(int j=i+1;j<arr.length;j++){
        	  if(arr[j]<arr[mid_idx])
        		  mid_idx=j;
        	  
        	  swap(arr[mid_idx],arr[i]);
          }
		}
		for(int i:arr)
			System.out.print(" "+i);
	}
	static void swap(int a,int b){
		int t=a;
		a=b;
		b=t;
	}
}


