package Week7.Date1101;
// Template Callback pattern
public class TemplateCallbackNumber {
    boolean isPrime(int num, PrimeDevider stmt){

        for(int i = 2; stmt.StatementStrategy(i, num); i++){      // num = 13이니까 2부터 12까지 나누어 보기
            if(num % i == 0) return false;
        }
        return true;
    }
    boolean isPrime2(int num, PrimeDevider stmt){

        for(int i = 2; stmt.StatementStrategy(i, num); i++){     // num의 절반의 크기까지 나누기
            if(num % i == 0) return false;
        }
        return true;
    }
    boolean isPrime3(int num, PrimeDevider stmt){

        for(int i = 2; stmt.StatementStrategy(i, num) ; i++){     // 루트 미만까지 나누기
            if(num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        primeNumber T = new primeNumber();
        System.out.println(T.isPrime(5, new PrimeDevider() {
            @Override
            public boolean StatementStrategy(int a, int b) {
                return a < b;
            }
        }));
        System.out.println(T.isPrime2(13, new PrimeDevider() {
            @Override
            public boolean StatementStrategy(int a, int b) {
                return a < b/2;
            }
        }));
        System.out.println(T.isPrime3(13, new PrimeDevider() {
            @Override
            public boolean StatementStrategy(int a, int b) {
                return a*a < b;
            }
        }));
    }
}
