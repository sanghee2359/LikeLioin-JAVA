package Week6.Date1028;
/* 문제
1. 폰켓몬의 개수 nums 중 절반의 개수를 가져갈 수 있는데, 최대한 다양한 종류로 가져가는 것이 핵심
2. 그때의 폰켓몬의 종류 번호의 개수를 return
 */
/* 설계
1. 개수의 절반의 크기를 미리 int N 변수에 저장
2. 배열의 index 0부터 nums.length-1 까지 Hashset에 저장하고, 여러 개면 count++하기
3. if(N > Hashset.size()) answer = possible
4. else answer = Hashset.size()
 */
import java.util.HashSet;
import java.util.Scanner;

public class pocketmon {
    public static int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int answer = 0;
        int N = nums.length / 2;
        for(int i = 0; i<nums.length; i++){
            set.add(nums[i]);
        }
        if(set.size() < N){
            return set.size();
        }else {
            return N;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] nums = {3, 3, 3, 2,2,2};
        System.out.println(solution(nums));
    }
}
