package Week9.Date1116;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSortArray {
    int[] sort(int[] arr, int startIdx, int endIdx){
        // ---------------- 반복 ----------------------------
        int pivot = arr[arr.length / 2];
        while (arr[startIdx] < pivot) startIdx += 1;
        while (arr[endIdx] > pivot) endIdx -= 1;
        System.out.printf("교환 전 ,arr[4]:%d arr[7]:%d\n", arr[startIdx], arr[endIdx]);

        int tmp = arr[startIdx];
        arr[startIdx] = arr[endIdx];
        arr[endIdx] = tmp;

        startIdx += 1;
        endIdx -= 1;
        tmp = arr[startIdx];
        arr[startIdx] = arr[endIdx];
        arr[endIdx] = tmp;
        return arr;
    }
    public static void main(String[] args) {
        var arr = new int[]{20, 18, 5, 19, 40, 50, 5, 25};

        // left index는 0부터 시작한다.
        int leftidx = 0;
        int rightidx = arr.length - 1;
        System.out.println(Arrays.toString(arr));


    }
}
