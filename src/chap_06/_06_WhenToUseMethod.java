package chap_06;

public class _06_WhenToUseMethod {
    public static int getPower(int number) { // "4"
        return getPower(number,3);
    }
    public static int getPower(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
//        메소드가 필요한 이유

//        2의 2승을 구하기
        System.out.println(getPower(2,2)); // 2 ^ 2 = 4

//        3의 3승 구하기
        System.out.println(getPower(3,3)); // 3 ^ 3 = 27

//        4의 2승 구하기
        System.out.println(getPower(4,2)); // 4 ^ 2 = 16

        System.out.println(getPower(2));
    }
}