package Week7.Date1101;

/* 문제
1. 한 자리 숫자가 적힌 종이조각을 붙여 소수를 몇 개 만들 수 있을지
 */

public class primeNumber {
    boolean isPrime(int num){

        for(int i = 2; i < num ; i++){      // num = 13이니까 2부터 12까지 나누어 보기
            if(num % i == 0) return false;
        }
        return true;
    }
    boolean isPrime2(int num){

        for(int i = 2; i < num/2; i++){     // num의 절반의 크기까지 나누기
            if(num % i == 0) return false;
        }
        return true;
    }
    boolean isPrime3(int num){

        for(int i = 2; i*i < num; i++){     // 루트 미만까지 나누기
            if(num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        primeNumber T = new primeNumber();
        System.out.println(T.isPrime(5));
        System.out.println(T.isPrime2(13));
        System.out.println(T.isPrime3(13));
    }
}
