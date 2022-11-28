package Week6.Date1027;

import java.util.HashMap;
import java.util.Scanner;

public class finishPlayer {
    public String hash(String[] key){
        String answer = "";
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0; i<key.length; i++){
            map.put(key[i], map.getOrDefault(key[i], 0)+1);
        }
        for(String x : map.keySet()){
            if(map.get(x)>0 && map.get(x)<2){
//                System.out.println("completion :"+ x);
            } else {
                answer += x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        finishPlayer T = new finishPlayer();
        Scanner sc = new Scanner(System.in);
        String [] player = new String[4];
        for(int i = 0; i<4; i++){
            player[i] = sc.next();
        }
        System.out.println(T.hash(player));
    }
}
