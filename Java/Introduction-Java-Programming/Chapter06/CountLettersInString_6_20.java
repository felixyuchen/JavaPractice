import java.util.Scanner;

public class CountLettersInString_6_20 {

    public static void main(String[] args) {
        System.out.print("Please enter a string:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        System.out.println("The count letters in the string is " + countLetters(str) + ".");
    }

    public static int countLetters(String s) {
        int stringLength = 0;
        char cha;
        for (int i = 0; i < s.length(); i++) {
            cha = s.charAt(i);
            if (cha >= 'a' && cha <= 'z' || cha >= 'A' & cha <= 'Z') {
                stringLength += 1;
            }
        }
        return stringLength;
    }
}
