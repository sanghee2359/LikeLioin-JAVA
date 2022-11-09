package Week8.Datte1109;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        int minIdx = 0, tmp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            minIdx = i;
            for (int j = i+1; j < arr.length; j++) {

                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            tmp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = tmp;

            System.out.println(Arrays.toString(arr));
        }
    }
}

