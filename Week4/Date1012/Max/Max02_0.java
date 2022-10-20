package Week4.Date1012.Max;

import java.util.Arrays;
import java.util.Scanner;

public class Max02_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
