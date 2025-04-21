public class WeeklyHoursEachEmployee_08_04 {
    public static void main(String[] args) {
        int[][] hours = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}};
        String[] employeeName = {"Mary", "Tom", "Jerry", "Sting", "May", "Fin", "Sean", "Jack"};
        int[][] totalHours = new int[8][2];
        for (int i = 0; i < hours.length; i++) {
            for (int j = 0; j < hours[i].length; j++) {
                totalHours[i][0] += hours[i][j];
                totalHours[i][1] = i;
            }
        }
        System.out.println("The total hours:");
        for (int i = 0; i < totalHours.length; i++)
            System.out.printf("%s's total hours are %d.%n", employeeName[i], totalHours[i][0]);

        //sort the hours
        for (int i = 0; i < totalHours.length - 1; i++) {
            int currentMax = totalHours[i][0];
            int currentIndex = i;
            for (int j = i + 1; j < totalHours.length; j++) {
                if (currentMax < totalHours[j][0]) {
                    currentMax = totalHours[j][0];
                    currentIndex = j;
                }
            }
            if (currentIndex != i) {
                //swap the total hours
                totalHours[currentIndex][0] = totalHours[i][0];
                totalHours[i][0] = currentMax;
                //swap the index
                int temp = totalHours[currentIndex][1];
                totalHours[currentIndex][1] = totalHours[i][1];
                totalHours[i][1] = temp;
            }
        }
        System.out.println();
        System.out.println("The sort is:");
        for (int[] totalHour : totalHours)
            System.out.printf("%s's total hours are %d.%n", employeeName[totalHour[1]], totalHour[0]);
    }
}

