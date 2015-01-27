package com.ekaplus.collections;

import java.util.Iterator;
import java.util.Stack;

public class ReversingStringUsingStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
reverse("ramesh");
	}
static	void reverse(String input){
		Stack<Character> st=new Stack<Character>();
		for(int i=0;i<input.length();i++){
			st.push(input.charAt(i));
		}
	Iterator<Character> it=	st.iterator();
	
	 
	while (it.hasNext()){
		System.out.println(st.pop());
	}
	}

}
