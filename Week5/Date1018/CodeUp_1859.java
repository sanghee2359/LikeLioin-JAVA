package Week5.Date1018;

public class CodeUp_1859 {
    public void trinagle(int x){
        if(x==0) return;
        else{
            trinagle(x-1);
            System.out.println("*".repeat(x));
        }
    }

    public static void main(String[] args) {
        new CodeUp_1859().trinagle(5);
    }
}
