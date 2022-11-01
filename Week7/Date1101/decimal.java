package Week7.Date1101;

/* 문제
1. 한 자리 숫자가 적힌 종이조각을 붙여 소수를 몇 개 만들 수 있을지
 */
public class decimal {
    /*public int solution(String numbers) {
        int answer = 0;
        return answer;
    }*/
    boolean isPrime(int num){
        // num = 13이니까 2부터 12까지 나누어 보기
        for(int i = 2; i < num; i++){
            System.out.printf("[%d] remainder:%d\n",i ,num % i);
        }
        return true;
    }

    public static void main(String[] args) {
        decimal T = new decimal();
        T.isPrime(13);

    }
}
