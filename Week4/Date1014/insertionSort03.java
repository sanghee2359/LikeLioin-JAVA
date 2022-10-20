package Week4.Date1014;

import java.util.Arrays;
import java.util.Objects;

public class insertionSort03 {
    public void recursive(int[]arr, int i){
        if(i == 0) return;
        else {
            recursive(arr, i-1);
            int j = i;
            int temp = arr[i];
            System.out.println(Arrays.toString(arr));
            if(j > 0 && arr[j-1]>temp){
                recursive(arr, j);
                arr[j] = arr[j-1];

                }
            arr[j] = temp;
        }
    }
    /*public int[] sort(int[]arr, int i){
        // i = 1일 때 arr[1] vs arr[0]
        // i = 2일 때 arr[2] vs arr[0]
        // i = 2일 때 arr[2] vs arr[0]
        for(int i = 1; i<arr.length; i++) {
            for(int j = i; j>0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }*/
    public static void main(String[] args) {
        insertionSort03 s = new insertionSort03();
        int[] arr = new int[]{8, 5, 6, 2, 4};
        int i = 5;
        //int[] result = s.sort(arr, i);
        s.recursive(arr, i);
    }
}