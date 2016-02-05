package com.sanchitgoyal.hackerrank.algorithms.dp;

import java.util.Scanner;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		int[] m;
		int[] n;
		int[][] lcs;
		
		Scanner readLine = new Scanner(System.in); 
		m = new int[readLine.nextInt()];
		n = new int[readLine.nextInt()];
		
		lcs = new int[m.length][n.length];
		
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<n.length; j++) {
				if(m[i]==n[j]) {
					lcs[i][j] = i==0||j==0?0:lcs[i-1][j-1] + 1;
				}
			}
		}
	}
}