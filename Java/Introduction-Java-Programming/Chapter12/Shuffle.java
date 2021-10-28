import java.util.Arrays;
import java.util.Random;

public class Shuffle {
    public static void main(String[] args) {
        int[] lottery = new int[5];
        Random random = new Random();
        int lotterySpec;
        for (int i = 0; i < lottery.length; i++) {
            lottery[i] = random.nextInt(71);
        }
        lotterySpec = random.nextInt(26);
        Arrays.sort(lottery);
        for (int j : lottery) System.out.printf("%d, ", j);
        System.out.println();
        System.out.println(lotterySpec);
    }
}
