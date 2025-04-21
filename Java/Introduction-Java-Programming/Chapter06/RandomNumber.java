import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {
        Random random = new Random();

        int lowBound = 3000;
        int upperBound = 4000;
        int count = 10;

        for (int i = 0; i < count; i++) {
            int randomNumber = random.nextInt(upperBound - lowBound + 1) + lowBound;
            if (i < count - 1) {
                System.out.print(randomNumber + ", ");
            } else {
                System.out.println(randomNumber + ".");
            }
        }
    }
}
