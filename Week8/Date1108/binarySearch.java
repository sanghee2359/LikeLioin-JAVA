package Week8.Date1108;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9,10,11};
        int num = sc.nextInt(); // 찾는 값
        int lt = 0, rt = nums.length-1; // 시작점(left), 끝점(right)
        int idx = 0;

        while(lt <= rt){
            // 중간값 찾기
            int mid = (lt+rt)/2;

            // 인덱스 옮기기
            if(mid < num) lt = mid+1;
            else rt = mid-1;

            // 같은지 비교하기
            if(mid == num) {
                System.out.println(idx+1);
                break;
            } else {
                // 이 배열에 같은 값이 없으면 -1 출력
                if(idx == nums.length-1) {
                    System.out.println(-1);
                    break;
                }
            }
            idx++;
        }
    }
}
