package com.sanchitgoyal.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class AlternatingCharacters {
	public static void main(String[] args) {
		Scanner lineReader = new Scanner(System.in);
		int n = lineReader.nextInt();
		int[] steps = new int[n];
		
		for (int i=0; i<n; i++){
			String input = lineReader.next();
			char context = '\0';
			steps[i] = 0; 
			for (int j=0; j<input.length(); j++){
				if(context==input.charAt(j)){
					steps[i]++;
				} else {
					context = input.charAt(j);
				}
			}
		}
		
		for (int i=0; i<n; i++){
			System.out.println(steps[i]);
		}
	}
}
