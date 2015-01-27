package com.hackerrank.compitation;

import java.util.ArrayList;
import java.util.Scanner;

public class IcecreamParler {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int noOfTestCases = Integer.parseInt(in.nextLine());
		ArrayList<String> result = new ArrayList<String>();
		while (noOfTestCases > 0) {
			boolean b=false;
			int amount = Integer.parseInt(in.nextLine());
			int len = Integer.parseInt(in.nextLine());
			String[] input = in.nextLine().split(" ");
			int c1, c2;
			for (int i = 0; i < input.length; i++) {
				c1 = Integer.parseInt(input[i]);
				for (int j = i + 1; j < input.length; j++) {
					c2 = Integer.parseInt(input[j]);
					if ((c1 + c2) == amount) {
						result.add(++i + " " + ++j);
						b=true;
						//System.out.println(++i + " " + ++j);
						break;
					}

				}if(b)
					break;
			}
			noOfTestCases--;
		}
  for(String i:result){
	  System.out.println(i);
  }
	}
}
