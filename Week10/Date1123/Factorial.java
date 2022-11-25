package Week10.Date1123;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Factorial {
    public static int factorial(int num){
        if(num == 1) return num;
        return num*factorial(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(factorial(num));
    }
}
