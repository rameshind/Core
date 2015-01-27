package com.ekaplus.datastrutures;

public class MyQueueWitoutNItems {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


private int maxSize;
private int[] queArray;
private int front;
private int rear;
//-------------------------------------------------------------

 public MyQueueWitoutNItems(int s) {
	// TODO Auto-generated constructor stub
maxSize = s+1; // array is 1 cell larger
queArray = new int[maxSize]; // than requested
front = 0;
rear = -1;
}
//-------------------------------------------------------------

public void insert(int j) // put item at rear of queue
{
if(rear == maxSize-1)
rear = -1;
queArray[++rear] = j;
}
//-------------------------------------------------------------

public int remove() // take item from front of queue
{
int temp = queArray[front++];
if(front == maxSize)
front = 0;
return temp;
}
//-------------------------------------------------------------

public int peek() // peek at front of queue
{
return queArray[front];

}
//-------------------------------------------------------------

public boolean isEmpty() // true if queue is empty
{
return ( rear+1==front || (front+maxSize-1==rear) );
}
//-------------------------------------------------------------

public boolean isFull() // true if queue is full
{
return ( rear+2==front || (front+maxSize-2==rear) );
}
//-------------------------------------------------------------
public int size() // (assumes queue not empty)
{
if(rear >= front) // contiguous sequence
return rear-front+1;
else // broken sequence
return (maxSize-front) + (rear+1);
}
//-------------------------------------------------------------

} // end class