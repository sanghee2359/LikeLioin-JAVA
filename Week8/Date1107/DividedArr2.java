package Week8.Date1107;

import Week8.Date1107.DividedArr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DividedArr2 {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0){
                list.add(arr[i]);
            }
        }
//        System.out.println(Q);
        if(list.size() == 0) return new int[]{-1};
        // list를 array로 자료구조 변경
        int [] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
    public static void main(String[] args) {
        DividedArr T = new DividedArr();
        int[] arr = {5, 9, 7, 10};
        System.out.println(Arrays.toString(T.solution(arr, 5)));
    }
}
