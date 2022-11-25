package Week7.Date1103;

import java.util.Arrays;

/*
속도 개선
1. add(), remove()를 하지 않는 것
2. 나머지 연산을 하지 않는 것 (% 모듈러 연산) -> 남아있는 소수의 배수들을 지우기
 ex) 소수 2의 배수 -> 2칸씩 이동
 ex) 소수 3의 배수 -> 3칸씩 이덩
 */
public class Eratosthenes {
    public static void main(String[] args) {
        int N = 50;
        int[] nums = new int[N-1];
        boolean[] checks = new boolean[nums.length];
        Arrays.fill(checks, true);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i+2;      // 2~50까지 nums에 채우기
        }

        // 소수의 배수 지우기
        for (int j = 0; j*j <= N; j++) {
            int multipleOf = nums[j];
            // 첫 항이 2
            for(int i = nums[j]+  j; i<nums.length; i+=multipleOf){
                checks[i] = false;
            }
        }
        System.out.println(Arrays.toString(checks));

        // nums[j]+j 가 2n인 이유는?
        int cnt = 0;
        for (int i = 0; i < checks.length; i++) {
            if(checks[i]) cnt++;
        }
    }
}
