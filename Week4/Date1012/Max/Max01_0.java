package Week4.Date1012.Max;

import java.util.Scanner;

public class Max01_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[9];
        int max = Integer.MIN_VALUE;
        int maxIdx = 0;

        for(int i=0; i<9; i++){         // 1차원 배열에 값 입력
            num[i] = sc.nextInt();
        }

        for(int i=0; i< num.length; i++){
            if(max < num[i]) {          // max보다 큰 수이면 대입
                max = num[i];
                maxIdx = i+1;           // max일 때 index 값 대입
            }
        }
        System.out.println(max);
        System.out.println(maxIdx);
    }
}
