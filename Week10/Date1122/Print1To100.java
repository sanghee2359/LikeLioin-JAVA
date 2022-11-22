package Week10.Date1122;

public class Print1To100 {
    public static void print1To100(int n){
        if(n == 100) {
            System.out.println(n);
            return ;
        }
        else {
            System.out.println(n);
            print1To100(n+1);
        }
    }
    public static void main(String[] args) {
        Print1To100 T = new Print1To100();
        print1To100(1);
    }
}
