package com.hackerrank.compitation;

public class StringPermutation {
public static void main(String ss[]){
	String s="aaabbbb";
	
	
	permute(s.toCharArray(), 0,s.length()-1);
}
	
	static void swap(char[] s,int i,int j)
	{
	char temp=s[i];
	s[i]=s[j];
	s[j]=temp;
	}
	
	
	static void permute(char[] s,int i,int n)
	{
		int j;
		
		if(i==n)
			System.out.println(s);
		for(j=i;j<n;j++)
		{
			swap(s,i,j);
			permute(s,i+1,n);
			swap(s,i,j);
			
		}
		
	}
}
