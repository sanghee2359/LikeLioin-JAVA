package Week4.Date1013;
// 정렬 연습 : index 0의 값을 기준으로 index1 ~ n-1 각각을 비교해서 숫자가 작을경우 swap한다.

import java.util.Arrays;

public class sortPractice {
    public void sort(int[] arr){
        for(int i = 0; i<arr.length; i++ ){
            System.out.print("현재 index["+i+"]를 비교합니다.");
            System.out.println("arr["+i+"]="+arr[i]);

            for(int j = i+1; j<arr.length; j++){
                System.out.println("arr["+j+"]="+arr[j]);
                if(arr[i] > arr[j]) {
                    int temp = 0;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    System.out.println("swap"+Arrays.toString(arr));
                }
            }
        }
    }
    public static void main(String[] args) {
        sortPractice s = new sortPractice();
        int[] arr = new int[]{2, 7, 3, 9 , 28, 11};
        s.sort(arr);
    }
}
