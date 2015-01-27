package com.ekaplus.datastrutures;

public class MyQueue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue myQueue = new MyQueue(5);
        myQueue.insert(1);
        myQueue.insert(2);
        myQueue.insert(3);
        myQueue.insert(4);
        myQueue.insert(5);
        myQueue.insert(6);
        
        myQueue.remove();
        myQueue.remove();
        myQueue.remove();
        myQueue.remove();
        myQueue.remove();
	}

	private int maxSize;
	private int[] queArray;
	private int front;
	private int rear;
	private int nItems;

	// -------------------------------------------------------------
	public MyQueue(int s) // constructor
	{
		maxSize = s;
		queArray = new int[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	// -------------------------------------------------------------
	public void insert(int j) // put item at rear of queue
	{
		if (rear == maxSize - 1) // deal with wraparound
			rear = -1;
		queArray[++rear] = j; // increment rear and insert
		nItems++; // one more item
	}

	// -------------------------------------------------------------
	public int remove() // take item from front of queue
	{
		int temp = queArray[front++]; // get value and incr front
		if (front == maxSize) // deal with wraparound
			front = 0;
		nItems--; // one less item
		return temp;
	}

	// ------------------------------------------------------------
	public int peekFront() // peek at front of queue
	{

		return queArray[front];
	}

	// -------------------------------------------------------------

	public boolean isEmpty() // true if queue is empty
	{
		return (nItems == 0);
	}

	// -------------------------------------------------------------

	public boolean isFull() // true if queue is full
	{
		return (nItems == maxSize);
	}

	// -------------------------------------------------------------

	public int size() // number of items in queue
	{
		return nItems;
	}
	// -------------------------------------------------------------

} // end class Queue