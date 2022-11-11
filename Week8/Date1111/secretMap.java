package Week8.Date1111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class secretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
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
        int arr1[] = new int[n];
        int arr2[] = new int[n];

    }
}
