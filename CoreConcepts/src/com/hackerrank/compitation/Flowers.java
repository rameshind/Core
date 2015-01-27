package com.hackerrank.compitation;

import java.util.Arrays;
import java.util.Scanner;

public class Flowers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int N, K;
		N = in.nextInt();
		K = in.nextInt();
		int[] C = new int[N];
		// K=78;
		for (int i = 0; i < N; i++) {
			C[i] = in.nextInt();
		}

		long result = 0;
		int noOfFlowers = 0;
		Arrays.sort(C);
		int t = K;
		for (int i = C.length - 1,j=0; i >= 0; i--) {

			if (t == 0) {
				noOfFlowers++;
				t = K;
			}
			result += (noOfFlowers + 1) * C[i];
			t--;
		/*	result+=(j/K+1)*C[i];
            j++;*/
		}

		System.out.println(result);
		in.close();
	}
}
