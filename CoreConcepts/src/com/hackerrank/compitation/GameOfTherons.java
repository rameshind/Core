package com.hackerrank.compitation;

import java.util.Scanner;

public class GameOfTherons {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScan = new Scanner(System.in);
		String inputString = myScan.nextLine();
		int[] count = new int[26];
		for (int i = 0; i < inputString.length(); i++) {
			int ch = inputString.charAt(i);
			System.out.print(ch+" ");
			if (count[ch-'a'] != 0)
				count[ch-'a']--;
			else
				count[ch-'a']++;

		}
		int sum = 0;

		for (int i = 0; i < count.length; i++) {
			sum += count[i];
			System.out.print(count[i]+" ");
		}
		if (sum > 1)
			System.out.println("NO");
		else
			System.out.println("YES");

		myScan.close();
	}

}
