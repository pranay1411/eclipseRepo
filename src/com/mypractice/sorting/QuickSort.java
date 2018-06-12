package com.mypractice.sorting;
import java.util.Arrays;
   
public class QuickSort {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
			int[] A = {5,4,8,1,2,99,7,88,45,75};
			System.out.println(Arrays.toString(quick_sort(A,0,A.length-1)));
	}
	
	private static int[] quick_sort(int[] A, int p, int r) {
		if(p < r) {
			int q = partition(A,p,r);
			quick_sort(A,p,q-1);
			quick_sort(A,q+1,r);
		}
		return A;
	}

	private static int partition(int[] A, int p, int r) {
		int key = A[r];
		int i = -1;
		for(int j = 0; j < r ; j++) {
			if( A[j] <= key ) {
				i++;
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		}
		A[r] = A[i+1];
		A[i+1] = key;
		 
		return i+1;
	}
}
