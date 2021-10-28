public class EstimatePi_6_14 {
    public static void main(String[] args) {
        int number = 1;
        System.out.printf("%s%10s%n","i","m(i)");
        System.out.printf("%s%n","-------------------");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%-3d%10.4f%n", number, getPi(number));
            number += 100;
        }
    }
    public static double getPi (int number){
        double sumPi = 0D;
        for (int i = 1; i <= number; i++){
            sumPi += (double) 4 * (Math.pow(-1,(i+1))/(2 * i - 1));
        }
        return sumPi;
    }
}
