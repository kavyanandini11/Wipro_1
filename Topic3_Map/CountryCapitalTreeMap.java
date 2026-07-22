import java.util.Map;
import java.util.TreeMap;

public class CountryCapitalTreeMap {

    private Map<String, String> m1 = new TreeMap<>();

    public Map<String, String> saveCountryCapital(String country, String capital) {
        m1.put(country, capital);
        return m1;
    }

    public static void main(String[] args) {
        CountryCapitalTreeMap data = new CountryCapitalTreeMap();
        data.saveCountryCapital("India", "New Delhi");
        data.saveCountryCapital("Australia", "Canberra");
        Map<String, String> map = data.saveCountryCapital("Japan", "Tokyo");

        System.out.println("Country -> Capital (TreeMap, sorted by key):");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("  " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}
