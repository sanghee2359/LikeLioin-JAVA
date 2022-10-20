package Week4.Date1011;

import java.util.Scanner;

public class SumOfDigit_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(n/10);   // 1234 / 10 몫 123
        System.out.println(n%10);   // 나머지 4

        System.out.println(n/10);   // 123 / 10 몫 12
        System.out.println(n%10);   // 나머지 3

        System.out.println(n/10);   // 12 / 10 몫 1
        System.out.println(n%10);   // 나머지 2
    }
}
/*
raw 코드 작성
 */