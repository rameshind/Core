package com.hackerrank.compitation;

import java.util.Scanner;

public class SherlockAndBeast {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			/*
			 * long n=in.nextLong(); long threes =((n*2)%3)*5; long
			 * fives=n-threes; if(n<3){ System.out.println("-1"); continue; }
			 * String s1="",s2=""; long g=0;
			 * 
			 * if(threes>fives) g=threes; else g=fives;
			 * 
			 * 
			 * for(int i=0;i<g;i++){ if(i<fives) s1+='5'; if(threes>i) s2+='3';
			 * //System.out.print("5");
			 * 
			 * } for(int i=0;i<threes;i++){ s2+="3"; //System.out.print("3"); }
			 * System.out.println(s1+s2);
			 */

			/*String ks = "";
			int n = in.nextInt();

			for (int j = n; j >= 0; j--) {
				if (j % 3 == 0 && (n - j) % 5 == 0) {
					ks = "";
					for (int k = 0; k < j; k++)
						ks += '5';
					for (int k = 0; k < n - j; k++)
						ks += '3';
					break;
				}
			}
			if(ks.equals(""))
				System.out.println("-1");
			else
				System.out.println(ks);
*/
			
			int n = in.nextInt();
            StringBuffer ks=new StringBuffer("");
			for (int j = n; j >= 0; j--) {
				if (j % 3 == 0 && (n - j) % 5 == 0) {
					//ks = "";
					for (int k = 0; k < j; k++)
						ks.append('5');
					for (int k = 0; k < n - j; k++)
						ks.append('3');
					break;
				}
			}
			
			if(ks.length()==0)
				System.out.println("-1");
			else
				System.out.println(ks);
		}

	}

}
