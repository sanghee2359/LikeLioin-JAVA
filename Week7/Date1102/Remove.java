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
        int N = 50;
        for(int i = 2; i<= N; i++) {
            list.add(i);
        }
        for(int i = 0; i< list.size(); i++){
            if(list.get(i)%2 == 0 && list.get(i)>2) list.remove(i); // 다 삭제되지 않음
        }
        System.out.println(list);
        for(int i = 0; i<list.size(); i++){
            if(list.get(i)%3 == 0 && list.get(i)>3) list.remove(i); // 다 삭제되지 않음
        }
        System.out.println(list);
        for(int i = 0; i<list.size(); i++){
            if(list.get(i)% 5== 0 && list.get(i)>5) list.remove(i); // 다 삭제되지 않음
        }
        System.out.println(list);
        for(int i = 0; i<list.size(); i++){
            if(list.get(i)%7 == 0 && list.get(i)>7) list.remove(i); // 다 삭제되지 않음
        }
        System.out.println(list);
    }
}
