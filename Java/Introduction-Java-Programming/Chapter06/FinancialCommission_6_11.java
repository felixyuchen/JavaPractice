public class FinancialCommission_6_11 {
    public static void main(String[] args) {
        double salesAmount = 10000;
        System.out.printf("%s%15s%n", "Sales Amount", "Commission");
        System.out.println("----------------------------");
        for (int i = 1; i <= 19; i++) {
            System.out.printf("%-6.0f%10s%8.1f%n", salesAmount, " ", computeCommission(salesAmount));
            salesAmount += 5000;
        }
    }

    public static double computeCommission(double salesAmount) {
        double computeCommission = 0;
        if (salesAmount <= 5000D) {
            computeCommission += salesAmount * 0.08;
        } else if (salesAmount <= 10000D) {
            computeCommission += (5000 * 0.08 + (salesAmount - 5000) * 0.1);
        } else {
            computeCommission += (5000 * 0.08 + 5000 * 0.1 + (salesAmount - 10000) * 0.12);
        }
        return computeCommission;
    }
}
