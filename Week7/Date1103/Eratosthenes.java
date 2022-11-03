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
        /*for (int i = 2; i <= 50; i+=2) {
            checks[i] = false; // %연산 필요없다
        }
        for (int i = 4; i <= 50; i+=3) {
            checks[i] = false;
        }
        for (int i = 6; i <= 50; i+=4) {
            checks[i] = false;
        }
        for (int i = 8; i <= 50; i+=5) {
            checks[i] = false;
        }
        for (int i = 10; i <= 50; i+=6) {
            checks[i] = false;
        }
        for (int i = 12; i <= 50; i+=7) {
            checks[i] = false;
        }*/
    }
}
