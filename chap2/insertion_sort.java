package chap2;
import java.util.*;

/*
 * 삽입정렬의 수행시간은 입력에 의해 결정된다.
 * Best : 이미 정렬된 경우 , 쎄타(n)
 * Wort : 역순으로 정렬되어 있는 경우, 쎄타(n^2)
 * */

public class insertion_sort {
	


public static int[] putArray(){

	Scanner sc = new Scanner(System.in);
	System.out.println("배열을 입력해 주세요.");
	String arr = sc.nextLine();
	
	StringTokenizer st1 = new StringTokenizer(arr," ");
	
	int[] A = new int[st1.countTokens()];
	
	int i=0;
	while(st1.hasMoreTokens()) {
		
		A[i]=Integer.valueOf(st1.nextToken());
		i++;
		
	}
	return A;
	
}

	public static void main(String[] args) {
	

	int[] A = putArray();
	for(int j=1;j<A.length;j++) {
		
		int key = A[j];
		int i = j-1;
		
		while(i>=0 && A[i]<key) {
			
			A[i+1]=A[i];
			i--;
				}
		A[i+1]=key;
		
	}
	
	System.out.println(Arrays.toString(A));
	
	}
	
	
	}

