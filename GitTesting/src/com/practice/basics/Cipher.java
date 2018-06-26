package com.practice.basics;

import java.util.Scanner;

public class Cipher {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] input = sc.nextLine().toCharArray();
		int k = sc.nextInt();
		for( int i = 0 ; i < input.length ; i++ ) {
			if( 65 <= input[i] && input[i] <= 90 )
				input[i] = (char) ( 65 + ( input[i] - 65 + k )%26 );
			else if( 97 <= input[i] && input[i] <= 122 )
				input[i] = (char) ( 97 + ( input[i] - 97 + k )%26 );
			else if( 48 <= input[i] && input[i] <= 57 )
				input[i] = (char) ( 48 + ( input[i] - 48 + k  )%10 );
		}
		System.out.println(input);
	}
}
