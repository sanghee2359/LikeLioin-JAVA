package Week10.Date1122;
// array말고 list를 쓴 이유를 생각 해보세요.
// 값을 꺼내면서 list에 값이 없어지면? 탈출조건을 만들 수 있기 때문일 것 같다

import java.util.ArrayList;
import java.util.List;

public class ArraySum {
    static int sum = 0;
    public static int sum(List<Integer> nums){
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(7);
        nums.add(3);
        nums.add(2);
        nums.add(9);
        sum(nums);
    }
}
