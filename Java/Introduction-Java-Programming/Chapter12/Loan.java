import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    public Loan() {
        annualInterestRate = 2.5;
        numberOfYears = 1;
        loanAmount = 1000;
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        setAnnualInterestRate(annualInterestRate);
        setNumberOfYears(numberOfYears);
        setLoanAmount(loanAmount);
        loanDate = new Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate)
            throws IllegalArgumentException {
        if (annualInterestRate > 0)
            this.annualInterestRate = annualInterestRate;
        else
            throw new IllegalArgumentException("Annual interest rate cannot be less than or equals zero.");
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears)
            throws IllegalArgumentException {
        if (numberOfYears > 0) this.numberOfYears = numberOfYears;
        else
            throw new IllegalArgumentException("Number of years cannot be less than or equals zero.");
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount)
            throws IllegalArgumentException {
        if (loanAmount > 0) this.loanAmount = loanAmount;
        else
            throw new IllegalArgumentException("Loan amount cannot be less than or equals zero.");
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return monthlyPayment;
    }

    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }

    public Date getLoanDate() {
        return loanDate;
    }
}
