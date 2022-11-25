package Week5.Date1021;

import java.util.Stack;

public class StackBracket {
    boolean solution(String s) {
        Stack<Character> st = new Stack<>();
        // 여는 괄호 ( > stack에 push()
        // 닫는 괄호 ) > st.pop()
        for(int i = 0; i<s.length(); i++){
            if('(' == s.charAt(i)){
                st.push(s.charAt(i));

            }else if(')' == s.charAt(i)){
                // empty일 때 닫는 괄호가 들어오면 짝이 안맞으면 return false
                if(st.empty()) return false;
                st.pop();
            }
        }
        return st.empty();
    }
}
