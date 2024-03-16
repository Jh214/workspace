package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String birth = "010214-3083617";
        System.out.println(birth.substring(0, 8));
        System.out.println(birth.substring(0,birth.indexOf("-")+2));
    }
}
