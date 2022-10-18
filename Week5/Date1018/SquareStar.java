package Week5.Date1018;

public class SquareStar {
    private void printSquare(int n){    // 정사각형
        for (int i = 0; i < n; i++) {
            System.out.println("***");
        }
    }
    private void printRectangle(int x, int y) { // 직사각형
        for (int i = 0; i < y; i++) {
            System.out.println("*".repeat(x));
        }
    }
    public static void main(String[] args) {
        SquareStar star = new SquareStar();
        int size =3;
        star.printSquare(size);

        System.out.println();

        int x = 5, y = 10;
        star.printRectangle(x, y);
    }


}
