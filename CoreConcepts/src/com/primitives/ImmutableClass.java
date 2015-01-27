package com.primitives;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
Set<Integer> s1=	Collections.EMPTY_SET;
s1=new HashSet<Integer>(s1);
s1.add(1);
s1.add(7);
System.out.println(s1);
	
	System.out.println(Collections.min(s1));
	}

}
