import com.automobile.fourwheeler.Ford;
import com.automobile.fourwheeler.Logan;

public class FourWheelerTest {

    public static void main(String[] args) {
        Logan logan = new Logan("Renault Logan", "KA03EF9012", "Kiran");
        Ford ford = new Ford("Ford Figo", "KA04GH3456", "Latha");

        System.out.println("== Logan ==");
        System.out.println("Model : " + logan.getModelName());
        System.out.println("Reg No: " + logan.getRegistrationNumber());
        System.out.println("Owner : " + logan.getOwnerName());
        System.out.println("Speed : " + logan.speed() + " km/h");
        logan.gps();

        System.out.println("\n== Ford ==");
        System.out.println("Model : " + ford.getModelName());
        System.out.println("Reg No: " + ford.getRegistrationNumber());
        System.out.println("Owner : " + ford.getOwnerName());
        System.out.println("Speed : " + ford.speed() + " km/h");
        ford.tempControl();
    }
}
