import java.util.Arrays;

public class ExecutionTime_07_16 {
    public static void main(String[] args) {
        int[] tenThousand = new int[100000];
        for (int i = 0; i < 100000; i++) {
            tenThousand[i] = (int) (Math.random() * 4294967295L) + (-2147483648);
        }
        int key = (int) (Math.random() * 4294967295L) + (-2147483648);
        long linearSearchStartTime = System.nanoTime();
        int linearSearchResult = linearSearch(tenThousand, key);
        long linearSearchExecutionTime = System.nanoTime() - linearSearchStartTime;
        long linearSearchExecutionSeconds = linearSearchExecutionTime / 1000;
        System.out.printf("The linear search result is %d and the execution time is %s seconds.%n", linearSearchResult, linearSearchExecutionSeconds);
        Arrays.sort(tenThousand);
        long binarySearchStartTime = System.nanoTime();
        int binarySearchResult = binarySearch(tenThousand, key);
        long binarySearchExecutionTime = System.nanoTime() - binarySearchStartTime;
        long binarySearchExecutionSeconds = binarySearchExecutionTime / 1000;
        System.out.printf("The binary search result is %d and the execution time is %s seconds.", binarySearchResult, binarySearchExecutionSeconds);
    }

    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (high + low) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;

        }
        return -low - 1;
    }
}

