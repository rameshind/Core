package com.hackerrank.compitation;

import java.util.Scanner;

public class FilligJars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
      long n=sc.nextLong();
      long m=sc.nextLong();
     long sum=0;
      while(m-->0){
    	  long a=sc.nextLong();
    	  long b=sc.nextLong();
    	  long v=sc.nextLong();
    	  sum+=(b-a+1)*v;
    	  
    	  
      }System.out.println((long)sum/n);
	}

}
