package Week8.Datte1109;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        System.out.println(Arrays.toString(arr));

        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if(arr[j]<arr[i]) {
                int tmp = arr[j];
                arr[j] = arr[i];
                arr[i] = tmp;
            }
        }
        System.out.println(Arrays.toString(arr));
        i = 1;
        for (int j = 1; j < arr.length; j++) {
            if(arr[j]<arr[i]) {
                int tmp = arr[j];
                arr[j] = arr[i];
                arr[i] = tmp;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
