package chap2;

import java.util.Arrays;
/*
 * 선택 정렬 
 * 28p
 * 연습문제 2.2-2
 * n개를 바꿀때까지 수행하지 않고 n-1개까지 바꾸면된다.
 * 수행시간 : 세타(n^2)
 * */
public class selection_sort {
	
	
	public static void main(String[] args) {
		
		int[] A = insertion_sort.putArray();
		
		for(int i=0;i<A.length-1;i++) {
		
			int min = A[i];
			int index =i;
	//		System.out.println("min:"+min+" index:"+i);
			
			for(int j=i;j<A.length;j++) {
				
				if(A[j]<min) {
					min=A[j];
					index = j;			
					}
			}
			
				A[index]=A[i];
				A[i]=min;
		//		System.out.println(Arrays.toString(A));
		}
		System.out.println(Arrays.toString(A));
		
		
	}

	}
