package com.sanchitgoyal.hackerrank.algorithms.arraysandsorting;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InsertionSort2 {

    public static void insertIntoSorted(int[] ar) {
    	for (int i=1; i<ar.length; i++){
    		int memCache = ar[i];
    		int j=i-1;
    		for (; j>=0; j--){
    			if(ar[j]>memCache){
    				ar[j+1] = ar[j];
    			}
    		}
			ar[j+1] = memCache;
			for (int k=0; k<ar.length; k++){
				System.out.print(ar[k]+" ");
			}
            System.out.println();
    	}
    }
    
/* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
   
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}
