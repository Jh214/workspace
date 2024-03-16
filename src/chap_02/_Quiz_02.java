package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int small = 115;
        int tall = 121;
        int con = 120;

        String result = (small >= con) ? "탑승 가능합니다." : "탑승 불가능합니다.";
        System.out.println("키가" + small + "cm 이므로 " + result);
        String result2 = (tall >= con) ? "탑승 가능합니다." : "탑승 불가능합니다.";
        System.out.println("키가" + small + "cm 이므로 " + result2);
    }
}
