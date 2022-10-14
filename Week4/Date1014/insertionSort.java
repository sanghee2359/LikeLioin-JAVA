package Week4.Date1014;

import java.util.Arrays;

public class insertionSort {
    /*public void swap(int[]arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        System.out.println("swap");
    }*/
    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j;
            int temp = arr[i];
            System.out.println("focus : arr[" + i + "]=" + temp);
            for (j = i; j > 0 && arr[j-1]>temp ; j--) {
                System.out.printf("arr[" + (j-1) + "]=" + arr[j-1] + "\n");
                arr[j] = arr[j-1];
            }
            arr[j] = temp;
            System.out.println(Arrays.toString(arr));
        }
    }


    public static void main(String[] args) {
        insertionSort s = new insertionSort();
        int arr[] = new int[]{8, 5, 6, 2, 4};
        s.sort(arr);
    }
}
