package chap_04;

public class _09_MultipleTable {
    public static void main(String[] args) {
//        구구단

        for (int i = 1; i < 10; i++) {
            System.out.println(i + "단");
            for (int j = 1; j < 10; j++) {
                int sum = i * j;
                System.out.print(i + "*" + j + " = " + sum + " ");
            }
            System.out.println();
        }
    }
}
