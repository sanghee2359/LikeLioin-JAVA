package Week5.Date1017;

public class starRhombus {
    public void upStar(int n){
        for(int i=0; i<n; i++){
            for(int j=n-i-1; j>0; j--) {  // 공백(위치 조정)
                System.out.print(" ");

            }
            for(int j=0; j<i+1; j++){   // 별 개수만큼 출력
                System.out.printf("* ");
            }
            System.out.println();

        }
    }
    public void downStar(int n){
        for(int i=n-1; i>0; i--){       // n=5라면 아래 피라미드는 4개부터 출력
            for(int j=n-i; j>0; j--) {  // n=5라면 j = n-i = n-n+1 = 1
                System.out.print(" ");

            }
            for(int j=i; j>0; j--){
                System.out.printf("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        starRhombus s = new starRhombus();
        s.upStar(5);
        s.downStar(5);
    }
}
