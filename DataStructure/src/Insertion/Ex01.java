package Insertion;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {
	

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("사람 수 : ");
		int N = sc.nextInt();
		
		int [] A = new int[N]; 
		// 사람 수 배열 
		
		for (int i = 0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		
		System.out.println("사람 수 : " + N);
		System.out.println("소요시간 : " + Arrays.toString(A));
		
		
		// 정렬을 진행해야 최소 시간이 나옴 
		
		for (int i = 1; i< A.length; i++) {
			int temp = A[i];
			
			int j = i  ;
			
			while(j> 0 && temp <=A[j]) {
				A[j] = A[j-1];
				j--;
				
			}
			A[j] = temp;
			
		}
		// 정렬 로직 
		System.out.println(Arrays.toString(A));
		
		int total = 0;
		int s = 0;
		for (int i = 0; i< A.length; i++) {
			total += s + A[i];
			// 누적합 + 현재 값 
			
			s += A[i];
			// i-1의 누적합을 가지고 있는 변수 
		}
		System.out.println(total);
	}

}
