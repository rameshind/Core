package com.ekaplus.sorting;

public class InsertionSort1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     insertionSort(new int[]{4,2,1,3,13,5});
	}
	static public void insertionSort(int[] a)
	{
	int in, out;
	int nElems=a.length;
	for(out=1; out<nElems; out++) // out is dividing line
	{
	int temp = a[out]; // remove marked item
	in = out; // start shifts at out
	while(in>0 && a[in-1] >= temp) // until one is smaller,
	{
	a[in] = a[in-1]; // shift item right,
	in--; // go left one position
	}
	a[in] = temp; // insert marked item
	System.out.println("Attempt : "+out);
	for(int i:a)
		System.out.print(" "+i);
	System.out.println();
	} // end for
	
	/*for(int i:a)
		System.out.print(" "+i);*/
	} // end insertionSort()
}
