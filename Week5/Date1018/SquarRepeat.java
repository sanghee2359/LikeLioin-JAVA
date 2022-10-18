package Week5.Date1018;

public class SquarRepeat {
    public void printRectangle(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("*".repeat(n));
        }
    }

    public static void main(String[] args) {
        new SquarRepeat().printRectangle(4);
    }
}