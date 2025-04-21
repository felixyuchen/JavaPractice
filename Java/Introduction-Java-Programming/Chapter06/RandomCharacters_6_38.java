//package PACKAGE_NAME;
public class RandomCharacters_6_38 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.print((char) ('A' + Math.random() * ('Z' - 'A')) + " ");
        }
        System.out.println();
        for (int i = 0; i < 100; i++) {
            System.out.print((int) (Math.random() * 10) + " ");
        }

    }
}
