package com.ekaplus.datastrutures;

public class StackOpertionWithecursion {

	/**
	 * @param args
	 */

	StackOpertionWithecursion nextNode;
	StackOpertionWithecursion(){
		this.nextNode=new StackOpertionWithecursion();
	}
	
    
	public StackOpertionWithecursion getNode() {
		return nextNode;
	}

	public void setNode(StackOpertionWithecursion node) {
		this.nextNode = node;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	int data;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      StackOpertionWithecursion opertionWithecursion=new StackOpertionWithecursion();
     /* opertionWithecursion.push(new StackOpertionWithecursion(), 1);
      opertionWithecursion.push(new StackOpertionWithecursion(), 2);
      opertionWithecursion.push(new StackOpertionWithecursion(), 3);
      opertionWithecursion.push(new StackOpertionWithecursion(), 4);
      opertionWithecursion.push(new StackOpertionWithecursion(), 5);
      opertionWithecursion.printStack(opertionWithecursion);
	*/
      
      opertionWithecursion.push(null, 23);
	}

	boolean isEmpty(StackOpertionWithecursion root) {
		return root == null ? true : false;
	}

	void push(StackOpertionWithecursion newNode, int value) {
		if (newNode == null) {
			System.out.println("Stack Overflow");
			return;
		}
		newNode.data = value;
		newNode.nextNode = newNode;

	}

	void pop(StackOpertionWithecursion deleteNoe) {
		if (deleteNoe == null) {
			System.out.println("Stack Underflow.");
		}
		StackOpertionWithecursion temp = deleteNoe;
		temp.nextNode = deleteNoe.nextNode;
		System.out.println(deleteNoe.data);
		deleteNoe = null;

	}

	void printStack(StackOpertionWithecursion root) {
		while (root != null) {
			System.out.println(" "+root.data);
			root=root.nextNode;
		}
	}

}
