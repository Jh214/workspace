package chap_04;

public class _01_if {
    public static void main(String[] args) {
//        조건문 if

//        시간정보  int형 변수
        int hour = 15; // 오전 10시
        if(hour < 14){
                System.out.println("아이스 아메리카노 + 1");
                System.out.println("샷추가");
            System.out.println("커피 주문 완료");
        }else if (hour > 14){
            System.out.println("14시가 넘었습니다.");
            System.out.println("14시 이후 커피는 몸에 좋지 않습니다.");
        }else{
            System.out.println("잘못된 시간입니다.");
        }

//        오전 2시 이전, 모닝 커피를 마시지 않은 경우?
        hour = 13;
        boolean morningCoffee; // 모닝 커피
        if(hour <= 10){
            morningCoffee = true;
        }else{
            morningCoffee = false;
        }
        if(hour < 14 && morningCoffee == false){ // 현재 시간이 14시 이전이고 모닝커피를 마시지 않았을 때를 모두 만족할 경우
            System.out.println("아이스 아메리카노 + 1");
        }else if (hour < 14 && morningCoffee == true){
            System.out.println("이미 커피를 마셨으니 드시지 마십시오.");
        }else{
            System.out.println("시간이 늦었으니 커피를 드시지 마십시오.");
        }
        System.out.println("커피 주문 완료");
        
//        오후 2시 이후이거나 모닝 커피를 마신 경우?
        hour = 15;
        morningCoffee = true;
        if(hour >= 14 || morningCoffee==true){ // 현재 시간이 14시보다 늦었거나 모닝커피를 마셨을 경우 중 하나만 만족할 경우
            System.out.println("아이스 아메리카노(디카페인) + 1");
        }
        System.out.println("커피 주문 완료");
    }
}
