import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    public void saveToFile(List<Employee> employees, String fileName) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(employees);
        }
        System.out.println("Serialized " + employees.size() + " employees to '" + fileName + "'");
    }

    @SuppressWarnings("unchecked")
    public List<Employee> loadFromFile(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            return (List<Employee>) in.readObject();
        }
    }

    public void exportReport(List<Employee> employees, String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("EMPLOYEE REPORT");
            writer.newLine();
            writer.write("===============");
            writer.newLine();
            double total = 0;
            for (Employee employee : employees) {
                writer.write(employee.toString());
                writer.newLine();
                total += employee.getSalary();
            }
            writer.write("---------------");
            writer.newLine();
            writer.write(String.format("Total salary payout: Rs.%.2f", total));
            writer.newLine();
        }
        System.out.println("Text report written to '" + fileName + "'");
    }

    public List<Employee> createSampleData() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Ananya", "Development", 55000));
        employees.add(new Employee(102, "Bharath", "Testing", 48000));
        employees.add(new Employee(103, "Chetan", "Finance", 62000));
        return employees;
    }
}
