package com.hackerrank.compitation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PermutationOfString {
	static Set<StringBuffer> permutatonSet = new HashSet<StringBuffer>();
      static boolean b=false;
      static int halfLen=0;
	public static void main(String args[]) {
		String str = "aaabbbb";
	    StringBuffer strBuf = new StringBuffer(str);
	   // doPerm(strBuf,str.length());
		//permuteString("", "cdefghmnopqrstuvw");
		/*Iterator<StringBuffer> it=permutatonSet.iterator();
		boolean b=false;bbabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb
		while(it.hasNext()) {
			String type =  it.next().toString();
			if(type.equals(new StringBuffer(type).reverse().toString()))
			{
				b=true;
				break;
			}
			}
			if(b){
				System.out.println("YES");
			}else
				System.out.println("NO");*/
	    combString(str);
	    if(b){
			System.out.println("YES");
		}else
			System.out.println("NO");
		}

	

	/*public static void permuteString(String beginningString, String endingString) {
				if (endingString.length() <= 1) {
			String str1 = beginningString + endingString;
			permutatonSet.add(str1);
			return ;
		}

		else {
			for (int i = 0; i < endingString.length(); i++) {
				try {
					String newString = endingString.substring(0, i)
							+ endingString.substring(i + 1);

					permuteString(beginningString + endingString.charAt(i),
							newString);
				} catch (StringIndexOutOfBoundsException exception) {
					exception.printStackTrace();
				}
			}
}}*/
			
	/*private static void doPerm(StringBuffer str, int index){

	    if(index <= 0){
	    	System.out.println(str); 
	    	return;
	    	//permutatonSet.add(str);
	    }
	                   
	    else { //recursively solve this by placing all other chars at current first pos
	        doPerm(str, index-1);
	        int currPos = str.length()-index;
	        for (int i = currPos+1; i < str.length(); i++) {//start swapping all other chars with current first char
	            swap(str,currPos, i);
	            doPerm(str, index-1);
	            swap(str,i, currPos);//restore back my string buffer
	        }
	    }
	}

	private  static void swap(StringBuffer str, int pos1, int pos2){
	    char t1 = str.charAt(pos1);
	    str.setCharAt(pos1, str.charAt(pos2));
	    str.setCharAt(pos2, t1);
	} 
	
*/	

	public static void combString(String s) {
	    // Print initial string, as only the alterations will be printed later
	    System.out.println(s);
		halfLen++;
	    char[] a = s.toCharArray();
	    int n = a.length;
	    int[] p = new int[n];  // Index control array initially all zeros
	    int i = 1;
	    while (i < n) {
	        if (p[i] < i) {
	            int j = ((i % 2) == 0) ? 0 : p[i];
	            swap(a, i, j);
	            // Print current
	            String ss=join(a);
	            if(ss.equals(new StringBuilder(ss).reverse().toString())){
	            	b=true;
	            	return;
	            }
	            if(halfLen>=s.length()/2)
	            	return;
	            System.out.println(join(a));
	            p[i]++;
	            i = 1;
	        }
	        else {
	            p[i] = 0;
	            i++;
	        }
	    }
	}

	private static String join(char[] a) {
	    StringBuilder builder = new StringBuilder();
	    builder.append(a);
	    return builder.toString();
	}

	private static void swap(char[] a, int i, int j) {
	    char temp = a[i];
	    a[i] = a[j];
	    a[j] = temp;
	}




}
