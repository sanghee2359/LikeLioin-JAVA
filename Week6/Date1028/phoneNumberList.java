package Week6.Date1028;

import java.util.HashSet;
import java.util.Scanner;

/* 문제
1. 최악의 경우 : 얼마나 느려질까를 고려
2. 제한사항 : phone_book의 길이는 1이상 1,000,000 이하
            각 전화번호의 길이는 1이상 20이하
            같은 전화번호가 중복해서 들어있지 않습니다.
            -> 하나의 번호가 다른 번호의 접두어로 들어가 있으면 false를 출력, 들어가 있지 않으면 true를 출력
3. indexOf() 메소드로 해당 글자가 몇번째 인덱스에 있는지 출력
*/
/* 설계
1. hashset에 전화번호부의 전화번호를 한개씩 add한다.
2. 중첩 for문을 통해서 값을 비교한다.
3. a.indexOf(b) == 0 이면 a가 b의 접두어인 것이므로, 조건문을 사용하여 판별한다.
4. HashSet O(1) X 20번 반복
 */
public class phoneNumberList {
    public boolean solution(String[] nums){
        HashSet<String> memo = new HashSet<>();
        for(var num : nums) memo.add(num); // var, 타입이 명백한 경우 사용할 수 있는 값 추가 방식

        for(int i = 0; i<nums.length; i++){
            for(int j = 0; j<memo.size(); j++){
                if(memo.contains(nums[i].subSequence(0,j)))
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        phoneNumberList T = new phoneNumberList();
        String[] phoneNumber = new String[]{"119", "97674223", "1195524421"};
        T.solution(phoneNumber);
    }
}
