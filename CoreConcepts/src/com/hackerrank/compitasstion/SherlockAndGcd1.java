package com.hackerrank.compitasstion;

import java.util.Scanner;

public class SherlockAndGcd1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner in = new Scanner(System.in);

	        int T = in.nextInt();
	        int N;
	        for(int i =0; i < T; ++i) {
	            N = in.nextInt();

	            long[] arr = new long[N];

	            for(int j = 0; j < N; ++j) {
	                arr[j] = in.nextInt();
	            }
	          //  in.nextLine();
	            long min = findMin(arr);
	            boolean found = false;
	            for(long k = 2; k <= min; ++k) {
	                for(int l = 0; l< N; ++l) {
	                    if(arr[l] % k == 0) {
	                        found = true;
	                    } else {
	                        found = false;
	                        break;
	                    }
	                }
	                if(found) {
	                   break;
	                }
	            }
	            System.out.println(found? "NO" : "YES");
	        }
	    }

	    private static long findMin(long [] arr) {
	        long min = 100001;
	        for(int i = 0; i < arr.length; ++i) {
	            min = Math.min(arr[i], min);
	        }
	        return min;
	    }

	}


