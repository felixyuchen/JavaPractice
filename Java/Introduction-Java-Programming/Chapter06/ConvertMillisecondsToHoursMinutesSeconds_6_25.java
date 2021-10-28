import java.util.Scanner;

public class ConvertMillisecondsToHoursMinutesSeconds_6_25 {
    public static void main(String[] args) {
        System.out.print("Please enter milliseconds: ");
        Scanner scanner = new Scanner(System.in);
        long millis = scanner.nextLong();
        System.out.println("The total milliseconds are " + millis);
        System.out.println(convertMillis(millis));
    }

    public static String convertMillis(long millis) {
        long totalSeconds = millis / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
//        long currentHour = totalHours % 24;
        return totalHours + ":" + currentMinute + ":" + currentSeconds;
    }
}
