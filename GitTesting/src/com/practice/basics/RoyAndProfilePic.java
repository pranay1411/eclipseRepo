package com.practice.basics;

import java.util.Scanner;

public class RoyAndProfilePic {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int L = sc.nextInt();
	int testCases = sc.nextInt();
	for(int i = 0 ; i < testCases ; i++) {
		int W = sc.nextInt();
		int H = sc.nextInt();
		if(W < L || H < L)
			System.out.println("UPLOAD ANOTHER");
		else {
			if(W == H)
				System.out.println("ACCEPTED");
			else
				System.out.println("CROP IT");
		}
	}
}
}
