import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EmployeeNamesHashSet {

    public static void main(String[] args) {
        Set<String> employeeNames = new HashSet<>();
        employeeNames.add("Ananya");
        employeeNames.add("Bharath");
        employeeNames.add("Chetan");
        employeeNames.add("Deepa");
        employeeNames.add("Ananya");

        System.out.println("Number of unique employee names: " + employeeNames.size());
        System.out.println("Retrieving names using an Iterator:");
        Iterator<String> iterator = employeeNames.iterator();
        while (iterator.hasNext()) {
            System.out.println("  " + iterator.next());
        }
    }
}
