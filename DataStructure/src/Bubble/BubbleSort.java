package Bubble;

import java.util.Arrays;

public class BubbleSort {

	 public static void sort(int[] arr){

	        // 비교범위를 잡아주는 반복문
	        // 가장 큰 값을 맨 오른쪽으로 보내주기 위해 첫번째 반복문을 거꾸로 진행
	        for (int i = arr.length-1; i>0; i--){
	            // 실제 비교를 통한 정렬
	            boolean flag = false;
	            for (int j = 0; j <i; j++){
	                if (arr[j] > arr[j+1]){
	                    // swap
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;

	                    flag = true;
	                }
	            }
	            if (!flag) {
	                // flag가 false라면 swap이 발생하지 않았다는 뜻이므로 반복문 종료
	                break;
	            }
	        }
	    }
	 
	public static void main(String[] args) {
        int[] arr = {33, 11, 99, 1, 22, 88, 55, 44, 66, 77};
        sort(arr);
        System.out.println("정렬 후 : " + Arrays.toString(arr));
	}

}
