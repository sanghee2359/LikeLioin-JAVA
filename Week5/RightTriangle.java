package Week5;

public class RightTriangle {
    public static void main(String[] args) {
        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");
        for(int i=0; i<4; i++){
            for(int j=0; j<i+1; j++ ){
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
