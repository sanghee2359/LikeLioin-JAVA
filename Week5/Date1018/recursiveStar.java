package Week5.Date1018;

public class recursiveStar {
    public void triangl(int x){
        if(x==0) return;
        else{
            triangl(x-1);
            System.out.println("*".repeat(x));
        }
    }

    public static void main(String[] args) {

        new recursiveStar().triangl(5);
    }
}