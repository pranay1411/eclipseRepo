package com.practice.basics;

import java.util.Scanner;

public class ToggleString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	char[] input = str.toCharArray();
	for(int i = 0 ; i < input.length ; i++) {
		input[i]^=32;
	}
	System.out.println(input);
}
}
