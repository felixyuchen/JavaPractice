import java.util.Scanner;

public class AssignGrades_07_01 {
    public static void main(String[] args) {
        System.out.print("Enter the number of students: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.printf("Enter %d scores: ", number);
        Scanner scanner2 = new Scanner(System.in);
        String inputNumber = scanner2.nextLine();
        String[] stringInput = inputNumber.split(" ");
        int[] grades = new int[stringInput.length];
        for (int i = 0; i < stringInput.length; i++) {
            grades[i] = Integer.parseInt(stringInput[i]);
        }
        assignGrades(grades);
    }

    public static void assignGrades(int... grades) {
        if (grades.length == 0) {
            System.out.println("No argument passed.");
        } else {
            int bestGrade = grades[0];
            for (int i = 1; i < grades.length; i++) {
                if (bestGrade < grades[i]) {
                    bestGrade = grades[i];
                }
            }
            for (int j = 0; j < grades.length; j++) {
                if (grades[j] >= bestGrade - 10) {
                    System.out.printf("Student %d score is %d and grade is A%n", j, grades[j]);
                } else if (grades[j] >= bestGrade - 20) {
                    System.out.printf("Student %d score is %d and grade is B%n", j, grades[j]);
                } else if (grades[j] >= bestGrade - 30) {
                    System.out.printf("Student %d score is %d and grade is C%n", j, grades[j]);
                } else if (grades[j] >= bestGrade - 40) {
                    System.out.printf("Student %d score is %d and grade is D%n", j, grades[j]);
                } else {
                    System.out.printf("Student %d score is %d and grade is F%n", j, grades[j]);
                }
            }
        }
    }
}
