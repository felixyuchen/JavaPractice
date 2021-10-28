public class TaxClass_10_08 {
    public static void main(String[] args) {
        int[][] brackets2009 = {{8350, 33950, 82250, 171550, 372950},
                {16700, 67900, 137050, 20885, 372950},
                {8350, 33950, 68525, 104425, 186475},
                {11950, 45500, 117450, 190200, 372950}};
        double[] rates2009 = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        int taxableIncome = 50000;
        Tax tax2009 = new Tax();
        tax2009.setBrackets(brackets2009);
        tax2009.setRates(rates2009);
        System.out.println("2009 United States Federal Personal Tax Rates");
        printTableTitle();
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d", taxableIncome);
            tax2009.setTaxableIncome(taxableIncome);
            for (int j = 0; j < 4; j++) {
                tax2009.setFilingStatus(j);
                System.out.printf("%25.2f", tax2009.getTax());
            }
            taxableIncome += 1000;
            System.out.println();
        }
        System.out.println();

        int[][] brackets2001 = {{27050, 65550, 136750, 297350},
                {45200, 109250, 166500, 297350},
                {22600, 54625, 83250, 148675},
                {36250, 93650, 151650, 297350}};
        double[] rates2001 = {0.15, 0.275, 0.305, 0.355, 0.391};
        taxableIncome = 50000;
        Tax tax2001 = new Tax();
        tax2001.setBrackets(brackets2001);
        tax2001.setRates(rates2001);
        System.out.println("2001 United States Federal Personal Tax Rates");
        printTableTitle();
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d", taxableIncome);
            tax2001.setTaxableIncome(taxableIncome);
            for (int j = 0; j < 4; j++) {
                tax2001.setFilingStatus(j);
                System.out.printf("%25.2f", tax2001.getTax());
            }
            taxableIncome += 1000;
            System.out.println();
        }
    }

    public static void printTableTitle(){
        System.out.println("                                       Married filing jointly             Married filing           ");
        System.out.println("Tax rate         Single filers         or qualifying widow(er)            separately              Head of household ");
    }
}
