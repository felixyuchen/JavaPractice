import java.util.Arrays;

public class CostcoArray {
    public static int ArrayChallenge(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;

        // Calculate the sum of the four largest elements
        int sum = 0;
        for (int i = Math.max(0, n - 4); i < n; i++) {
            sum += arr[i];
        }
   arr[0] = sum;
        return arr[0];
    }

    public static void main(String[] args) {
        int[] arr1 = {0,0,2,3,7,1};
        System.out.println(ArrayChallenge(arr1));
    }
}
