package Week6.Date1024;

import java.util.Arrays;

public class KthTest {
    public int[] solution(int[] arr, int [][] commands){
        int answer[] = new int[commands.length];
        int idx = 0;
        for(int[] command : commands){
            // arrays를 slice
            int[] sliceArr = Arrays.copyOfRange(arr, command[0]-1, command[1]);
            Arrays.sort(sliceArr);
            answer[idx++] = sliceArr[command[2]-1]; // 정렬한 Array의 idx번째를 뽑습니다.
        }

        return answer;
    }

    public static void main(String[] args) {
        KthTest T = new KthTest();
        int[] arr = {1, 5, 2, 6 ,3, 7, 4};
        // 2부터 시작하면 5가 안뽑히므로 2 -1을 해주었습니다.
        int[] arr1 = Arrays.copyOfRange(arr,2 - 1 , 5);
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(T.solution(arr, commands)));
    }
}
