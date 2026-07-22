import java.util.ArrayList;
import java.util.StringJoiner;

public class NamesJoiner {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Arjun");
        names.add("Bhavna");
        names.add("Charan");
        names.add("Divya");

        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        for (String name : names) {
            joiner.add(name);
        }

        System.out.println("Joined sequence: " + joiner.toString());
    }
}
