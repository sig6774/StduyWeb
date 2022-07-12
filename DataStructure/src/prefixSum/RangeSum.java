package prefixSum;

import java.util.Arrays;
import java.util.Scanner;

public class RangeSum {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 배열의 개수 N과 테스트 케이스 M을 입력 
		
		System.out.println("배열의 개수 : ");
		int N = sc.nextInt();
		
		System.out.println("테스트 횟수 : ");
		int M = sc.nextInt();
		
		long[] A = new long[N]; 
		
		for (int i = 0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		
		
		// 합 배열 s 
		long[] S = new long[A.length+1];
		for (int i = 1; i<=A.length; i++) {
			// 인덱스 번호를 맞춰주기 위해 1부터 시작 
			
				S[i] = S[i-1] + A[i-1];
				// 누적합과 현재 배열의 값을 합쳐주며 합 배열 구성 
			
		}
		
		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(S));
		
		// 구간 합 공식 
		// (x,y) -> S[y] - S[x-1]
		
		for (int i = 0; i<M; i++) {
			
			System.out.println("시작 값 : ");
			int x = sc.nextInt();
			
			System.out.println("끝 값 : ");
			int y = sc.nextInt();
			
			System.out.println(S[y] - S[x-1]);
		}
		
	}

}
