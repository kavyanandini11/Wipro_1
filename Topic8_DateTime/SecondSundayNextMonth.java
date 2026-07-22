import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class SecondSundayNextMonth {

    public static void main(String[] args) {
        LocalDate nextMonth = LocalDate.now().plusMonths(1);
        LocalDate secondSunday = nextMonth.with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY));

        System.out.println("Next month              : " + nextMonth.getMonth() + " " + nextMonth.getYear());
        System.out.println("Second Sunday of next month: " + secondSunday);
    }
}
