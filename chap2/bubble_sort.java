package chap2;

import java.util.Arrays;

/*
 * 버블정렬
 * 종합문제 2-2 구현
 * 
 * */
public class bubble_sort {
	

	public static void main(String[] args) {
	
	int[] A = insertion_sort.putArray();
	
	int temp;
	
	for(int j=A.length-1;j>0;j--) {
	for(int i=0;i<j;i++) {
		
		if(A[i]>A[i+1]) {
			temp = A[i+1];
			A[i+1]=A[i];
			A[i]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(A));
	
	}	

}
