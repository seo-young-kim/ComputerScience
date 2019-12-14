package chap2;

import java.util.Arrays;

/*
 * MergeSort
 * 연습문제 2.3-2 방식으로 작성(경계값 사용X)
 * 
 * */
public class merge_sort {

	public static void mergeSort(int[] A,int p, int r) {
		
		if(p<r) {
		int m = (p+r)/2;
		//System.out.println("MergeSort "+"p:"+p+" m: "+m+" r: "+r);
		mergeSort(A,p,m);
		mergeSort(A,m+1,r);
		merge(A,p,m,r);
		}
		else 
			return;
			
	}
	
	public static void merge(int[] A,int p,int m,int r) {
		
		int L[]=Arrays.copyOfRange(A, p, m+1);
		int R[]=Arrays.copyOfRange(A, m+1, r+1);
		int i=0;
		int j=0;
		
		for(int k=p;k<r+1;k++) {
		
			if(i>=L.length) {
				A[k]=R[j++];
				continue;}
			if(j>=R.length) {
				A[k]=L[i++];
				continue;}
			
			if(L[i]<R[j]) {
				A[k]=L[i++];
				
			}
			else {
				A[k]=R[j++];
			}
			
		}
	
	}
		
	public static void main(String[] args) {
		
		int[] A = insertion_sort.putArray();
		mergeSort(A,0,A.length-1);
		System.out.println(Arrays.toString(A));
	}
	
	
}
