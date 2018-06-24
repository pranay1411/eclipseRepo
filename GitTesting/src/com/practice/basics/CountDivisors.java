package com.practice.basics;

import java.util.Scanner;

public class CountDivisors {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int l = sc.nextInt();
	int r = sc.nextInt();
	int k = sc.nextInt();
	int count = 0;
	System.out.println((r/k) - ((l-1)/k));
}
}
