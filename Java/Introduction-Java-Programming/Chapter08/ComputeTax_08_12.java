import java.util.Scanner;
import java.util.regex.Pattern;

public class ComputeTax_08_12 {
    public static void main(String[] args) {
        mainMenu();
        System.out.print("Please enter a status: ");
        Scanner scanner = new Scanner(System.in);
        String inputStatus = scanner.nextLine();
        String patternStatus = "[1-4]";
        while (!Pattern.matches(patternStatus, inputStatus)) {
            System.out.print("The status is not valid. Please re-enter: ");
            inputStatus = scanner.nextLine();
        }
        int status = Integer.parseInt(inputStatus);

        System.out.print("Please enter the taxable income: ");
        String inputIncome = scanner.nextLine();
        String patternIncome = "[0-9]+.?[0-9]?[0-9]?";
        while (!Pattern.matches(patternIncome, inputIncome)) {
            System.out.print("The income is not valid. Please re-enter: ");
            inputIncome = scanner.nextLine();
        }
        double taxableIncome = Double.parseDouble(inputIncome);

        double tax = tax(status,taxableIncome);
        System.out.printf("Your taxable income is %2.2f and the tax is %2.2f.",taxableIncome,tax);
        }


    public static void mainMenu() {
        System.out.println("1: Single filer");
        System.out.println("2: Married jointly or qualifying widow(er)");
        System.out.println("3: Married separately");
        System.out.println("4: Head of household");
    }

    public static double tax(int status, double taxableIncome) {
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950},
                {16700, 67900, 137050, 20885, 372950},
                {8350, 33950, 68525, 104425, 186475},
                {11950, 45500, 117450, 190200, 372950}
        };
        double tax;

        if (taxableIncome <= brackets[status][0])
            tax = taxableIncome * rates[0];
        else if (taxableIncome <= brackets[status][1])
            tax = brackets[status][0] * rates[0] + (taxableIncome - brackets[status][0]) * rates[1];
        else if (taxableIncome <= brackets[status][2])
            tax = brackets[status][0] * rates[0] +
                    (brackets[status][1] - brackets[status][0]) * rates[1] +
                    (taxableIncome - brackets[status][1]) * rates[2];
        else if (taxableIncome <= brackets[status][3])
            tax = brackets[status][0] * rates[0] +
                    (brackets[status][1] - brackets[status][0]) * rates[1] +
                    (brackets[status][2] - brackets[status][1]) * rates[2] +
                    (taxableIncome - brackets[status][2]) * rates[3];
        else if (taxableIncome <= brackets[status][4])
            tax = brackets[status][0] * rates[0] +
                    (brackets[status][1] - brackets[status][0]) * rates[1] +
                    (brackets[status][2] - brackets[status][1]) * rates[2] +
                    (brackets[status][3] - brackets[status][2]) * rates[3] +
                    (taxableIncome - brackets[status][3]) * rates[4];
        else
            tax = brackets[status][0] * rates[0] +
                    (brackets[status][1] - brackets[status][0]) * rates[1] +
                    (brackets[status][2] - brackets[status][1]) * rates[2] +
                    (brackets[status][3] - brackets[status][2]) * rates[3] +
                    (brackets[status][4] - brackets[status][3]) * rates[4] +
                    (taxableIncome - brackets[status][4]) * rates[5];

        return tax;
    }
}
