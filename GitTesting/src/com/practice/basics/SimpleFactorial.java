package com.practice.basics;

import java.util.Scanner;

public class SimpleFactorial {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int fact = 1;
		int i = 1;
		while(i<=l) {
			fact*=i;
			i++;
		}
		System.out.println(fact);
	}
}
