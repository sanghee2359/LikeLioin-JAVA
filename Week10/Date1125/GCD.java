package Week10.Date1125;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class GCD {
    public static int GCD(int a, int b) {
        if(a == b) return a;
        else {
            if(a>b) return GCD(a - b, b);
            return GCD(a,b-a);
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(GCD(a,b));
    }
}
