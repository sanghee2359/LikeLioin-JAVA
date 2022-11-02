package Week7.Date1102;

/*
만든 리스트에서 2를 제외한 모든 2의 배수 지우기
리스트에 있는 원소의 개수와 원소 출력 해보기 – 잘 지웠는지 확인 하기 위함 - 1단계 9:40까지
만든 리스트에서 3을 제외한 모든 3의 배수 지우기
*/


import java.util.ArrayList;
import java.util.List;

public class Remove {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i<= 50; i++) {
            list.add(i);
        }
        for(int i = 1; i< 50; i++){
            System.out.printf(list.get(i)+" ");
        }
    }
}
