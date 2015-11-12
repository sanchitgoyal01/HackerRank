package com.hackerrank.domains.algorithms.implementation;

import java.util.*;
import java.math.*;


public class ExtraLongFactorialWithBigInteger {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		try {
			BigInteger inputNumber = new BigInteger(input);
			BigInteger factorial = BigInteger.ONE;
			
			while(!inputNumber.equals(BigInteger.ZERO)){
				factorial = factorial.multiply(inputNumber);
				inputNumber = inputNumber.subtract(BigInteger.ONE);
			}
			
			System.out.println(factorial.toString());
		}
		catch(NumberFormatException e){
			return;
		}
		finally{
			scanner.close();
		}
	}
}
