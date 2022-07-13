package quick;

import java.util.Arrays;

public class QuickSort {
	
	public static void sort(int[] arr) {
		quickSort(arr,0, arr.length-1);
	}

	/**
	 * 오른쪽 피벗 선택방식 
	 * 
	 * @param a : 정렬 배열 
	 * @param left : 현재 부분 배열의 왼쪽 
	 * @param right : 현재 부분배열의 오른쪽
	 */
	public static void quickSort(int[] a, int left, int right) {
		
		if(left >= right) {
			return;
			// 왼쪽 포인터가 오른쪽 포인터보다 크거나 같으면 정렬할 원소가 1개 이하임으로 메서드 종료 
			// 재귀 종료 조건 
		}
		/*
		 과정 
		 - 피벗을 기준으로 요소들이 왼쪽과 오른쪽으로 약하게 약하게 정렬된 상태로 만들어주고 최종적으로 pivot의 위치를 얻음 
		 
		 - 해당 피벗을 기준으로 왼쪽 부분 리스트와 오른쪽 부분리스트로 나누어 분할 정복 
		 */
		
		int pivot = partition(a, left, right);
		
		
		// 분할된 것을 다시 pivot을 기준으로 다시 sort진행 
		quickSort(a, left, pivot-1);
		quickSort(a, pivot+1, right);
		
	}
	
	/**
	 * pivot을 기준으로 파티션을 나누기 위한 약한 정렬 메서드 
	 * 
	 * @param a : 정렬할 배열 
	 * @param left : 현재 배열의 가장 왼쪽 부분 
	 * @param right : 현재 배열의 가장 오른쪽 부분 
	 * @return : 최종적으로 위치한 pivot값 
	 */
	
	public static int partition(int[] a, int left, int right) {
		
		int start = left - 1; 
		int end = right; 
		int pivot = a[right]; 
		// pivot 설정 
		
		// start가 end보다 작을 때 까지만 반복 
		while (start < end) {
			//  end가 start보다 크면서 start요소가 pivot보다 큰 원소를 찾을 때 까지 start를 하나씩 증가
			while(a[++start] < pivot);
			// do while로 작성할 수 있음
			
			// end가 start보다 크면서 end의 요소가 pivot보다 작거나 같은 원소를 찾을 때 까지 end를 하나씩 감소 
			while(start < end && a[--end] >= pivot);
			// do while로 작성할 수 있음 
			
			swap(a, start, end);
			// 값을 swap 

			
		}
		
		// 반복문이 끝났다는 것은 start가 end와 같아졌다는 뜻 
		// 맨처음 pivot으로 설정했던 위치의 원소와 end가 가리키는 원소를 서로 swap
		// end는 --를 통해 계속 왼쪽으로 이동하고 start와 end가 같으면 해당 자리를 다시 pivot으로 설정 
		swap(a, right, end);
		
		return end;
		// 두 요소가 교환되었다면 피벗이였던 요소는 end에 위치하므로 end를 반환 
		// 이제부터 pivot은 end 
		// end를 기준으로 왼쪽은 end보다 작은값이고 오른쪽은 end보다 큰 값으로 진행 
		
	}
	
	// 위의 두 반복문이 멈췄다면 start와 end가 가리키는 값을 서로 swap
	public static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
		// 값 swap 
	}

	public static void main(String[] args) {
		
        int[] arr = {33, 11, 99, 1, 22, 88, 55, 44, 66, 77};
        sort(arr);
        System.out.println("정렬 후 : " + Arrays.toString(arr));
	}

}
