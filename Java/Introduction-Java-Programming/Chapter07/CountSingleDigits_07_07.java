public class CountSingleDigits_07_07 {
    public static void main(String[] args) {
        int[] digits = new int[100];
        int[] counts = new int[10];
        for (int i = 0; i < 100; i++) {
            digits[i] = (int)(Math.random()*10);
        }
        for (int i = 0; i < 100; i++){
            counts[digits[i]] ++;
        }
        for (int i = 0; i < 10; i++)
            System.out.printf("%d ",counts[i]);
    }
}
