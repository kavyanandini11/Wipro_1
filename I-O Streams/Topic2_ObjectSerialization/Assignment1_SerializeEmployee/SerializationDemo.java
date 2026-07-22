import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Date;

public class SerializationDemo {

    private static final String FILE_NAME = "data";

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1995, Calendar.JUNE, 15, 0, 0, 0);
        Date dob = calendar.getTime();

        Employee employee = new Employee("Kavya", dob, "Development", "Senior Engineer", 78000.0);

        serialize(employee);
        deserialize();
    }

    private static void serialize(Employee employee) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            out.writeObject(employee);
            System.out.println("Employee object serialized to file '" + FILE_NAME + "'.");
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }
    }

    private static void deserialize() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            Employee employee = (Employee) in.readObject();
            System.out.println("\nDeserialized Employee details:");
            System.out.println("Name        : " + employee.getName());
            System.out.println("Date of Birth: " + employee.getDateOfBirth());
            System.out.println("Department  : " + employee.getDepartment());
            System.out.println("Designation : " + employee.getDesignation());
            System.out.println("Salary      : " + employee.getSalary());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e.getMessage());
        }
    }
}
