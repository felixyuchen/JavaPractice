import java.util.Scanner;

public class NumberFormatException_12_01 {
    public static void main(String[] args) throws NumberFormatException{
        System.out.print("Please enter the numbers and calculator: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] stringInput = input.split(" ");
        scanner.close();
        if (stringInput.length != 3) {
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(1);
        }
        int result = 0;
        try {
            switch (stringInput[1].charAt(0)) {
                case '+':
                    result = Integer.parseInt(stringInput[0]) +
                            Integer.parseInt(stringInput[2]);
                    break;
                case '-':
                    result = Integer.parseInt(stringInput[0]) -
                            Integer.parseInt(stringInput[2]);
                    break;
                case '*':
                    result = Integer.parseInt(stringInput[0]) *
                            Integer.parseInt(stringInput[2]);
                    break;
                case '/':
                    result = Integer.parseInt(stringInput[0]) /
                            Integer.parseInt(stringInput[2]);
            }
        }
        catch (NumberFormatException ex){
            System.out.println("Wrong Input: " + ex.getMessage());
          //  System.out.println("Wrong Input: " + ex.getStackTrace());
            System.out.println("Wrong Input: " + ex.getCause());
            System.out.println("Wrong Input: " + ex);
            System.out.println("Wrong Input: " + ex.getLocalizedMessage());
            System.exit(1);
        }
        System.out.println(stringInput[0] + ' ' + stringInput[1] + ' ' + stringInput[2] + " = " + result);
    }
}
