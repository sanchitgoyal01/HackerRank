package com.sanchitgoyal.hackerrank.algorithms.dp;

import java.util.Scanner;

public class MaximumSubArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		int[][] sums = new int[t][2];
		for (int i=0; i<t; i++){
			int size = scn.nextInt();
			int[] sectionSum = new int[size];
			String[] array = scn.next().split(" ");
			int k=-1;
			int signFlag = 0;
			for (int j=0;j<array.length; j++){
				int num = Integer.parseInt(array[j]);
				if(Integer.signum(num)!=signFlag){
					k++;
					signFlag = Integer.signum(num);
					sectionSum[k] = num;
				} else {
					sectionSum[k]+=num;
				}	
			}
			         
			int contSum = sectionSum[0];
			int maxContSum = sectionSum[0];
			int maxNonContSum;
			
			if(sectionSum[0]>0) maxNonContSum = sectionSum[0];
			else maxNonContSum = 0;
			
			for (int j=1; j<=k; j++){
				if(sectionSum[j]>0) maxNonContSum += sectionSum[j];
				
				if(contSum<0){
					contSum = sectionSum[j];
				}
				else {
					contSum += sectionSum[j];
				}
				
				if(contSum>maxContSum) maxContSum = contSum;
			}
			
			sums[i][0] = maxNonContSum;
			sums[i][1] = maxContSum;
		}
		
		for (int i=0; i<sums.length; i++){
			System.out.println(sums[i][0]+" "+sums[i][1]);
		}
	}

}


/**
*	-7 5 .....  
*	-3 5 .....
*	5 -7 ....
*	5 -3 ....
*/
