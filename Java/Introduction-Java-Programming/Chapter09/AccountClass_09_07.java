public class AccountClass_09_07 {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000D);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500D);
        account.deposit(3000D);
        System.out.printf("The id is %d%n",account.getId());
        System.out.printf("The balance is %4.2f%n",account.getBalance());
        System.out.printf("The monthly interest is %4.2f%%%n",account.getMonthlyInterestRate());
        System.out.printf("The date when the account was created %s",account.getDateCreated().toString());
    }
}

