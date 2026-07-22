import java.util.LinkedHashMap;
import java.util.Map;

public class CountryCapitalLinkedHashMap {

    private Map<String, String> m1 = new LinkedHashMap<>();

    public Map<String, String> saveCountryCapital(String country, String capital) {
        m1.put(country, capital);
        return m1;
    }

    public static void main(String[] args) {
        CountryCapitalLinkedHashMap data = new CountryCapitalLinkedHashMap();
        data.saveCountryCapital("India", "New Delhi");
        data.saveCountryCapital("Japan", "Tokyo");
        data.saveCountryCapital("France", "Paris");
        Map<String, String> map = data.saveCountryCapital("Brazil", "Brasilia");

        System.out.println("Country -> Capital (LinkedHashMap, insertion order):");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("  " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}
