package Week4.Date1014;

import java.util.Arrays;

public class insertionSort {
    public void sort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            System.out.println();
            System.out.println("focus : arr["+i+"]="+arr[i]);
            System.out.println("현재"+Arrays.toString(arr));
            for(int j=i-1; j>=0; j--) {
                System.out.printf("arr["+j+"]="+arr[j]+"\n");
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    System.out.println("swap"+Arrays.toString(arr));
                }
            }
        }
    }

    public static void main(String[] args) {
        insertionSort s = new insertionSort();
        int arr[] = new int[]{8, 5, 6, 2, 4};
        s.sort(arr);
    }
}
