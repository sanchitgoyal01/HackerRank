package com.hackerrank.domains.algorithms.implementation;

import java.util.*;

public class ExtraLongFactorialsWithoutBigInteger {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int input = scanner.nextInt();
    	int[] factorial = new int[(int) Math.floor(input * Math.log10(input)) + 1];
    	int top = 0;
    	factorial[top] = 1;
    	
    	for (int i=2; i<=input; i++){    	
    		int carryover = 0;
    		for(int j=0; j<=top; j++){
    			int result = factorial[j] * i + carryover;
    			factorial[j] =  (result % 10);
    			carryover = result / 10;
    		}
    		
    		while(carryover != 0){
    			factorial[++top] = carryover % 10;
    			carryover = carryover / 10;
    		}
    	}
    	
    	for (int i=top; i>=0; i--){
    		System.out.print(factorial[i]);
    	}
    	
    	System.out.println();
    	scanner.close();
    }
}
