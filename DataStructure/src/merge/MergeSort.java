package merge;

import java.util.Arrays;

public class MergeSort {
	public static int[] temp;
	// 병합에 쓰일 임시배열 
	
	// 병합 정렬 알고리즘 
	public static void mergeSort(int[] arr, int s, int e) {
		// 정렬할 배열과 분할 시작과 끝 위치 매개값으로 줌  
		
		if  (e-s  < 1) {
			return;
			// 재귀 함수 종료 
		}
		
		// 분할의 중앙점 
		int mid = (s + e) / 2; 
		
		
		// 분할 작업을 쪼개지지 않을 때 까지 반복 
		mergeSort(arr, s, mid);
		mergeSort(arr, mid+1, e);
		
		// 병합 작업
		// 부분 배열을 임시 배열에 저장 
		for (int i = s; i <= e; i++) {
			temp[i] = arr[i];
		}
		
		// 포인터 2개 선언 
		int p1 = s; 
		int p2 = mid + 1; 
		
		int insertSpot = s; 
		
		while(p1 <= mid && p2 <= e) {
			if (temp[p1] < temp[p2]) {
				// 왼쪽 배열의 값이 더 작다면 왼쪽 배열 요소를 집어 넣고 그리고 포인터값, spot의 값 하나씩 올림 
				arr[insertSpot++] = temp[p1++];
			}
			
			
			else {
				arr[insertSpot++] = temp[p2++];
			}
		}
		
		// 왼쪽 or 오른쪽 배열이 먼저 소모된 경우에는 남아있는 쪽의 배열 요소를 마저 채워 넣어줌 
		while(p1 <= mid) {
			arr[insertSpot++] = temp[p1++];
		}
		while(p2 <= e) {
			arr[insertSpot++] = temp[p2++];
		}
		
		// 포인터 끼리 비교한 후 원본 배열에 넣어야할 위치를 지정 
	}
	
	/*
	 ex) 
	 arr = 3 7 4 2 
	 1. mergeSort(arr, 0, 3) => 0~3까지 arr의 값이 temp에 들어감 
	 2. mergeSort(arr, 0, 1) 
	 	=> temp : [3, 7, 0, 0]
	 	=> p1 = 0, p2 = 1
	 	=> insertSpot = 0
	 	=> arr[3,7, 0, 0]
	 	 
	 2-1. mergetSort(arr, 0, 0)
	 3. mergeSort(arr, 2, 3) 
	 	=> temp : [0, 0, 4, 2]
	 	=> p1=2, p2=3
	 	=> insertSpot = 2
	 	=> arr[0, 0, 2, 4]
	 3-1. mergetSort(arr, 3, 3)
	 
	 => 3,7과 2,4를 비교해서 2,3,4,7이 됨 
	 */
	
	public static void sort(int[] arr) {
		temp = new int[arr.length];
		
		mergeSort(arr, 0, arr.length-1);
	}
	

	public static void main(String[] args) {
        int[] arr = {33, 11, 99, 1, 22, 88, 55, 44, 66, 77};
        sort(arr);
        System.out.println("정렬 후 : " + Arrays.toString(arr));
		
	}

}
