package chap_06;

public class _05_MethodOverLoding {
    public static int getPower(int number) { // "4"
        int result = number * number;
        return result;
//        return number * number;
    }

    public static double getPower(double number) { // "4"
        double result = number * number;
        return result;
//        return number * number;
    }

    public static int getPower(String strNumber){
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
//        메소드 오버로딩 (이름이 같은 메소드를 여러 개 만듬)
//        같은 이름의 메소드를 여러 번 선언
//        1. 전달값의 타입이 다를 때
//        2. 전달값의 갯수가 다를 때
//        메소드 반환형은 달라도 오버로딩 안됨
        System.out.println(getPower(3)); // 3 * 3 = 9
        System.out.println(getPower("4")); // 4 * 4 = 16
        System.out.println(getPower(3,3)); // 3 ^ 3 = 27
        System.out.println(getPower(3.3));
    }
}
