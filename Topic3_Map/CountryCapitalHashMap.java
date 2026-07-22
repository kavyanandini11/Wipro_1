import java.util.HashMap;
import java.util.Map;

public class CountryCapitalHashMap {

    private Map<String, String> m1 = new HashMap<>();

    public Map<String, String> saveCountryCapital(String country, String capital) {
        m1.put(country, capital);
        return m1;
    }

    public static void main(String[] args) {
        CountryCapitalHashMap data = new CountryCapitalHashMap();
        data.saveCountryCapital("India", "New Delhi");
        data.saveCountryCapital("Japan", "Tokyo");
        Map<String, String> map = data.saveCountryCapital("France", "Paris");

        System.out.println("Country -> Capital (HashMap):");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("  " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}
