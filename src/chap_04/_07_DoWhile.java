package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
//        반복문 DoWhile
        int distance = 25; // 전체 이동 거리 25m
        int move = 0; // 현재 이동 거리 0m
        int height = 2; // 키 2m
        while (move + height < distance){
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리는 : " + move);
            move += 3; // 3m 이동
        }
        System.out.println("도착하였습니다.");

//        DoWhile 반복문 = 일단 Do를 실행하고 While에 들어간 조건이 false일 때 까지 반복 (true이면 바로 반복문 종료)
        move = 0;
        height = 25;
        do {
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리는 : " + move);
            move += 3; // 3m 이동
        }while (move + height < distance);
        System.out.println("도착했습니다.");
    }
}
