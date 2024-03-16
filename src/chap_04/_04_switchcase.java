package chap_04;

public class _04_switchcase {
    public static void main(String[] args) {
//        Switch Case
//        1등 하면 전액 장학금
//        2등 하면 반액 장학금
//        3등 하면 반액 장학금
//        그 외는 장학금 대상 아님
        
        int ranking = 3; // 1등
        if(ranking == 1){
            System.out.println("전액 장학금");
        }else if(ranking == 2 || ranking == 3){
            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료");
        
//        Switch Case 문을 이용
        ranking = 4;
        switch (ranking){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금");
                break;
            default :
                System.out.println("장학금 대상자 아님");
        }
        System.out.println("조회 완료");

//        case 2와 case3을 통합

        ranking = 3;
        switch (ranking){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
            default :
                System.out.println("장학금 대상자 아님");
        }
        System.out.println("조회 완료");

//        중고 상품의 등급에 따른 가격을 책정 (1급 : 최상, 4급 : 최하)
        int grade = 2; // 등급
        int price = 7000; // 기본 가격
        switch (grade){
            case 1:
                price += 1000; // price = price + 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
        } // case1과 조건이 맞지 않으니 case1은 실행하지 않고 break도 없으니 case2로 넘어가서 실행함
        System.out.println(grade + "등급 제품의 가격: " + price + "원 입니다.");
//        1등급 제품의 가격은 10000원
//        2등급 제품의 가격은 9000원
//        3등급 제품의 가격은 8000원

//        범위에 해당하는 조건을 만족시키는 조건문 : if문
//        명확한 값을 비교하는 조건문 : Switch Case문
    }
}
