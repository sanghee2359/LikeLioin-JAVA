package Week5;

import java.util.Scanner;

public class RightTriangle {
    private char letter;
    public RightTriangle(){}
    public RightTriangle(char letter){
        this.letter = letter;
    }
    public void star(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.printf("%c", letter);
                if(i!=j) System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        RightTriangle r = new RightTriangle('@');
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        r.star(num);
    }
}
