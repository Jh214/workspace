package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
//        논리 연산자
        boolean kimchi = false;
        boolean egg = true;
        boolean pig = true;

        System.out.println(kimchi || egg || pig); // 하나라도 true 이면 true
        System.out.println(kimchi && egg && pig); // 모두 true 이면 true
        if (kimchi && egg && pig) {
            System.out.println("최고의 식당입니다.");
        } else {
            System.out.println("그닥인 식당입니다.");
        }
//        논리 부정 연산자
        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println(!(5 == 5)); // false
        System.out.println(!(5 == 3)); // true

    }
}
