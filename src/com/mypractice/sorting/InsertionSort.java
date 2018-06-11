package com.mypractice.sorting;
import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
			int[] A = {5,4,8,1,2};
			System.out.println(Arrays.toString(insertion_sort(A)));
	}
	private static int[] insertion_sort(int[] A){
		for(int i = 1; i< A.length ;i++ ){
			int key = A[i];
			int j = i-1;
			while(j>-1 && A[j]>key){
				A[j+1] = A[j];
				j = j-1;
			}
			A[j+1] = key;
		}
		return A; 
	}
}
