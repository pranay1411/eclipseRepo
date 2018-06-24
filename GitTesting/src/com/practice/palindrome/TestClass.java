package com.practice.palindrome;

import java.util.Scanner;

public class TestClass {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int input_size = s.length();
		char[] input = s.toCharArray();
		boolean flag = false;
		for(int i = 0,j = input_size -1 ; i < j ; i++,j--) {
			if(input[i]!=input[j])
				flag = true;
		}
		if(!flag)
			System.out.println("YES");
		else
			System.out.println("NO");
	} 
}
