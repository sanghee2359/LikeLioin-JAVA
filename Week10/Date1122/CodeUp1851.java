package Week10.Date1122;

import java.util.Scanner;

public class CodeUp1851 {
    public static void recursive1(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.printf("*");
            recursive1(n - 1);
        }
    }
    public static String recursive2(int n) {
        if (n == 0) {
            return "";
        } else {
            return "*" + recursive2(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursive1(n);
        System.out.println();
        System.out.println(recursive2(n));
    }
}