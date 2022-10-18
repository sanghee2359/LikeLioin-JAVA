package Week5.Date1018;
import java.util.Scanner;
public class CodeUp_1859 {
    public void trinagle(int x,String now){
        if(x==0) return;
        else{
            System.out.println(now);
            trinagle(x-1, now+"*");
        }
    }

    public static void main(String[] args) {
        CodeUp_1859 T = new CodeUp_1859();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        T.trinagle(n, "*");
    }
}
