package Week4.Date1013;

public class bubbleSort {
    public void sort(int[] arr){
        for(int i = 0; i<arr.length; i++ ){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] > arr[j]) {
                    int temp = 0;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        bubbleSort s = new bubbleSort();
        int[] arr = new int[]{2, 7, 3, 9 , 28, 11};
        s.sort(arr);
    }
}
