package Week7.Date1101;

public class Devider2 implements PrimeDevider{
    @Override
    public boolean StatementStrategy(int a, int b) {
        return a < b/2;
    }
}
