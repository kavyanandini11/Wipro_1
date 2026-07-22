import java.io.IOException;
import java.util.List;

public class EmployeeManagementApp {

    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();
        String dataFile = "employees.ser";
        String reportFile = "employee_report.txt";

        try {
            List<Employee> employees = service.createSampleData();

            System.out.println(">> Original employee list");
            employees.forEach(System.out::println);

            System.out.println("\n>> Saving to file (serialization)");
            service.saveToFile(employees, dataFile);

            System.out.println("\n>> Loading from file (deserialization)");
            List<Employee> loaded = service.loadFromFile(dataFile);
            loaded.forEach(System.out::println);

            System.out.println("\n>> Exporting a plain-text report");
            service.exportReport(loaded, reportFile);

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Could not read employee data: " + e.getMessage());
        }
    }
}
