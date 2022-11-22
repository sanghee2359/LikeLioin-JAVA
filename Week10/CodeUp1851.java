package Week10;

import java.util.Scanner;

public class CodeUp1851 {
    public static void recursive(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.printf("*");
            recursive(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursive(n);
    }
}