package Week6.Date1024;
// 우선순위 큐 : 값이 들어가며 정렬됨 (FIFO)
/*
0. array를 잘라서 새로 만드는 것은 메모리를 많이 사용하므로 줄이기 위한 방안으로 우선순위 큐 사용
1. PriorityQueue에 fromidx부터 toidx까지 넣는다
2. n번만큼 꺼낸다
*/

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthNumSlice {
    static int[] arr;
    int result;
    int getKthNum(int[] command){
        int fromIdx = command[0];
        int toIdx = command[1];
        int nth= command[2]; //n번째
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = fromIdx-1; i<toIdx; i++){
            pq.add(arr[i]);
        }
        for( int i = 0; i < nth; i++){
            result = pq.poll();
        }
        return result;
    }

    public int[] solution(int[] arr, int[][] commands){
        this.arr = arr;
        int[] answer = new int[commands.length];
        for(int i = 0; i < commands.length; i++){
            answer[i] = getKthNum(commands[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        KthTest T = new KthTest();
        arr = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(T.solution(arr, commands)));
    }

}
