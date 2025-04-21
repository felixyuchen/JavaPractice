import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListShuffle_11_07 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Please enter integer ends with 0. ");
        Scanner scanner = new Scanner(System.in);
        int value;
        value = scanner.nextInt();
        while (value != 0){
            list.add(value);
            value = scanner.nextInt();
        }
        shuffle(list);

        for(Integer jk: list){
            System.out.printf("%d, ",jk);
        }
    }

    public static void shuffle(ArrayList<Integer> list){
        Collections.shuffle(list);
    }
}
