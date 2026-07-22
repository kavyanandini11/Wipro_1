import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LocationFunctionDemo {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Ananya", 55000, "Bengaluru"));
        employees.add(new Employee(2, "Bharath", 48000, "Chennai"));
        employees.add(new Employee(3, "Chetan", 62000, "Hyderabad"));
        employees.add(new Employee(4, "Deepa", 51000, "Chennai"));
        employees.add(new Employee(5, "Esha", 58000, "Bengaluru"));

        Function<Employee, String> extractLocation = Employee::getLocation;

        List<String> locations = new ArrayList<>();
        for (Employee employee : employees) {
            locations.add(extractLocation.apply(employee));
        }

        System.out.println("Employee locations: " + locations);
    }
}
