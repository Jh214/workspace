package chap_03;

public class _04_escapeSequence {
    public static void main(String[] args) {
//        특수문자, 이스케이프 문자(Escape Sequence, Escape Character, Special Character
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        System.out.println("자바가\n너무\n재밌어요"); // \n = 줄바꿈
        
//        해물파전 9000원
//        김치전 8000원
//        부추전 8000원
        System.out.println("해물파전\t9000원"); // \t는 키보드 Tab과 같은 효과를 줌
        System.out.println("김치전\t8000원");
        System.out.println("부추전\t8000원");

        System.out.println("C:\\Program Files\\Java"); // \하나를 그대로 표현하고 싶으면 \를 두 번 써야함

//        단비가 "냐용" 이라고 했어요
        System.out.println("단비가 \"냐용\" 이라고 했어요"); // 문자열 중간에 ""를 넣고싶으면 "앞에 \를 붙여주면 됨

//        \' : 문자열 안 작은따옴표
//        단비가 '뭘 봐?' 라는 표정을 지었어요
        System.out.println("단비가 \'뭘 봐?\' 라는 표정을 지었어요"); // 출력 결과: 단비가 '뭘 봐?' 라는 표정을 지었어요
        System.out.println("단비가 '뭘 봐?' 라는 표정을 지었어요"); // 출력 결과: 단비가 '뭘 봐?' 라는 표정을 지었어요
        
//        \'가 필요한 상황
        char c = 'A';
        c = '\''; // 이런식으로 char변수에 '하나만 집어넣고 싶으면 \를 붙여주면 됨
        System.out.println(c);

        
    }
}
