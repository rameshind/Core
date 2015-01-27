package com.ekaplus.datastrutures;

public class StackWithArrays {

	int top;
	int[] arr;
	int capacity;

	StackWithArrays() {
		top = -1;
		capacity = 10;
		arr = new int[capacity];

	}

	boolean isEmpty() {
		return (top == -1);
	}

	boolean isStackFull() {
		return (top == capacity - 1);
	}

	void push(int data) {
		if (isStackFull()) {
			System.out.println("Stack Overflow");
		} else if (top < capacity)
			arr[++top] = data;
	}

	int pop() {
		if (isStackFull()) {
			System.out.println("StackUnderflow");
			return 0;
		} else {
			int t = arr[top];
			arr[top--] = 0;
			return t;
		}
	}

	/*
	 * void deleteStack() { top = -1; }
	 */
	void printStack() {
		for (int i : arr) {
			if (i != 0)
				System.out.print(" " + i);
		}
		System.out.println();
	}

	public static void main(String[] args) {

		StackWithArrays arrays = new StackWithArrays();
		arrays.push(1);
		arrays.push(3);
		arrays.push(6);
		arrays.printStack();

		arrays.pop();
		arrays.pop();
		arrays.push(234);
		arrays.push(222);

		arrays.printStack();
		// arrays.deleteStack();
		// arrays.printStack();

	}

}
