package com.mypractice.sorting;
import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
			int[] A = {5,4,8,1,2,99,7,88,45,75};
			System.out.println(Arrays.toString(merge_sort(A,0,A.length-1)));
	}
	private static int[] merge_sort(int[] A,int p,int r){
		if(p < r){
			int q = (int)Math.floor((p+r)/2);
			merge_sort(A,p,q);
			merge_sort(A,q+1,r);
			merge(A,p,q,r);
		}
		return A;
	}
	private static int[] merge(int[] A, int p, int q, int r) {
		int n1 = q-p+1; int n2 = r-q;
		int L[] = new int[n1+1];
		int R[] = new int[n2+1];
		for(int i = 0; i < n1; i++ )
			L[i] = A[p+i];
		for(int j = 0; j< n2; j++)
			R[j] = A[q+j+1];
		L[n1] = Integer.MAX_VALUE;
		R[n2] = Integer.MAX_VALUE-1;
		int i =0, j = 0;
		for(int k = p ; k <= r; k++){
			if( L[i] <= R[j] ){
				A[k] = L[i];
				i++;
			}
			else {
				A[k] = R[j];
				j++;
			}
		}
		return A;
	}
}
