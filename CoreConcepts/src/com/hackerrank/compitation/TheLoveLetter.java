package com.hackerrank.compitation;

import java.util.Scanner;

public class TheLoveLetter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
    if(n<=10&&n>=1)
       while(n>0){
           String str=sc.next();
           str=str.toLowerCase();
           int k=str.length()-1;
           int count=0;
           if(k>=1&&k<=1000)
           for(int i=0;i<str.length()-1/2;i++,k--){
               if(i<=k)
             count+=(int)str.charAt(k)-(int)str.charAt(i);  
                          
           }
           System.out.println((count));
          n--;     
       }
       
	}

}
