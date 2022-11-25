package Week10.Date1125;

public class Recur {
    //recur(3)과 recur(4)의 결과를 실행해보지 않고 출력 해보세요.
    public static void recur(int n) { // n = 3
        if (n <= 0) return; // 0 이하면 종료
        recur(n - 1);
        System.out.println(n); // 1 실행
        recur(n - 2); //
    }
    public static void main(String[] args) {
        recur(3);
        // n=3, recur(2) -> n=2, recur(1) -> n=1, print(1), recur(1) -> 종료조건 도달 -> recur(1) 종료 -> print(2) -> 종료조건 -> print(3) -> n = 3-1, recur(1) -> print(1)
        // 결과
        // 1
        // 2
        // 3
        // 1
    }
}
