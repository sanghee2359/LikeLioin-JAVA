package Week4.Date1012.Min;

import Week4.Date1012.Max.Max01_1;

public class MinPractice {
    public int[] getMax(int[] arr) {
        int minIdx = 0;
        int minValue = arr[0];

        // loop를 1부터 시작 : O(N) -> O(N-1)
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minIdx = i;
            }
        }
        return new int[]{minValue, minIdx};
    }

    public static void main (String[]args){
        int[] arr = new int[]{-3, -29, -38, -12, -57, -74, -40, -85, -61};
        Max01_1 max = new Max01_1();
        int[] result = max.getMax(arr);

        if (result[0] == -3 && result[1] == 0) {
            System.out.println("테스트 통과 했습니다.");
        } else {
            System.out.println("테스트를 통과하지 못했습니다." + result);
        }
    }
}
