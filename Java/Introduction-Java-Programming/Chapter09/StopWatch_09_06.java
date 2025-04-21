import java.util.Arrays;
import java.util.Random;

public class StopWatch_09_06 {
    public static void main(String[] args) {
// initial a array with 100,000
        int[] numberArray = new int[100000];
        Random random = new Random(100);
        for (int i = 0; i < 100000; i++) {
            numberArray[i] = random.nextInt(100);
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        selectionSort(numberArray);
        stopWatch.stop();
        System.out.println("The elapsed time of selection sort is: " + stopWatch.getElapsedTime());
        stopWatch.start();
        Arrays.sort(numberArray);
        stopWatch.stop();
        System.out.println("The elapsed time of sort method is: " + stopWatch.getElapsedTime());
    }

    public static void selectionSort(int[] sortingArray) {
        for (int i = 0; i < sortingArray.length; i++) {
            for (int j = i + 1; j < sortingArray.length; j++) {
                if (sortingArray[i] > sortingArray[j]) {
                    int temp = sortingArray[i];
                    sortingArray[i] = sortingArray[j];
                    sortingArray[j] = temp;
                }
            }
        }
        //return sortingArray;
    }

    public static class StopWatch {
        private long startTime;
        private long endTime;

        public StopWatch() {
            this.startTime = System.currentTimeMillis();
        }

        public void start() {
            this.startTime = System.currentTimeMillis();
        }

        public void stop() {
            this.endTime = System.currentTimeMillis();
        }

        public long getElapsedTime() {
            return this.endTime - this.startTime;
        }
    }
}
