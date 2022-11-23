package Week10.Date1123;

import java.util.Scanner;

public class NumberOfDigits {
    public static int sumOfDigit(int num) {
        if(num == 0) return 0;
        return num%10 + sumOfDigit(num/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfDigit(n));

    }
}
