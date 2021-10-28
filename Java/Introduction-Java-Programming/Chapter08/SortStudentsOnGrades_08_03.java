public class SortStudentsOnGrades_08_03 {
    public static void main(String[] args) {
        int count;
        String[][] answers = {
                {"Mary", "A", "B", "A", "C", "C", "D", "E", "E", "A", "D", "0"},
                {"Tom", "D", "B", "A", "B", "C", "A", "E", "E", "A", "D", "0"},
                {"Jerry", "E", "D", "D", "A", "C", "B", "E", "E", "A", "D", "0"},
                {"Sting", "C", "B", "A", "E", "D", "C", "E", "E", "A", "D", "0"},
                {"May", "A", "B", "D", "C", "C", "D", "E", "E", "A", "D", "0"},
                {"Fin", "B", "B", "E", "C", "C", "D", "E", "E", "A", "D", "0"},
                {"Sean", "B", "B", "A", "C", "C", "D", "E", "E", "A", "D", "0"},
                {"Jack", "E", "B", "E", "C", "C", "D", "E", "E", "A", "D", "0"}};
        String[] keys = {"D", "B", "D", "C", "C", "D", "A", "E", "A", "D"};
        for (int i = 0; i < answers.length; i++) {
            for (int j = 1; j < answers[i].length - 1; j++) {
                if(answers[i][j].equals(keys[j-1])){
                    count = Integer.parseInt(answers[i][answers[i].length-1]);
                    count++;
                    answers[i][answers[i].length-1] = String.valueOf(count);
                }
            }
        }
        for (String[] answer : answers)
            System.out.printf("%s's correct count is %s%n", answer[0], answer[answer.length - 1]);
    }

}
