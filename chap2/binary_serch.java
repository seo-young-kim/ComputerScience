package chap2;

import java.util.Arrays;
import java.util.Scanner;
/*
 * 이진검색- Divide and Conquer 방식
 * 연습문제 2.3-5
 * 
 * */
public class binary_serch {

	
	public static void binarySearch(int[] A,int s, int e, int v) {
		
		int medi = (s+e)/2;
		
		if(A[medi]==v) {
			 System.out.println("찾고자 하는 위치는 :"+ medi);
			 return;
		}
		
		if(s==e) 
		{
			System.out.println("배열내에 "+v+" 는 존재하지 않습니다.");
			return;
		 }
		if(A[medi]>v) {
			binarySearch(A,s,medi-1,v);
		}
		else
			binarySearch(A,medi+1,e,v);
			
		
	}
	
	public static void main(String[] args) {
		
		int[] A = insertion_sort.putArray();
		merge_sort.mergeSort(A,0,A.length-1);
		System.out.println(Arrays.toString(A));
		System.out.println("찾고 싶은 숫자를 입력해 주세요(정수배열).");
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		binarySearch(A,0,A.length-1,v);
	
	}

}
