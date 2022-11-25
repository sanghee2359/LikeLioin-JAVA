package Week9.Date1114;

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        // N-1개 arr생성 후 개수 확인(N = 50)
        int N = 50;
        int [] sieve = new int[N-1];
        for (int i = 0; i < sieve.length; i++) {
            sieve[i] = i+2;
            System.out.println(sieve[i]);
        }

        int i = 0;
        for (int j = sieve[i]; j < sieve.length; j++) {
            sieve[j] = 0;
        }

       /* for (int i = 0; i < 49; i++) {
            System.out.println("result: "+ sieve[i]);
        }*/
    }
}
