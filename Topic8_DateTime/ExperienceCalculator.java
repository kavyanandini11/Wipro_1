import java.time.LocalDate;
import java.time.Period;

public class ExperienceCalculator {

    public static void main(String[] args) {
        LocalDate joiningDate = LocalDate.of(2019, 6, 15);
        LocalDate today = LocalDate.now();

        Period experience = Period.between(joiningDate, today);

        System.out.println("Joining date : " + joiningDate);
        System.out.println("Today        : " + today);
        System.out.println("Experience in Wipro: " + experience.getYears() + " years, "
                + experience.getMonths() + " months, " + experience.getDays() + " days");
    }
}
