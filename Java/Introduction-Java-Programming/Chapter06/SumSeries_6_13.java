public class SumSeries_6_13 {
    public static void main(String[] args) {
        int number = 20;
        System.out.printf("%s%10s%n", "i", "m(i)");
        for (int i = 1; i <= number; i++) {
            System.out.printf("%-2d%11.4f%n", i, computeSeries(i));
        }
    }
    public static double computeSeries(int number){
        double sumSeries = 0.0D;
        for (int i = 1; i <= number; i++){
            sumSeries += (double) i/(i+1);
        }
        return sumSeries;
    }
}
