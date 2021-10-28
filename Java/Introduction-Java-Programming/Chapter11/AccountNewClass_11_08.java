public class AccountNewClass_11_08 {
    public static void main(String[] args) {
        AccountNew accountNew = new AccountNew("George", 1122, 1000);
        accountNew.setAnnualInterestRate(1.5);
        accountNew.deposit(30);
        accountNew.deposit(40);
        accountNew.deposit(50);
        accountNew.withdraw(5);
        accountNew.withdraw(4);
        accountNew.withdraw(2);
        System.out.println("The name is " + accountNew.getName() + ".");
        System.out.println("The monthly interest rate is " + accountNew.getMonthlyInterestRate() + ".");
        System.out.println("The balance is " + accountNew.getBalance() + ".");
        for (int i = 0; i < accountNew.getTransactions().size(); i++) {
            System.out.println(accountNew.getTransactions().get(i).toString());
        }
    }
}
