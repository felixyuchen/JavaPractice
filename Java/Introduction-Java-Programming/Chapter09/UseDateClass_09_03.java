import java.util.Date;

public class UseDateClass_09_03 {
    public static void main(String[] args) {
        long l = 10000;
        for (int i = 1; i < 8; i++) {
            Date date = new Date(l);
            toString(l, date);
            l *= 10;
        }
    }

    public static void toString(long l, Date date) {
        System.out.println(l + ": " + date.toString());
    }
}

