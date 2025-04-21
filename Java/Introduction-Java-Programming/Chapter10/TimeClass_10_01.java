public class TimeClass_10_01 {
    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time(555550000);
        System.out.printf("The current time is %d:%d:%d.%n",time1.getHour(),time1.getMinute(),time1.getSecond());
        System.out.printf("The time is %d:%d:%d.", time2.getHour(),time2.getMinute(),time2.getSecond());
    }
}
