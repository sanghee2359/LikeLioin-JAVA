package Week7.Date1031;
/* 문제
1. 모의고사를 볼 때 세 사람 각각 찍는 패턴이 있다.
2. 이때 문제의 답변과 일치하는 개수를 return
3. 가장 높은 점수를 받은 사람이 여럿일 경우 오름차순으로 정렬한다.
 */
/* 설계
1. 배열 전체를 비교해야 하니 반복문으로 비교
2. 만약 정수가 같다면 cnt++;
 */
public class mockExam {
    public int[] solution(int[] answer){
        int[] first = new int[]{1,2,3,4,5};

        int firstStudentAnserCnt = 0; // 12345 패턴으로 찍는 학생이 몇 문제를 맞추었는지 찾는 코드
        for(int i = 0; i< answer.length; i++) {
            if(answer[i] == first[i]){
                firstStudentAnserCnt++;
            }
        }
        System.out.println(firstStudentAnserCnt);
        return first;
    }

    public static void main(String[] args) {
        mockExam T = new mockExam();
        int[] answer = new int[]{1,2,3,4,5};
        System.out.println(T.solution(answer));
    }

}
