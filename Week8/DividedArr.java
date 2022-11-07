package Week8;

import java.util.PriorityQueue;

public class DividedArr {
    public PriorityQueue<Integer> solution(int[] arr, int divisor) {
        PriorityQueue<Integer> Q = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            Q.add(arr[i]);
        }
//        System.out.println(Q);
        if( % divisor == 0)
        return Q;
    }

    public static void main(String[] args) {
        DividedArr T = new DividedArr();
        int[] arr = {5, 9, 7, 10};
        System.out.println(T.solution(arr, 5));
    }
}
