import java.util.HashSet;
import java.util.Set;

public class CountryHashSet {

    private Set<String> h1 = new HashSet<>();

    public Set<String> saveCountryNames(String country) {
        h1.add(country);
        return h1;
    }

    public boolean getCountry(String country) {
        return h1.contains(country);
    }

    public static void main(String[] args) {
        CountryHashSet countries = new CountryHashSet();
        countries.saveCountryNames("India");
        countries.saveCountryNames("Japan");
        countries.saveCountryNames("Brazil");
        Set<String> all = countries.saveCountryNames("India");

        System.out.println("All countries (HashSet): " + all);
        System.out.println("Contains 'Japan'? " + countries.getCountry("Japan"));
        System.out.println("Contains 'France'? " + countries.getCountry("France"));
    }
}
