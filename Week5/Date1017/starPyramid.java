package Week5.Date1017;

public class starPyramid {
    // 피라미드 = *의 위치도 신경써야 합니다.

    public void star(int n){
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
    public static void main(String[] args) {
        starPyramid s = new starPyramid();
        s.star(5);

    }
}
