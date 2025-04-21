import java.util.ArrayList;
import java.util.Date;

public class AccountNew {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private String name;
    private ArrayList<Transaction> transactions;


    public AccountNew() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
        transactions = new ArrayList<>();
    }

    public AccountNew(int newId, double newBalance) {
        this.id = newId;
        this.balance = newBalance;
        this.dateCreated = new Date();
        this.annualInterestRate = 4;
        dateCreated = new Date();
        transactions = new ArrayList<>();
    }

    public AccountNew(String name, int newId, double newBalance) {
        this.name = name;
        this.id = newId;
        this.balance = newBalance;
        dateCreated = new Date();
        transactions = new ArrayList<>();
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
        Transaction transaction = new Transaction('W', amount, balance, "This is a withdraw.");
        transaction.setDate(new Date());
        transactions.add(transaction);
    }

    public void deposit(double amount) {

        this.balance += amount;
        Transaction  transaction = new Transaction('D', amount, balance, "This is a deposit.");
        transaction.setDate(new Date());
        transactions.add(transaction);
    }

    public String getName(){
        return name;
    }

    public ArrayList getTransactions(){
        return transactions;
    }
}
