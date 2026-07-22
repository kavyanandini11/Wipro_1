import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeProcessDemo {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Ananya", 55000, "Bengaluru"));
        employees.add(new Employee(2, "Bharath", 48000, "Chennai"));
        employees.add(new Employee(3, "Chetan", 62000, "Hyderabad"));
        employees.add(new Employee(4, "Deepa", 51000, "Chennai"));
        employees.add(new Employee(5, "Esha", 58000, "Bengaluru"));
        employees.add(new Employee(6, "Farhan", 45000, "Pune"));

        Predicate<Employee> highEarner = e -> e.getSalary() >= 55000;

        System.out.println("Employees earning 55000 or more:");
        for (Employee employee : employees) {
            if (highEarner.test(employee)) {
                System.out.println("  " + employee);
            }
        }

        System.out.println("\nApplying a 10% hike to everyone:");
        employees.forEach(e -> e.setSalary(e.getSalary() * 1.10));
        employees.forEach(e -> System.out.println("  " + e));
    }
}
