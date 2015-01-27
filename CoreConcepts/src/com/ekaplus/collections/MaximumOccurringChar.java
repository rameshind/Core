package com.ekaplus.collections;

import java.util.Scanner;

 class MaximumOccurringChar{

static String testcase1 = "Hello! Are you all fine? What are u doing today? Hey Guyz,Listen! I have a plan for today.";

public static void main(String[] args) {
    MaximumOccurringChar test = new MaximumOccurringChar();
   String result = test.maximumOccuringChar(testcase1);
    System.out.println(result);
}

public String maximumOccuringChar(String str) {
    int temp = 0;
    int count = 0;
    int current = 0;
    int ind = 0;
    char[] arrayChar = {'a','b' , 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    int[] numChar = new int[26];
    char ch;
    String s="";
    str = str.toLowerCase();
    for (int i = 0; i < 26; i++) {
        count = 0;
        for (int j = 0; j < str.length(); j++) {
            ch = str.charAt(j);
            if (arrayChar[i] == ch) {
                count++;
            }
        }
        numChar[i] = count++;
    }
    temp = numChar[0];

    for (int i = 1; i < numChar.length; i++) {
        if (temp < numChar[i]) {
            temp = numChar[i];

            ind = i;
            break;
        }
    }
       System.out.println(numChar.toString());
        for(int c=0;c<26;c++)
        {
            if(numChar[c]==temp)
            s+=arrayChar[c]+" ";


        }


    return s;

   }
   }

