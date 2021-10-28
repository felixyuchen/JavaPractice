import java.util.Scanner;

public class AnalyzeScores_07_04 {

    public static void main(String[] args) {
        System.out.print("Please enter the scores: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] stringArray = inputString.split(" ");
        int[] intInput = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            intInput[i] = Integer.parseInt(stringArray[i]);
        }
//        int iniArrayCount = intInput.length;

//        for (int j = 0; j < intInput.length; j++) {
//            if (intInput[j] < 0 || intInput[j] > 100) {
//                System.out.print("The score is wrong. Please reenter the scores: ");
//                inputString = scanner.nextLine();
//                stringArray = inputString.split(" ");
//                int[] intInput = new int[stringArray.length];
//                for (int i = 0; i < stringArray.length; i++) {
//                    intInput[i] = Integer.parseInt(stringArray[i]);
//                }
//                int newArrayCount = intInput.length;
//                if (iniArrayCount > newArrayCount){
//                    for (int i = newArrayCount; i < iniArrayCount; i++){
//                        intInput[i] = 0;
//                    }
//                }
//                j = -1;
//            }
//        }
        for (int i : intInput) {
            System.out.printf("%d ", i);
        }
        System.out.println();
        int sumScore = 0;
        int averageScore;
        for (int k : intInput) {
            sumScore += k;
        }
        averageScore = sumScore / intInput.length;
        int numberAboveAverageScore = 0;
        int numberBelowAverageScore = 0;
        for (int j : intInput) {
            if (j >= averageScore) {
                numberAboveAverageScore++;
            } else {
                numberBelowAverageScore++;
            }
        }
        System.out.printf("The average score is %d%n",averageScore);
        System.out.printf("The number of above average score is: %d%n",numberAboveAverageScore);
        System.out.printf("The number of below average score is: %d%n",numberBelowAverageScore);
    }


}
