package Week9.Date1116;

public class QuickSortArray {
    public static void main(String[] args) {
        var arr = new int[] {20, 18, 5, 19, 40, 50, 5, 25};
        int pivot = arr[arr.length]/2];
        System.out.println(pivot);
        // left index는 0부터 시작한다.
        int leftidx = 0;
        int rightidx = arr.length-1;
        while(leftidx <= rightidx){

            if(arr[leftidx] < pivot) leftidx++;
            else if(arr[rightidx] > pivot) rightidx--;

        }
    }
}
