import java.util.Scanner;

public class CheckPassword_6_18 {

    public static void main(String[] args) {
        System.out.print("Please enter password:");
        Scanner scanner = new Scanner(System.in);
        String pwd = scanner.nextLine();
        boolean isPWD = checkPassword(pwd);
        scanner.close();
        String isValid;
        if(isPWD){
            isValid = "Valid Password";
        }else {
            isValid = "Invalid Password";
        }
        System.out.printf("%s is %s.", pwd, isValid);
    }

    public static boolean checkPassword(String password) {
        int strLength = password.length();
        boolean isLetterOrDigit = true;
        int numberOfDigit = 0;
        boolean isValidPassword;
        for (int i = 0; i < strLength; i++) {
//            char charPassword = password.charAt(i);
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                isLetterOrDigit = false;
            }
            if (Character.isDigit(password.charAt(i))) {
                numberOfDigit += 1;
            }
        }
        isValidPassword = strLength >= 8 && isLetterOrDigit && numberOfDigit >= 2;
        return isValidPassword;
    }


}
