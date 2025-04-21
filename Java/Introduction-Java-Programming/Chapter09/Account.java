import java.util.Date;

public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    public Account(int newId, double newBalance) {
        this.id = newId;
        this.balance = newBalance;
        this.dateCreated = new Date();
        this.annualInterestRate = 4;
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }

    public void setAnnualInterestRate(double newAnnualInterestRate) {
        this.annualInterestRate = newAnnualInterestRate;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }


    public double getMonthlyInterestRate() {
        return this.getAnnualInterestRate() / 12;
    }

    public double getMonthlyInterest() {
        return this.getBalance() * (this.getMonthlyInterestRate() / 100);
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
}

