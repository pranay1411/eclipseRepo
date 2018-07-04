package com.practice.basics;

import java.util.Scanner;

public class MagicalWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A[] = {67,71,73,79,83,89,97,101,103,107,109,113};
		int testCases = sc.nextInt();
		for(int t = 0 ; t < testCases ; t++ ) {
			int inputLength = sc.nextInt();
			sc.nextLine();
			char input[] = sc.nextLine().toCharArray();
			for(int i = 0 ; i < inputLength ; i++ )
			{
				int min = Math.abs(input[i] - A[0]);
				int nextPrime = A[0];
				for(int j = 1 ; j < A.length ; j++) {
					if(Math.abs( input[i] - A[j] ) < min) {
						min = Math.abs( input[i] -A[j] );
						nextPrime = A[j];
					}
				}
				System.out.print((char)nextPrime);
			}
			System.out.println();
			
		}
	}
}
