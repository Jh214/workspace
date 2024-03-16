package chap_06;

public class _01_Method {
//    메소드 정의
    public static void sayHello(){
        String[] coffees = {"아메리카노", "라떼", "카페모카", "카푸치노"};
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");
    }



    public static void main(String[] args) {
//        메소드 기능을 하는 코드 들의 묶음
//        메소드 호출
        System.out.println("메소드 호출 전");
        sayHello();
        System.out.println("메소드 호출 후");
    }
}
