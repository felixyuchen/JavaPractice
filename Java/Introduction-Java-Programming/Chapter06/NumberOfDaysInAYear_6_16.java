public class NumberOfDaysInAYear_6_16 {

    public static void main(String[] args) {
        System.out.println("Year     Number of Days");
        int year = 2000;
        for (int i = 0; i <= 20; i++) {
            System.out.printf("%4d%5s%3d%n", year + i, " ", numberOfDaysInAYear(year + i));
        }
    }

    public static int numberOfDaysInAYear(int year) {
        int numberOfDays = 365;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            numberOfDays = 366;
        }
        return numberOfDays;
    }
}
