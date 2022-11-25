package Week5.Date1018;

public class CodeUp_1859 {
    public void trinagle(int x, String now){
        if(x==0) return;
        else{
            System.out.println(now);
            trinagle(x-1, now+"*");
        }
    }

    public static void main(String[] args) {
        new CodeUp_1859().trinagle(5,"*");
    }
}
