import java.util.Scanner;

public class FutureInvestmentValue_6_7 {

    public static void main(String[] args) {
        double investmentAmount, monthlyInterestRate, totalAmount;
        int years;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an investment amount:");
        investmentAmount = scanner.nextDouble();
        System.out.print("Please enter the monthly interest rate:");
        monthlyInterestRate = scanner.nextDouble();
        System.out.print("Please enter how many years:");
        years = scanner.nextInt();
        scanner.close();
        System.out.println("Years     Future Value");
        for (int i = 1; i <= years; i++) {
            totalAmount = futureInvestmentValue(investmentAmount, monthlyInterestRate, i);
            totalAmount = (double) Math.round(totalAmount * 100) / 100;
            System.out.println(i + "         " + totalAmount);
        }
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        monthlyInterestRate *= 0.01;
        double futureInvestmentValue = 0;
        double rateValue = 1;
        for (int i = 1; i <= years * 12; i++) {
            rateValue *= (1 + monthlyInterestRate / 12);
        }
        futureInvestmentValue += investmentAmount * rateValue;
        return futureInvestmentValue;
    }

}
