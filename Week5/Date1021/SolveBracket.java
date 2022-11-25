package Week5.Date1021;

// stack 없이 문제풀이하기

public class SolveBracket {
    public boolean solution1(String s) {
        System.out.println(s.indexOf("()"));        // indexOf()와 replace()
        while(s.indexOf("()") >= 0){
            s = s.replace("()","");
        }
        return s.length() == 0;
    }

    public boolean solution2(String s){
        while(s.indexOf("()") >= 0) {
            String[] splitted = s.split("\\(\\)");  // split과 join
            s = String.join("", splitted);
            System.out.println(s);
        }
        return s.length() == 0;
    }
}
