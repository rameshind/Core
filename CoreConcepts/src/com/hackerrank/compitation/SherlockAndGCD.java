package com.hackerrank.compitation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SherlockAndGCD {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScan = new Scanner(System.in);
		int n = Integer.parseInt(myScan.nextLine());
		ArrayList<String> inputArr=new ArrayList<String>();
		while(n>0){
			String len=myScan.nextLine();
			inputArr.add(myScan.nextLine());
			n--;
		}
		for(int i=0;i<inputArr.size();i++){
			boolean outboolean=false;
			String[] valArr=inputArr.get(i).split(" ");
			int[] intArr=new int[valArr.length];
			for(int b=0;i<intArr.length;i++){
				intArr[i]=Integer.parseInt(valArr[b]);
			}
			for(int j=0;j<valArr.length;j++){
				boolean b=false;
				int l=Integer.parseInt(valArr[j]);
				if(l==3){
					//System.out.println("YES");
				outboolean=true;
					break;
				}
			for(int k=2;k<=(int)Math.sqrt(l);k++){
				if(l%k!=0){
					b=true;
				break; 
				}
			}if(b){
				outboolean=true;
				break;
			}
				
			}
			if(outboolean)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

}
