package Week10.Date1123;

import java.util.Scanner;

public class Fibonacci {
    public static long fibonacci(int num) {
        if(num == 0 | num == 1) return num;
        else {
            return fibonacci(num-1) + fibonacci(num-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fibonacci(num));
    }
}
