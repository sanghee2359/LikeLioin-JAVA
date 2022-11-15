package Week9.Date1115;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
    public List<Integer> merge(List<Integer>left, List<Integer>mid, List<Integer>right){
        List<Integer> answer = new ArrayList<>();
        answer.addAll(left);
        answer.addAll(right);
        answer.addAll(mid);
        return answer;
    }
    public List<Integer> sort(List<Integer> arr){
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> mid = new ArrayList<>();
        // 1. 기준값 뽑는 로직 구현
        int pivot = arr.size()/2;

        // 2. 기준값 기준으로 왼쪽 오른쪽으로 나누어 담는 로직 구현
        for(int i = 0 ; i < arr.size(); i++){
            if(arr.get(i) > pivot) right.add(arr.get(i));
            else if(arr.get(i) < pivot) left.add(arr.get(i));
            else mid.add(arr.get(i));
        }

//        System.out.println(left);
//        System.out.println(right);
        return merge(sort(left),sort(mid),sort(right));
    }
    public static void main(String[] args) {
        var arr = new int[]{20, 18, 5, 19, 5, 25, 40, 50};
        List<Integer> al = new ArrayList<>();
        for (int i = 0; i < al.size(); i++) {
            al.add(arr[i]);
        }
        QuickSort qs = new QuickSort();
        qs.sort(al);
        System.out.println(qs.sort(al));

    }
}
