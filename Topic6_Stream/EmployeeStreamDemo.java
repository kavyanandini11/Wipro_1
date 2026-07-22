import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeStreamDemo {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Ananya", 28, "Bengaluru"),
                new Employee(2, "Bharath", 35, "Chennai"),
                new Employee(3, "Chetan", 41, "Bengaluru"),
                new Employee(4, "Deepa", 24, "Hyderabad"),
                new Employee(5, "Esha", 39, "Chennai"));

        System.out.println("Employees older than 30:");
        employees.stream()
                .filter(e -> e.getAge() > 30)
                .forEach(e -> System.out.println("  " + e));

        double averageAge = employees.stream()
                .mapToInt(Employee::getAge)
                .average()
                .orElse(0);
        System.out.println("Average age: " + averageAge);

        List<String> names = employees.stream()
                .map(Employee::getName)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Names sorted alphabetically: " + names);
    }
}
