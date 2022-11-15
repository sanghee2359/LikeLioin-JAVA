package Week9.Date1115;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
    static List<Integer> left;
    static List<Integer> right;

    public List<Integer> solution(int pivot, int[] arr){
        // 2. 기준값 기준으로 왼쪽 오른쪽으로 나누어 담는 로직 구현
        for(int i = pivot-1 ; i >= 0; i--){
            if(arr[i] > arr[pivot]) {
                right.add(arr[i]);
            }else left.add(arr[i]);
        }
        for (int i = pivot+1; i < arr.length; i++) {
            if(arr[i] < arr[pivot]) {
                left.add(arr[i]);
            }else right.add(arr[i]);
        }
        System.out.println(left);
        System.out.println(right);
    }
    public static void main(String[] args) {
        left = new ArrayList<>();
        right = new ArrayList<>();
        int[] arr = new int[]{20, 18, 5, 19, 40, 50, 5, 25};
        // 1. 기준값 뽑는 로직 구현
        int pivot = arr.length/2;
        System.out.println(arr[pivot]);

    }
}
