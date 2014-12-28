package com.sanchitgoyal.hackerrank.algorithms.warmup;
import java.util.*;

public class GemStones {

	public static void main(String[] args) {
		int[] counter = new int[26];
		Scanner inputScanner = new Scanner(System.in);
		                       
		int n = inputScanner.nextInt();
		
		for (int i=0;i<26; i++) counter[i] =1;
		
		for (int i=0; i<n; i++){
			String input = inputScanner.next();
			int[] inputCounter = new int[26];
			
			for(int j=0; j<input.length(); j++){
				int index = input.charAt(j) - 'a';
				inputCounter[index] = 1;
			}
			
			for (int j=0; j<26; j++){
				counter[j] *= inputCounter[j];
			}
		}
		
		int count = 0;
		for (int i=0; i<26; i++){
			count += counter[i];
		}
		
		System.out.println(count);
	}

}
