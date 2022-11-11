package Week8.Date1111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class secretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
//        String sArr1[] = new String[n];
//        String sArr2[] = new String[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                /*String biStr1 = getBinaryString(arr1[i]);
                String biStr2 = getBinaryString(arr2[i]);
                sArr1[i] = "0".repeat(n - biStr1.length())+biStr1; // n보다 작은만큼 repeat
                sArr2[i] = "0".repeat(n - biStr2.length())+biStr2;*/

                answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            }
        }
//        System.out.println(Arrays.toString(sArr1));
//        System.out.println(Arrays.toString(sArr2));
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
