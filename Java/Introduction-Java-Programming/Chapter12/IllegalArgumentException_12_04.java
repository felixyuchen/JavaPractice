public class IllegalArgumentException_12_04 {
    public static void main(String[] args) {
        try {
            Loan loan1 = new Loan(-1, 0, 1000);
            Loan loan2 = new Loan(1, 5, 20000);
            Loan loan3 = new Loan(3.2, 3, 0);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }
    }
}
