package search;

public class Search {

	// 선형 탐색 
	public static int linearSearch(int[] arr, int target) {
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i+1;
			}
		}
		return -1;
	}
	
	// 이진 탐색 
	public static int binarySearch(int[] arr, int target) {
		// 왼쪽, 중앙, 오른쪽 포인터 선언 
		int left = 0; 
		int right = arr.length-1;
		int mid;
		
		while(left <= right) {
			mid = (left + right) / 2; 
			
			
			
			if(arr[mid] < target) {
				left = mid+1;
			}
			
			else if(arr[mid] > target) {
				right = mid-1;
			}
			
			else {
				return mid+1;
			}
		
		}
		
		return -1;
		
	
	}
	
	public static void main(String[] args) {
		
		int[] arr = {3, 7, 11, 12, 27, 49, 53, 68, 72, 91};
		
		int target = 53;
		
		
		System.out.println("Linear search  index : " + linearSearch(arr, target));
		System.out.println("Binary search  index : " + binarySearch(arr, target));
		
		
		
	}

}
