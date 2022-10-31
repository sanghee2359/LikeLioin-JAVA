package Week7.Date1031;

import java.util.Arrays;

/* 문제
1. 모의고사를 볼 때 세 사람 각각 찍는 패턴이 있다. 문제는 maximum 10,000
2. 이때 문제의 답변과 일치하는 개수를 return
3. 가장 높은 점수를 받은 사람이 여럿일 경우 오름차순으로 정렬한다.
 */
/* 설계
1. 배열 전체를 비교해야 하니 반복문으로 비교한다. 만약 정수가 같다면 cnt++;
2. 최대 맞춘 개수가 같다면 오름차순 정렬
[5, 0, 0] --> [1]
[2, 2, 2] --> [1,2,3]
[1, 0, 1] --> [1, 3]
3. max와 같으면 append한다.
 */
public class mockExam {
    public int[] solution(int[] answer){
        int[] first = new int[]{1,2,3,4,5}; // "12345".reapeat(4000)
        int[] second = new int[]{ 2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = new int[]{ 2, 1, 2, 3, 2, 4, 2, 5};

        int[] count = new int[3];
        int[] result = new int[3];
        int len = 0;
        for(int i = 0; i< answer.length; i++) {
            
            if(answer[i] == first[i]){
                count[0]++;
            }
            if(answer[i] == second[i]){
                count[1]++;
            }
            if(answer[i] == third[i]){
                count[2]++;
            }
        }
        for(int i = 0; i<count.length; i++){
            int max = 0;
            if(max < count[i]) max = count[i];
            else if(max == count[i]) result[i] = i;
        }
        return result;
    }

    public static void main(String[] args) {
        mockExam T = new mockExam();
        int[] answer = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(T.solution(answer)));
    }

}
