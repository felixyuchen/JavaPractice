import java.util.Scanner;

public class PhoneKeypads_6_21 {

    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String phoneString = scanner.nextLine();
        String convertedPhoneNumber = "";
        scanner.close();
        for (int i = 0; i < phoneString.length(); i++) {
            if (phoneString.charAt(i) >= 'a' && phoneString.charAt(i) <= 'z' || phoneString.charAt(i) >= 'A' && phoneString.charAt(i) <= 'Z') {
                convertedPhoneNumber += getNumber(phoneString.charAt(i));
            } else {
                convertedPhoneNumber += phoneString.charAt(i);
            }
        }
        System.out.println(convertedPhoneNumber);
    }

    public static int getNumber(char uppercaseLetter) {
        int number = 0;
        switch (uppercaseLetter) {
            case 'a':
            case 'b':
            case 'c':
            case 'A':
            case 'B':
            case 'C':
                number = 2;
                break;
            case 'd':
            case 'e':
            case 'f':
            case 'D':
            case 'E':
            case 'F':
                number = 3;
                break;
            case 'g':
            case 'h':
            case 'i':
            case 'G':
            case 'H':
            case 'I':
                number = 4;
                break;
            case 'j':
            case 'k':
            case 'l':
            case 'J':
            case 'K':
            case 'L':
                number = 5;
                break;
            case 'm':
            case 'n':
            case 'o':
            case 'M':
            case 'N':
            case 'O':
                number = 6;
                break;
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                number = 7;
                break;
            case 't':
            case 'u':
            case 'v':
            case 'T':
            case 'U':
            case 'V':
                number = 8;
                break;
            case 'w':
            case 'x':
            case 'y':
            case 'z':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                number = 9;
                break;
//            default:
//                number = uppercaseLetter;
//                break;
        }
        return number;
    }
}
