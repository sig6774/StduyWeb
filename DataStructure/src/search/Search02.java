package search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Search02 {
	
	public static int binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length-1;
		int mid; 
		
		
		while(left <= right) {
			mid = (left + right) /2 ; 
			
			if(arr[mid] > target) {
				right = mid-1;
			}
			else if (arr[mid] < target) {
				left = mid+1;
			}
			else {
				return 1;
			}
		}

		return 0; 
	}

	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] A = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(A);
		// 정렬 
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i<M; i++) {
			int target = Integer.parseInt(st.nextToken());
			if(binarySearch(A, target) != -1) {
				System.out.println(binarySearch(A, target));
			}
			else {
				System.out.println(binarySearch(A, target));
			}
			
		}
		
		
	}

}
