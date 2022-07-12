package Insertion;

import java.util.Arrays;

public class InsertionSort {

    public static void sort(int[] arr){
        for (int i = 1; i<arr.length; i++){
            int temp = arr[i];
            // 기준 값

            int j = i-1;

            while (j >= 0 && temp < arr[j]){
                arr[j+1] = arr[j];
                j--;
                // 값을 이동하면서 shift하는 로직
            }
            arr[j+1] = temp;
        }
    }
    
	public static void main(String[] args) {
        int[] arr = {33, 11, 99, 1, 22, 88, 55, 44, 66, 77};
        sort(arr);
        System.out.println("정렬 후 : " + Arrays.toString(arr));

	}

}
