import java.util.GregorianCalendar;

public class GregorianCalendarClass_09_05 {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println("The current year is: " + calendar.get(GregorianCalendar.YEAR));
        System.out.println("The current month is: " + calendar.get(GregorianCalendar.MONTH));
        System.out.println("The current date is: " + calendar.get(GregorianCalendar.DATE));
        calendar.setTimeInMillis(1234567898765L);
        System.out.println("The  year is: " + calendar.get(GregorianCalendar.YEAR));
        System.out.println("The  month is: " + calendar.get(GregorianCalendar.MONTH));
        System.out.println("The  date is: " + calendar.get(GregorianCalendar.DATE));
    }
}
