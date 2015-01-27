package com.primitives;

import java.util.Hashtable;


public class PrimitiveOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char b1=9;
		char b2=9;
		long b3=b1-b2;
		System.out.println(""+b3);
		System.out.println(10%0.0);
		String s1 =new String();
		
		Hashtable<String,Integer> m1=new Hashtable<String,Integer>();
		m1.put("a",2);
		m1.put("b",2);
		
		if(m1.containsKey("a")&&m1.get("a")>1){
			System.out.println("hi");
		}

	}

}
