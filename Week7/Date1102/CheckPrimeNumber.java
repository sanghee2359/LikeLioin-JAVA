package Week7.Date1102;

import java.util.Arrays;

/*
1. 만든 Array크기의 checks 배열을 만듭니다
2. 만드 Array 대신 checks에 2를 제외한 모든 2의 배수에 false로 바꾸는 로직
3. 소수만 출력해보기.  checks에서 true인 num만 출력
 */
public class CheckPrimeNumber {
    public static void main(String[] args) {
        int N = 50;
        int[] nums = new int[N];
        boolean[] checks = new boolean[N];
        for (int i = 2; i <= N; i++) {
            nums[i - 2] = i;
            checks[i - 2] = true;
        }
        for (int j = 2; j * j <= nums.length; j++) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % j == 0 && nums[i] > j) checks[i] = false;
            }
        }
        // System.out.println(Arrays.toString(nums));
        // System.out.println(Arrays.toString(checks));
        for (int k = 0; k < checks.length; k++){
            if(checks[k] == true){
                System.out.printf((k+2) + " ");
            }
        }
    }
}
