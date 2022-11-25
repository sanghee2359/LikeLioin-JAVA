package Week10.Date1125;
// 꼬리재귀 = 맨 뒤에 있는 재귀

public class Recur {
    public static void recur(int n) { // n = 3
        while(n > 0){
            recur(n - 1);
            System.out.println(n);
            //recur(n - 2); 꼬리재귀 수정
            n = n - 2;
        }
    }
    public static void main(String[] args) {
        recur(3);
        // recur(3) -> recur(2), print(3) -> recur(1)
        // 결과
        // 1
        // 2
        // 3
        // 1
    }
}
