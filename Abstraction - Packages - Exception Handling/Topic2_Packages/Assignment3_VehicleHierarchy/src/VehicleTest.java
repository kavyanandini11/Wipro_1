import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;

public class VehicleTest {

    public static void main(String[] args) {
        Hero hero = new Hero("Hero Splendor", "KA01AB1234", "Ramesh");
        Honda honda = new Honda("Honda Activa", "KA02CD5678", "Suresh");

        System.out.println("== Hero ==");
        System.out.println("Model : " + hero.getModelName());
        System.out.println("Reg No: " + hero.getRegistrationNumber());
        System.out.println("Owner : " + hero.getOwnerName());
        System.out.println("Speed : " + hero.getSpeed() + " km/h");
        hero.radio();

        System.out.println("\n== Honda ==");
        System.out.println("Model : " + honda.getModelName());
        System.out.println("Reg No: " + honda.getRegistrationNumber());
        System.out.println("Owner : " + honda.getOwnerName());
        System.out.println("Speed : " + honda.getSpeed() + " km/h");
        honda.cdplayer();
    }
}
