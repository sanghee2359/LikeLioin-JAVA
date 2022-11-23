package Week10.Date1123;

import java.util.ArrayList;
import java.util.List;

public class FibonacciList {
    public static int fibonacci(int num){
        if(num == 1 | num == 2) return 1;
        List<Integer> fibonacciNums = new ArrayList<>();
        fibonacciNums.add(1); // 0번 index
        fibonacciNums.add(1); // 1번 index
        for (int i = 2; i < num; i++) {  // num만큼의 arraylist를 만들 것
            fibonacciNums.add(fibonacciNums.get(i-1)+fibonacciNums.get(i-2));
        }
        return fibonacciNums.get(num - 1);  // num 위치의 피보나치 수열 값 꺼내기
    }
    // 1, 1, 2 이렇게 시작을 해서 앞에 두개를 더해 현재 값을 구합니다
    public static void main(String[] args) {
        System.out.println(fibonacci(8));
    }
}
