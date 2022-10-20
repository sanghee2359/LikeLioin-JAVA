package Week4.Date1011;

import java.util.Scanner;

public class SumOfDigit_2 {
    public int solution(int n) {
        int answer = 0;

        // for문으로 가능할까?
        // while문
        while (n > 0) {
            answer += n % 10;
            n = n / 10;
            System.out.printf("origin:%d answer:%d\n", n, answer);
        }
        return answer;
    }
    public static void main(String[] args) {
        SumOfDigit_2 T = new SumOfDigit_2();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(T.solution(num));
    }

}
