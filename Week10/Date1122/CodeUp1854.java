package Week10.Date1122;
// long long int 형 정수(n) 1개가 입력된다.
// (1 <= n <= 9223372036854775807)
import java.util.Scanner;

public class CodeUp1854 {
    static int sum = 0;
    public static void recursive(int n) {
        if (n == 0) {
            return ;
        } else {
            recursive(n-1);
            System.out.println(n);
            sum += n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursive(n);
        System.out.println(sum);
    }
}
