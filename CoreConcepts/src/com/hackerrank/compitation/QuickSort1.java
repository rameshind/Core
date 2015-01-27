package com.hackerrank.compitation;

import java.util.ArrayList;
import java.util.Scanner;


public class QuickSort1 {
       
          static void partition(int[] ar) {
              ArrayList<Integer> lowerList=new ArrayList<Integer>();
              ArrayList<Integer> upperList=new ArrayList<Integer>();
              int pivote=ar[0];
              for(int i=0;i<ar.length;i++){
            	  if(ar[i]>=pivote)
            		  upperList.add(ar[i]);
            	  else
            		  lowerList.add(ar[i]);
              }
             lowerList.addAll(upperList);
             for(int i=0;i<lowerList.size();i++)
                    ar[i]=Integer.valueOf(lowerList.get(i).toString());
       printArray(ar);
          }   
 
 static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }
       
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           partition(ar);
       }    
   }
