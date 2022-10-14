package Week4.Date1014;

import java.util.Arrays;

public class insertionSort02 {
    public void swap(int[]arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public int[] sort(int[]arr){
        // i = 1일 때 arr[1] vs arr[0]
        // i = 2일 때 arr[2] vs arr[0]
        // i = 2일 때 arr[2] vs arr[0]
        for(int i = 1; i<arr.length; i++) {
            for(int j = i; j>0; j--) {
            if (arr[j] < arr[j - 1]) {
                swap(arr, j, j - 1);
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        insertionSort02 s = new insertionSort02();
        int[] arr = new int[]{8, 5, 6, 2, 4};
        arr = new int[]{8, 5, 6, 2, 4};
        int[] result = s.sort(arr);
        for(int x : result){
            System.out.println(x);
        }
    }
}
