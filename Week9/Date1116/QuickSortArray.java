package Week9.Date1116;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSortArray {
    public static void main(String[] args) {
        var arr = new int[] {20, 18, 5, 19, 40, 50, 5, 25};
        int pivot = arr[arr.length/2];
        System.out.println(pivot);
        // left index는 0부터 시작한다.
        int leftidx = 0;
        int rightidx = arr.length-1;
        System.out.println(Arrays.toString(arr));

        /*while(true){

            if(arr[leftidx] < pivot) leftidx++; // pivot 왼쪽의 값들이 pivot보다 작으면 leftindex만 올라간다
            else {
                rightidx--;
                System.out.println(leftidx);
                int tmp = arr[leftidx];
                arr[leftidx] = arr[rightidx];
                arr[rightidx] = tmp;
            }
            leftidx++;
            rightidx--;
            if(leftidx > rightidx) break;
        }*/

        while(arr[leftidx] < pivot) leftidx += 1;
        while(arr[rightidx] > pivot) rightidx -= 1;

        int tmp = arr[leftidx];
        arr[leftidx] = arr[rightidx];
        arr[rightidx] = tmp;
        System.out.println(Arrays.toString(arr));
    }
}
