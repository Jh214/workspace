package chap_03;

public class _03_Compare {
    public static void main(String[] args) {
//        문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java")); // 문자열 내용이 같으면 true, 다르면 false 즉, equals()는 문자열 비교
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분 없이 문자열 비교해줌

//        문자열 비교 심화
        s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보 (s2 참조)
        s2 = "1234";
        System.out.println(s1.equals(s2)); // true (내용)
        System.out.println(s1 == s2); // true (참조)

        s1 = new String("1234");
        s2 = new String("1234"); // new String()을 하게 되면 같은 문자가 들어가도 서로 다른 참조라고 인식함
        System.out.println(s1.equals(s2)); // true / 참조는 다르나 내용이 같기때문에 true
        System.out.println(s1 == s2); // false / ==는 s1과 s2의 참조가 같은지 비교하는 거임
//        자바에서 문자열이 일반적인 내용을 비교하고싶으면 ==이 아닌 .equals()를 사용해야 함

    }
}
