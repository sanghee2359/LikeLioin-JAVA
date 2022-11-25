package Week10.Date1125;

public class Recur {
    //recur(3)과 recur(4)의 결과를 실행해보지 않고 출력 해보세요.
    public static void recur(int n) {
        if (n <= 0) return;
        recur(n - 1);
        System.out.println(n);
        recur(n - 2);
    }
    public static void main(String[] args) {
        recur(3);
    }
}
