public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        int currentSecond = (int) (System.currentTimeMillis() / 1000);
        int currentMinute = currentSecond / 60;
        second = currentSecond % 60;
        minute = currentMinute % 60;
        hour = currentMinute / 60;
    }

    public Time(long elapsedTime) {
        int currentSecond = (int) (elapsedTime / 1000);
        int currentMinute = currentSecond / 60;
        this.second = currentSecond % 60;
        this.minute = currentMinute % 60;
        this.hour = currentMinute / 60;
    }

    public Time(int newHour, int newMinute, int newSecond) {
        this.hour = newHour;
        this.minute = newMinute;
        this.second = newSecond;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setTime(long elapseTime){
        int currentSecond = (int) (elapseTime / 1000);
        int currentMinute = currentSecond / 60;
        this.second = currentSecond % 60;
        this.minute = currentMinute % 60;
        this.hour = currentMinute / 60;

    }
}
