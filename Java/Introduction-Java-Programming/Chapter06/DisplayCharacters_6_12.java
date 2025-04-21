public class DisplayCharacters_6_12 {

    public static void main(String[] args) {
        int numberOfCharsPerLine = 10;
        char ch1 = '1';
        char ch2 = 'Z';
        printChars(ch1, ch2, numberOfCharsPerLine);
    }

    public static void printChars(char ch1, char ch2, int numberPerLine) {
        int count = 1;
        for (char c = ch1; c <= ch2; c++) {
            if (count % numberPerLine != 0) {
                System.out.print(c + " ");
            } else {
                System.out.println(c);
            }
            count += 1;
        }
    }
}
