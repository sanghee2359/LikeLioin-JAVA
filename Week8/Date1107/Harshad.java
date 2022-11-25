package Week8.Date1107;

public class Harshad {
    public boolean solution(int x) {
        int number = x;
        int sumOfDigit = 0; // 자릿수의 합
        while(x>0) {
            sumOfDigit += x%10;
            x=x/10;
        }
//        System.out.printf("%d %d",x, sumOfDigit);
        if(number % sumOfDigit == 0) {
            return true;
        }
        else return false; // 자릿수의 합으로 나누어지는지
    }

    public static void main(String[] args) {
        Harshad T = new Harshad();
        System.out.println(T.solution(13));
    }
}
