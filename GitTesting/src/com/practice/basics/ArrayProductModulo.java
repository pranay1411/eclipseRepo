package com.practice.basics;

import java.util.Scanner;

public class ArrayProductModulo {
public static void main(String[] args) {
	Double divisor = Math.pow(10, 9)+7;
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	sc.nextLine();
	Double result = 1.0;
	for(int i = 0 ; i < n ; i++ ) {
		result= result *sc.nextInt()%divisor;
	}
	System.out.println(result.intValue());
	sc.close();
}
}
