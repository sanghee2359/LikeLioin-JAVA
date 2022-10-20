package Week4.Date1012.Max;

public class Max01_1 {
    // arr를 받고 최대값을 구해서 int[]로 리턴
    public int[] getMax(int[] arr) {
        int maxIdx = 0;
        int maxValue = arr[0];

        // loop를 1부터 시작 : O(N) -> O(N-1)
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIdx = i;
            }
        }
        return new int[]{maxValue, maxIdx};
    }

    public static void main (String[]args){
        int[] arr = new int[]{3, 29, 38, 12, 57, 74, 40, 85, 61};
        Max01_1 max = new Max01_1();
        int[] result = max.getMax(arr);

        if (result[0] == 85 && result[1] == 8) {
            System.out.println("테스트 통과 했습니다.");
        } else {
            System.out.println("테스트를 통과하지 못했습니다." + result);
        }
    }
}

