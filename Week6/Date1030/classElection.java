package Week6.Date1030;
/* 문제
1. 첫 줄에 반 학생수를 입력받고,
2. 둘째 줄에 N개의 투표용지에 쓰여진 각 후보의 기호들이 문자열로 입력된다
3. 가장 많이 누적된 기호가 학급 회장으로 당선된다.
 */
/* 설계
1. HashMap을 선언하고 기호를 Key로 설정
2. 불린 횟수만큼 value가 1씩 증가하도록 로직을 짠다
3. 반복문 안에서 map.put()
 */

import java.util.HashMap;

public class classElection {
    public void solution(String election){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<election.length(); i++){
            map.put('A',0);
            map.put('B',0);
            map.put('C',0);
            map.put(election.charAt(i),map.get(election.charAt(i)));
//            map.getOrDefault(election.charAt(i),0);
        }
        System.out.println(map.toString());
    }

    public static void main(String[] args) {
        classElection T = new classElection();
        String election = "BACBACCACCBDEDE";
//        System.out.println(T.solution(election));
        T.solution(election);
    }
}
