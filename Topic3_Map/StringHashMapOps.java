import java.util.HashMap;
import java.util.Map;

public class StringHashMapOps {

    public static void main(String[] args) {
        Map<String, String> capitals = new HashMap<>();
        capitals.put("India", "New Delhi");
        capitals.put("Japan", "Tokyo");
        capitals.put("France", "Paris");

        System.out.println("Map: " + capitals);
        System.out.println("Contains key 'Japan'?      " + capitals.containsKey("Japan"));
        System.out.println("Contains key 'Germany'?    " + capitals.containsKey("Germany"));
        System.out.println("Contains value 'Paris'?    " + capitals.containsValue("Paris"));
        System.out.println("Contains value 'London'?   " + capitals.containsValue("London"));
        System.out.println("Capital of India:          " + capitals.get("India"));
        System.out.println("Capital of USA (default):  " + capitals.getOrDefault("USA", "Not available"));
    }
}
