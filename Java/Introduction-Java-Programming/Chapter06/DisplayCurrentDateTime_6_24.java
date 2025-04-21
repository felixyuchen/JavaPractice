import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DisplayCurrentDateTime_6_24 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        LocalDateTime datetime = LocalDateTime.MAX;
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
//        System.out.println(dateTime.format(formatter));
        System.out.println(dateTime);
        System.out.println(datetime);
    }
}
