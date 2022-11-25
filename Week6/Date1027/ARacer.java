package Week6.Date1027;

import java.util.HashMap;

public class ARacer {
    public String solution(String[] participants, String[] completion){
        String answer = "";
        HashMap<String,Integer> map = new HashMap<>();

        for(int i = 0; i<participants.length; i++){
            String key = participants[i];
            if(!map.containsKey(key)){
                map.put(key,0); // 추가로 들어온 이름은 value = 0으로
            }
            map.put(key, map.get(key) + 1);
        }
        for(int i = 0; i<completion.length; i++){
            String key = completion[i];
            map.put(key, map.get(key) - 1);
        }
        for(String key : map.keySet()){
            if(map.get(key) == 1){
                return key;
            }
        }
        return answer;
    }
}
