import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ATMMachine_10_07 {
    public static void main(String[] args) {
        Account[] account = new Account[10];
        for (int i = 0; i < account.length; i++) {
            account[i] = new Account();
            account[i].setId(i);
            account[i].setBalance(100D);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an id: ");
        String string = scanner.nextLine();
        String patternId = "[0-9]";
        while (!Pattern.matches(patternId, string)) {
            System.out.print("The id is not valid. Please re-enter an id: ");
            string = scanner.nextLine();
        }
        int inputId = Integer.parseInt(string);

        while (true) {
            displayMenu();
            System.out.print("Enter a choice: ");
            string = scanner.nextLine();
            String patternChoice = "[1-4]";
            while (!Pattern.matches(patternChoice, string)) {
                System.out.print("The choice is not valid. Please re-enter a choice: ");
                string = scanner.nextLine();
            }
            int inputChoice = Integer.parseInt(string);
            String patternAmount = "[0-9]+.?[0-9]?[0-9]?";
            Pattern patternAmount1 = Pattern.compile(patternAmount);

            switch (inputChoice) {
                case 1:
                    System.out.printf("The balance is %2.2f.%n", account[inputId].getBalance());
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Enter an amount to withdraw: ");
                    string = scanner.nextLine();
                    double withdrawAmount;
                    while (!Pattern.matches(patternAmount, string) || account[inputId].getBalance() < Double.parseDouble(string)) {
                        System.out.print("The number is not valid. Please re-enter a amount: ");
                        string = scanner.nextLine();
                    }
                    withdrawAmount = Double.parseDouble(string);
                    account[inputId].withdraw(withdrawAmount);
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Enter a amount to deposit: ");
                    string = scanner.nextLine();
                    Matcher isValid = patternAmount1.matcher(string);
                    while (!isValid.matches()) {
                        System.out.print("The number is not valid. Please re-enter a amount: ");
                        string = scanner.nextLine();
                    }
                    double depositAmount = Double.parseDouble(string);
                    account[inputId].deposit(depositAmount);
                    System.out.println();
                    break;

                case 4:
                    System.out.println();
                    System.out.print("Enter an id: ");
                    string = scanner.nextLine();
                    while (!Pattern.matches(patternId, string)) {
                        System.out.print("The id is not valid. Please re-enter an id: ");
                        string = scanner.nextLine();
                    }
                    inputId = Integer.parseInt(string);
                    break;

                default:
                    System.out.print("Please re-enter a choice: ");
                    break;
            }
        }
    }


    public static void displayMenu() {
        System.out.println("Main menu");
        System.out.println("1: check balance");
        System.out.println("2: withdraw");
        System.out.println("3: deposit");
        System.out.println("4: exit");
    }
}
