import java.time.Year;

public class LeapYearCheck {

    public static void main(String[] args) {
        int currentYear = Year.now().getValue();
        boolean leap = Year.of(currentYear).isLeap();

        System.out.println("Current year: " + currentYear);
        if (leap) {
            System.out.println(currentYear + " is a Leap year.");
        } else {
            System.out.println(currentYear + " is not a Leap year.");
        }
    }
}
