package search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BinarySearch02 {
	
	public static int N; 
	public static int M; 
	
	public static int[] A; 
	
	public static void main(String[] args) throws IOException {
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			// 입력을 받을 수 있는 클래스 생성 
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			N = Integer.parseInt(st.nextToken()); // 레슨의 수  
			M = Integer.parseInt(st.nextToken()); // 블루레이의 수 
			
			A = new int[N]; // 강의 배열 
			st = new StringTokenizer(br.readLine());
			
			for (int i = 0;  i<N; i++) {
				A[i] = Integer.parseInt(st.nextToken());
			}
			
			// 블루레이 한장이 가질 수 있는 최소 값과 최대 값을 구해야 함
			int start = 0, end = 0;
			
			for(int i = 0; i<N; i++) {
				if (start < A[i]) {
					start = A[i];
					// 최대값 구하는 로직 
				}
				end += A[i];
			}
			
			int answer = 0; // 정답 

			while(start <= end) {
				int mid = (start + end ) / 2 ;
				// 블루레이의 크기 
				
				if(isRightSize(mid)) {
					// true가 오면 블루레이 수를 추가할 수 있음 
					answer = mid; 
					end = mid - 1; 
				}
				else {
					// 블루레이 수를 추가할 수 없음 
					start = mid + 1; 
				}
			}
			System.out.println(answer);
	}
	
	public static boolean isRightSize(int mid) {
		int cnt = 0; 
		// 블루레이 개수 
		
		int total = 0; 
		
		for(int i = 0; i<A.length; i++) {
			if (total + A[i] > mid) {
				// 강의 길이의 합이 블루레이 사이즈보다 크다면
				cnt ++;
				// 블루레이 개수를 1개 올리고 
				total = A[i];
				// 다음 요소를 넣어줌 
							}
			else {
				total += A[i];
			}
		}
		
		return cnt < M;
		// 사용자가 제공한 M보다 큰지 작은지에 대한 boolean값 return 
	}

}
