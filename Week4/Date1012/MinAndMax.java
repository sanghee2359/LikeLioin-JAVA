package Week4.Date1012;
// 기술부채를 해결해 줄 Polymolpism

interface Compare{
    boolean doSomething(int valueA, int valueB);
}

public class MinAndMax {
    private int getMinOrMax(int[] arr, Compare compare) {   // 템플릿 callback 패턴
        int targetValue = arr[0];

        // loop를 1부터 시작 : O(N) -> O(N-1)
        for (int i = 1; i < arr.length; i++) {
            boolean isSth = compare.doSomething(arr[i], targetValue);
            // max인 경우 arr[i] > targetValue
            // min인 경우 arr[i] < targetValue
             if (isSth) {
                targetValue = arr[i];
            }
        }
        return targetValue;
    }

    public int max(int[] arr){ // max값 구하기
        return getMinOrMax(arr, new Compare() {
            @Override
            public boolean doSomething(int valueA, int valueB) {
                return valueA > valueB;
            }
        });
    }

    public int min(int[] arr) {
        return getMinOrMax(arr, new Compare() {
            @Override
            public boolean doSomething(int valueA, int valueB) {
                return valueA < valueB;
            }
        });
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 29, 38, 12, 57, 74, 40, 85, 61};
        MinAndMax minAndMax = new MinAndMax();
        int maxR = minAndMax.max(arr);
        int minR = minAndMax.min(arr);
        System.out.println("최대값 :"+ maxR +", 최소값 :"+minR);
    }
}
