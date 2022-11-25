package Week10.Date1125;

import java.io.IOException;
import java.util.Scanner;

public class GCDWhile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while(a!=b){
            if(a > b){
                a = a - b;
            } else if(a < b) {
                b = b - a;
            }
        }
        System.out.printf("%d %d", a, b);
    }
}
