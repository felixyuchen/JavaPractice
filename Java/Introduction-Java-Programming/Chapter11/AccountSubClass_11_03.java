public class AccountSubClass_11_03 {
    public static void main(String[] args) {
        Account account = new Account();
        CheckingAccount checkingAccount = new CheckingAccount(50);
        checkingAccount.setBalance(2000);
        SavingAccount savingAccount = new SavingAccount();
        System.out.printf("The checking account initial balance is %4.2f.%n",checkingAccount.getBalance());
        checkingAccount.withdraw(11.8);
        System.out.printf("The checking account balance is %4.2f.",checkingAccount.getBalance());
    }
}
