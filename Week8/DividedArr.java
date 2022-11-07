package Week8;

import java.util.PriorityQueue;

public class DividedArr {
    public int[] solution(int[] arr, int divisor) {
        PriorityQueue<Integer> Q = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0){
                Q.add(arr[i]);
            }
        }
//        System.out.println(Q);
        if(Q.size() == 0 ) return new int[]{-1};
        int [] answer = new int[Q.size()];
        int idx = 0;
        while(!Q.isEmpty()){
            answer[idx++] = Q.poll();
        }

        return answer;
    }

    public static void main(String[] args) {
        DividedArr T = new DividedArr();
        int[] arr = {5, 9, 7, 10};
        System.out.println(T.solution(arr, 5));
    }
}
