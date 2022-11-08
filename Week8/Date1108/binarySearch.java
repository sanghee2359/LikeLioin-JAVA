package Week8.Date1108;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num = sc.nextInt(); // 찾는 값

        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        int lt = 0, rt = nums.length-1; // 시작점(left), 끝점(right)
        int answer = 0;

        while(lt <= rt){
            // 중간값 찾기
            int mid = (lt+rt)/2;

            // 인덱스 옮기기
            if(nums[mid] < num) lt = mid+1;
            else rt = mid-1;

            // 같은지 비교하기
            if(nums[mid] == num) {
                answer = mid+1;
                break;
            }
        }
        if(answer == 0) System.out.println(-1);
        else System.out.println(answer);
    }
}
