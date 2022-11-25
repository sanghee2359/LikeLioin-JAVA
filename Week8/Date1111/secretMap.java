package Week8.Date1111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class secretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                answer[i] = Integer.toBinaryString(arr1[i] | arr2[i])
                        .replace("1","#").replace("0"," ");
                answer[i] = " ".repeat(n - answer[i].length())+answer[i];
            }
        }

        return answer;
    }
    String getBinaryString(int decNum){
        String answer = "";
        while(decNum > 0){
            answer += decNum%2; // java는 spring+int = string
            decNum = decNum/2;
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr1 = new int[]{9, 20, 28, 18, 11};
        int[] arr2 = new int[]{30, 1, 21, 17, 28};
        secretMap T = new secretMap();

        System.out.println(Arrays.toString(T.solution(n, arr1, arr2)));

        System.out.println();
        // System.out.println(Integer.toBinaryString(9));
    }
}
