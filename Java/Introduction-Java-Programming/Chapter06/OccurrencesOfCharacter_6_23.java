

import java.util.Scanner;

public class OccurrencesOfCharacter_6_23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string:");
        String str1 = scanner.nextLine();
        System.out.print("Please enter a character:");
        String str2 = scanner.nextLine();
        char c = str2.charAt(0);
        int count1 = count(str1,c);
        System.out.printf("The number is %d.", count1);
    }
    public static int count ( String str, char a){
        int count = 0;
        for (int i =0; i < str.length(); i++){
            if (str.charAt(i) == a){
                count +=1;
            }
        }
        return count;
    }
}
