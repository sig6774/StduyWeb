package Selection;

import java.util.Arrays;

public class SelectionSort {
	
    // 선택정렬 : 가장 작은 값을 찾아서 앞으로 이동시키면서 정렬
    public static void sort(int[] arr){
        for (int i = 0; i<arr.length; i++){
            int minIdx = i;

            // 최소값을 가지는 인덱스를 찾아야함

            for (int j = i+1; j<arr.length; j++){
                if (arr[j] < arr[minIdx]){
                    minIdx = j;
                    // 반복문을 진행하면서 가장 최소값이 있는 인덱스 값 들어감
                }
            }
            swap(arr, minIdx, i);
            // 최소값을 앞자리로 이동시키는 함수

//            int temp = arr[minIdx];
//            arr[minIdx] = arr[i];
//            // 최소값을 앞자리로 이동시킴
//            arr[i] = temp;
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        // 최소값
        arr[i] = arr[j];
        arr[j] = temp;
    }

	public static void main(String[] args) {
        int[] arr = {33, 11, 99, 1, 22, 88, 55, 44, 66, 77};
        sort(arr);
        System.out.println("정렬 후 : " + Arrays.toString(arr));

	}

}
