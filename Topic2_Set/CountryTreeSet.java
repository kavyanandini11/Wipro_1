import java.util.Set;
import java.util.TreeSet;

public class CountryTreeSet {

    private Set<String> h1 = new TreeSet<>();

    public Set<String> saveCountryNames(String country) {
        h1.add(country);
        return h1;
    }

    public boolean getCountry(String country) {
        return h1.contains(country);
    }

    public static void main(String[] args) {
        CountryTreeSet countries = new CountryTreeSet();
        countries.saveCountryNames("India");
        countries.saveCountryNames("Japan");
        countries.saveCountryNames("Brazil");
        Set<String> all = countries.saveCountryNames("Australia");

        System.out.println("All countries (TreeSet, sorted): " + all);
        System.out.println("Contains 'Brazil'? " + countries.getCountry("Brazil"));
        System.out.println("Contains 'France'? " + countries.getCountry("France"));
    }
}
