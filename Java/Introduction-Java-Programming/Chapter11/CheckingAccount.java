public class CheckingAccount extends Account {
    private double overdraft;

    CheckingAccount(double overdraft) {
        this.overdraft = overdraft;
    }

    public void over() {
        double over = super.getBalance();
        if (over < 0 - overdraft)
            System.out.println("Error: exceed overdraft.");
    }

}
