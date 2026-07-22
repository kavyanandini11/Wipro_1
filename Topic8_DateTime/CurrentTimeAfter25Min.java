import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CurrentTimeAfter25Min {

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime now = LocalTime.now();
        LocalTime after25 = now.plusMinutes(25);

        System.out.println("Current time        : " + now.format(formatter));
        System.out.println("Time after 25 minutes: " + after25.format(formatter));
    }
}
