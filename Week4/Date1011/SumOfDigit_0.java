package Week4.Date1011;

// (PG) 자릿수 더하기

import java.util.Scanner;

public class SumOfDigit_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        String str = String.valueOf(num);
        char[] arr = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            sum += arr[i]-'0';
        }
        System.out.println(sum);
    }
}
/*
String->Integer->String : 500mb 처리하는데 시간이 오래걸림
 */