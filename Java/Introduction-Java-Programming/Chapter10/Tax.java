public class Tax {
    private int filingStatus;
    final static int SINGLE_FILER = 0;
    final static int MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER = 1;
    final static int MARRIED_SEPARATELY = 2;
    final static int HEAD_OF_HOUSEHOLD = 3;
    private int[][] brackets;
    private double[] rates;
    private int taxableIncome;

    public Tax() {
        brackets = new int[4][4];
        rates = new double[5];
        taxableIncome = 0;
    }

    public Tax(int filingStatus, int[][] brackets, double[] rates, int taxableIncome) {
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    public int[][] getBrackets() {
        return this.brackets;
    }

    public double[] getRates() {
        return this.rates;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public void setTaxableIncome(int taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double getTax() {
        double tax = 0;

        if (taxableIncome <= brackets[filingStatus][0])
            tax = taxableIncome * rates[0];
        else if (taxableIncome <= brackets[filingStatus][1])
            tax = brackets[filingStatus][0] * rates[0] + (taxableIncome - brackets[filingStatus][0]) * rates[1];
        else if (taxableIncome <= brackets[filingStatus][2])
            tax = brackets[filingStatus][0] * rates[0] +
                    (brackets[filingStatus][1] - brackets[filingStatus][0]) * rates[1] +
                    (taxableIncome - brackets[filingStatus][1]) * rates[2];
        else if (taxableIncome <= brackets[filingStatus][3]) {
            for (int i = 1; i < 3; i++) {
                tax += (brackets[filingStatus][i] - brackets[filingStatus][i - 1]) * rates[i];
            }
            tax += (taxableIncome - brackets[filingStatus][2]) * rates[3];
        } else if (taxableIncome <= brackets[filingStatus][4]) {
            for (int i = 1; i < 4; i++) {
                tax += (brackets[filingStatus][i] - brackets[filingStatus][i - 1]) * rates[i];
            }
            tax += (taxableIncome - brackets[filingStatus][3]) * rates[4];
        } else {
            for (int i = 1; i < 5; i++) {
                tax += (brackets[filingStatus][i] - brackets[filingStatus][i - 1]) * rates[i];
            }
            tax += (taxableIncome - brackets[filingStatus][4]) * rates[5];
        }
        return tax;
    }
}
