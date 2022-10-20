package Week5.Date1018;

import java.util.Scanner;

public class CodeUp_1356 {
    public void Rct(int n){
        String answer = "";
        for(int i = 0; i < n; i++) {
            String printAll = "";
            for(int k = 0; k < n; k++) printAll += "*";
            if(i==0 || i==n-1) System.out.println(printAll);
            else if(i>0 && i<= n-2) {
                for(int j=0; j< n; j++) {
                    if(j==0 || j==n-1) System.out.println("*");
                }
            }
        }
    }
    public static void main(String[] args) {
        CodeUp_1356 T = new CodeUp_1356();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        T.Rct(n);
    }
}
