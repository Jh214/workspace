package chap_04;

public class _08_NastedLoop {
    public static void main(String[] args) {
//        이중 반복문

//        별 (*) 사각형 만들기
        /*
        *****
        *****
        *****
        *****
        *****
        *****
        */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
//        별 왼쪽 삼각형 만들기
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        별 오른쪽으로 치우친 삼각형
        int k = 1;
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= k; j++) {
                System.out.print("*");
            }
            k += 1;
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4- i; j++) {
                System.out.print(" ");
            }
            for (int l = 0; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
