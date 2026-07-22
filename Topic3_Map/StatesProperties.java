import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class StatesProperties {

    public static void main(String[] args) {
        Properties states = new Properties();
        states.setProperty("Karnataka", "Bengaluru");
        states.setProperty("Maharashtra", "Mumbai");
        states.setProperty("Tamil Nadu", "Chennai");
        states.setProperty("Kerala", "Thiruvananthapuram");

        System.out.println("Indian states and their capitals:");
        Set<String> stateNames = states.stringPropertyNames();
        Iterator<String> iterator = stateNames.iterator();
        while (iterator.hasNext()) {
            String state = iterator.next();
            System.out.println("  " + state + " -> " + states.getProperty(state));
        }
    }
}
