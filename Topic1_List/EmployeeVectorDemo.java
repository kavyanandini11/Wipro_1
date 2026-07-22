import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EmployeeVectorDemo {

    public static void main(String[] args) {
        Vector<Employee> employees = new Vector<>();
        employees.add(new Employee(201, "Deepa", "deepa@wipro.com", 'F', 500000));
        employees.add(new Employee(202, "Esha", "esha@wipro.com", 'F', 560000));
        employees.add(new Employee(203, "Farhan", "farhan@wipro.com", 'M', 610000));

        System.out.println("Listing employees using an Iterator:");
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println("  " + iterator.next().getEmployeeDetails());
        }

        System.out.println("\nListing employees using an Enumeration:");
        Enumeration<Employee> enumeration = employees.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println("  " + enumeration.nextElement().getEmployeeDetails());
        }
    }
}
