package Week4.Date1012.Max;
// 2차원 배열에서 최대값 찾기

import java.util.Scanner;

public class Max02_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[][]{
                {3, 23, 85, 34, 17, 74, 25, 52, 65},
                {10, 7, 39, 42, 88, 52, 14, 72, 63},
                {87, 42, 18, 78, 53, 45, 18, 84, 53},
                {34, 28, 64, 85, 12, 16, 75, 36, 55},
                {21, 77, 45, 35, 28, 75, 90, 76, 1},
                {25, 87, 65, 15, 28, 11, 37, 28, 74},
                {65, 27, 75, 41, 7, 89, 78, 64, 39},
                {47, 47, 70, 45, 23, 65, 3, 41, 44},
                {87, 13, 82, 38, 31, 12, 29, 29, 80}
        };
        int maxValue = arr[0][0];
        int[] maxIdx = {0, 0}; // i, j
        // loop 돌기
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){

                int a = arr[i][j];  // 가로 순회
                int b = arr[j][i];    // 세로 순회
                if(arr[i][j] > maxValue){
                    maxValue = arr[i][j];
                    maxIdx[0] = i;
                    maxIdx[1] = j;
                }
            }
        }
        System.out.println(maxValue);
        System.out.println("arr["+maxIdx[0]+", "+maxIdx[1]+"]");
    }
}
