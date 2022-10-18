package Week5.Date1018;

public class SquareStar {
    private void printSquare(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("***");
        }
    }
    private void printRectangle(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("****");
        }
    }
    public static void main(String[] args) {
        SquareStar star = new SquareStar();
        int size =3;
        star.printSquare(size);

        System.out.println();

        size = 4;
        star.printRectangle(size);
    }


}
