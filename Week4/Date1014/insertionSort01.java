package Week4.Date1014;

import java.util.ArrayList;
import java.util.Arrays;

public class insertionSort01 {
    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j;
            int temp = arr[i];
            for (j = i; j > 0 && arr[j-1]>temp ; j--) {
                arr[j] = arr[j-1];
            }
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        insertionSort01 s = new insertionSort01();
        int arr[] = new int[]{8, 5, 6, 2, 4};
        s.sort(arr);

    }
}
