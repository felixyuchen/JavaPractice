import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMax_11_04 {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        System.out.print("Please enter array list ends with 0. ");
        int value;
        Scanner scanner = new Scanner(System.in);
        value = scanner.nextInt();
        while (value != 0) {
            arraylist.add(value);
            value = scanner.nextInt();
        }
        System.out.printf("The max number is %d.", max(arraylist));
    }

    public static Integer max(ArrayList<Integer> list) {
        if (!list.isEmpty()) {
            int max = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                if (max < list.get(i))
                    max = list.get(i);
            }
            return max;
        }
        else
            return null;

    }
}
