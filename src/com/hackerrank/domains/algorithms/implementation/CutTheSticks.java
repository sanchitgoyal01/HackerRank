package com.hackerrank.domains.algorithms.implementation;

import java.util.Scanner;

public class CutTheSticks {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] input = new int[size];
		
		for (int i=0; i<size; i++){
			input[i] = scanner.nextInt();
		}
		
		sort(input);
						
		for(int i=0; i<input.length; i++){
			if(input[i] > 0) {
				int count = 0;
				int length = input[i];
				
				for(int j=i; j<input.length; j++){
					if (input[j] > 0) {
						input[j] = input[j] - length;
						count++; 
					}
				}
				
				System.out.println(count);
			}
		}
		
		scanner.close();
	}
	
	private static void sort(int[] input) {
		for(int i=1; i<input.length; i++){
			int temp = input[i];
			int j = i-1;
			while(j>=0 && input[j]>temp){
				input[j+1] = input[j];
				j--;
			}
			
			input[j+1] = temp;
		}
	}

}
