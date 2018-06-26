package com.practice.basics;

import java.util.Scanner;

public class TwoStrings {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int testCases = sc.nextInt();
	sc.nextLine();
	for(int i = 0 ; i < testCases ; i++) {
		int[] a1 = new int[26];
		//int[] a2 = new int[26];
		String[] input = sc.nextLine().split(" ");
		for(int j = 0 ; j < input[0].length() ; j++) {
			a1[input[0].charAt(j)-97]++;
			a1[input[1].charAt(j)-97]--;
		}
		int sum = 0;
		for(int j = 0 ; j < 26 ; j++) {
			sum+=Math.abs(a1[j]);
		}
		if(sum==0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
}
