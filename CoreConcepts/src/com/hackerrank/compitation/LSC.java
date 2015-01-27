package com.hackerrank.compitation;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class LSC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		String t = in.nextLine();

		try {
			String A = in.nextLine().trim();
			String B = in.nextLine().trim();
			Set<Character> ans = LCS1(A, B);
           for(char c:ans){				
			if(c!=' '){
				System.out.print(c+" ");
			}				
           }
		} catch (Exception ee) {
			System.out.println("Problem in Computation");
		}
		in.close();
	}

	/*
	 * static String GetLCS2(String s1, String s2)
	 * 
	 * { String result =""; if (s1==null || s2==null) return ""; for (int i = 0;
	 * i < s1.length(); i++) { for (int j = 0; j < s2.length(); j++) { count++;
	 * if (s1[i] == s2[j]) { result += s1[i]; } } } return result; }
	 */

	static Set<Character> LCS1(String A, String B) {
		Set<Character> set = new LinkedHashSet<Character>();
		int Alen = A.length(), Blen = B.length();
		int[][] LCSArr = new int[Alen + 1][Blen + 1];
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= Alen; i++) {
			for (int j = 1; j <= Blen; j++) {
				if (A.charAt(i - 1) == B.charAt(j - 1)) {
					LCSArr[i][j] = 1 + LCSArr[i - 1][j - 1];
					set.add(A.charAt(i - 1));
					// sb.append(A.charAt(i - 1));
				} else {
					LCSArr[i][j] = Math.max(LCSArr[i][j - 1], LCSArr[i - 1][j]);
				}
			}
		}
		System.out.println(LCSArr[Alen][Blen]);
		return set;// sb.toString();
	}
}
