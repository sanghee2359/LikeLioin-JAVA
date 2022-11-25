package Week5.Date1021;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolveBracketTest {
    @Test
    @DisplayName("괄호가 잘 풀리는지")
    void bracket() {    // 한글을 --> 영어로 괄호를 잘 푸는지 리턴하는
        SolveBracket sb = new SolveBracket();
        StackBracket st = new StackBracket();
//        assertTrue(sb.solution2("()()"));
//        assertTrue(sb.solution2("(())()"));
//        assertFalse(sb.solution2("())()("));
//        assertFalse(sb.solution2( "((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))))))))"));
        assertFalse(st.solution("((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))))))))"));
    }
    // 여는 괄호와 닫는 괄호가 연속해서 나오면 s에서 빼준다.
}