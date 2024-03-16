package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        /*int[] size = new int[10];
        int num = 250;
        for (int i = 0; i < size.length; i++) {
            System.out.println("사이즈 " + num + " (재고 있음)");
            num = num +5;
        }*/

        int[] sizeArray = new int[10];
        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + (5 * i);
            System.out.println("사이즈 " + sizeArray[i] + " (재고 있음)");
        }
        System.out.println("-----------------------");

        for (int size : sizeArray) {
            System.out.println("사이즈 " + size + " (재고 있음)");
        }
    }
}
