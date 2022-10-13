package Week4.Date1013;
// 버블 정렬 : 배열에서 접해있는 두 숫자를 비교한다

import java.util.Arrays;

public class bubbleSort {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println((i+1)+"바퀴");
            for (int j = 0; j < arr.length-1; j++) {
                System.out.printf("현재 index[" + j + "]와 index["+(j+1)+"]를 비교합니다.\n");
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                System.out.println("정렬 단계" + Arrays.toString(arr));
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort s = new bubbleSort();
        int[] arr = new int[]{2, 7, 3, 9, 28, 11};
        s.sort(arr);
    }
}