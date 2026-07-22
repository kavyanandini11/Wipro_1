import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CurrentTimeBefore5Hr30Min {

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime now = LocalTime.now();
        LocalTime earlier = now.minusHours(5).minusMinutes(30);

        System.out.println("Current time                 : " + now.format(formatter));
        System.out.println("Time before 5 hours 30 minutes: " + earlier.format(formatter));
    }
}
