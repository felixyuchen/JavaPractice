public class SortStudentsOnGrades_08_03_second {
    public static void main(String[] args) {
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        String[] studentName = {"Mary", "Tom", "Jerry", "Sting", "May", "Fin", "Sean", "Jack"};
        int[][] correctAnswerCount = new int[8][2];
        //initial correctAnswerCount array, store index of student name to first column
        for (int i = 0; i < correctAnswerCount.length; i++) {
            correctAnswerCount[i][0] = i;
        }
      //how many questions are correct
        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j]) {
                    correctAnswerCount[i][1]++;
                }
            }
        }
        for (int i = 0; i < studentName.length; i++) {
            System.out.printf("%s's correct count is %d.%n", studentName[i], correctAnswerCount[i][1]);
        }

        //sort the counts
        for (int i = 0; i < correctAnswerCount.length - 1; i++) {
            int currentMin = correctAnswerCount[i][1];
            int currentIndex = i;
            for (int j = i + 1; j < correctAnswerCount.length; j++) {
                if (currentMin > correctAnswerCount[j][1]) {
                    currentMin = correctAnswerCount[j][1];
                    currentIndex = j;
                }
            }
            if (currentIndex != i) {
                // swap the value of the second element in correctAnswerCount array
                correctAnswerCount[currentIndex][1] = correctAnswerCount[i][1];
                correctAnswerCount[i][1] = currentMin;
                // swap student index, the first element in correctAnswerCount array
                int temp = correctAnswerCount[i][0];
                correctAnswerCount[i][0] = correctAnswerCount[currentIndex][0];
                correctAnswerCount[currentIndex][0] = temp;
            }
        }
        System.out.println();
        System.out.println("The order is the following:");
        for (int i = 0; i < studentName.length; i++) {
            System.out.printf("%s's correct count is %d.%n", studentName[correctAnswerCount[i][0]], correctAnswerCount[i][1]);
        }
    }
}
