package prefixSum;

import java.util.Arrays;
import java.util.Scanner;

public class RangeSum11660 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 배열의 개수 N과 테스트 케이스 M을 입력 
		
		int N = sc.nextInt();
		int [][] A = {
				{1,2,3,4},
				{2,3,4,5},
				{3,4,5,6},
				{4,5,6,7}
		};
		
		// 구간합 배열 D 구하기 
		int[][] D = new int[N+1][N+1];
		
		for (int i = 1; i<=N; i++) {
			for(int j =1; j<=N; j++) {
				
				D[i][j] = D[i][j-1] + D[i-1][j] - D[i-1][j-1] + A[i-1][j-1]; 
			}
		}
		
		for (int[] arr : D) {
			System.out.println(Arrays.toString(arr));
		};
		
		int x1 = 1, y1 = 1, x2 = 4, y2 = 4;
		System.out.println(D[x2][y2] - D[x1-1][y2] - D[x2][y1-1] + D[x1-1][y1-1]);
		
		// 특정 구간의 합 구하는 공식 
		// D[x2][y2] - D[x1-1][y2] - D[x2][y1-1] + D[x1-1][y1-1]
		/*
		 N(배열 크기) M(질문 횟수) 입력받아서 저장 
		 
		 for(N만큼) {
		 	for(N만큼) {
		 	
		 		원본배열에 정수를 입력받아 저장 
		 	}
		 }
		 
		 for(N만큼) {
		 	for(N만큼) {
		 		구간 합 배열 저장 
		 		공식 : D[i][j] = D[i][j-1] + D[i-1][j] - D[i-1][j-1] + A[i][j]
		 	}
		 }
		 
		 for(N만큼) {
		 	사용자가 원하는 좌표를 입력받고 계산 및 출력 
		 	공식 : D[x2][y2] - D[x1-1][y2] - D[x2][y1-1] + D[x1-1][y1-1] 
		 }
		 */
	}
}
