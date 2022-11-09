package Week8.Datte1109;

import java.util.Arrays;
interface SortStrategy{
    boolean apply(int a, int b);
}
public class selectionSortDesc {
    // 내림차순 정렬 방법 1 오름차순 정렬에서 방향 바꾸기
    public int[] selectionSortDesc(int[] arr){
        int swapIdx = 0, tmp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            swapIdx = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] > arr[swapIdx]) { //등호 방향만 바꿔서 내림차순 정렬
                    swapIdx = j;
                }
            }
            tmp = arr[swapIdx];
            arr[swapIdx] = arr[i];
            arr[i] = tmp;
        }
        return arr;
    }
    // 내림차순 정렬 방법 2 인터페이스와 람다식 활용
    public int[] selectionSortDesc(int[] arr, SortStrategy stmt){
        int swapIdx = 0, tmp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            swapIdx = i;
            for (int j = i+1; j < arr.length; j++) {
                if (stmt.apply(arr[swapIdx], arr[j])) {
                    swapIdx = j;
                }
            }
            tmp = arr[swapIdx];
            arr[swapIdx] = arr[i];
            arr[i] = tmp;
        }
        return arr;
    }
    public static void main(String[] args) {
        selectionSortDesc T = new selectionSortDesc();
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        // 내림차순 첫번째 방법
        T.selectionSortDesc(arr);
        System.out.println(Arrays.toString(arr));

        //내림차순 정렬
        T.selectionSortDesc(arr,(a,b) -> a<b); // arr[midIdx] < arr[j]
        System.out.println(Arrays.toString(arr));

        //오름차순 정렬
        T.selectionSortDesc(arr,(a,b) -> a>b);
        System.out.println(Arrays.toString(arr));

    }
}
