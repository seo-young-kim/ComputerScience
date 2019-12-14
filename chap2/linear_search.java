package chap2;

import java.util.*;

/* 22p 연습문제 2.1-3
 * 선형검색
 * 입력: n개 수들의 수열 A=<a1...an> 과 어떤 값 v
 * 출력: v = A[i]를 만족하는 인덱스 i, v가 존재하지 않을 경우 특수값 NIL
 * */
public class linear_search {

	
	public static void main(String[] args) {
	int[] A = insertion_sort.putArray();
	
	System.out.println("찾고 싶은 숫자를 입력해 주세요(정수배열).");
	Scanner sc = new Scanner(System.in);
	int v = sc.nextInt();
	
	for(int i=0;i<A.length;i++) {
		
		if(A[i]==v) {
			System.out.println("찾고자 하는 위치는 "+i);
			break;
		}
		if(i==A.length-1)
			System.out.println(v+"는 배열내에 존재하지 않습니다.");
	}
	
	}


}
