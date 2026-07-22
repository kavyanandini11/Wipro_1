import java.util.ArrayList;
import java.util.List;

public class EmployeeDB {

    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Added employee: " + employee.getEmpName());
    }

    public void deleteEmployee(int empId) {
        Employee found = findById(empId);
        if (found != null) {
            employees.remove(found);
            System.out.println("Deleted employee with ID " + empId);
        } else {
            System.out.println("No employee found with ID " + empId);
        }
    }

    public void showPaySlip(int empId) {
        Employee found = findById(empId);
        if (found != null) {
            double monthly = found.getSalary() / 12;
            System.out.printf("Pay slip for %s -> Annual: Rs.%.2f, Monthly: Rs.%.2f%n",
                    found.getEmpName(), found.getSalary(), monthly);
        } else {
            System.out.println("No employee found with ID " + empId);
        }
    }

    public void listAll() {
        System.out.println("Current employees:");
        for (Employee employee : employees) {
            System.out.println("  " + employee.getEmployeeDetails());
        }
    }

    private Employee findById(int empId) {
        for (Employee employee : employees) {
            if (employee.getEmpId() == empId) {
                return employee;
            }
        }
        return null;
    }
}
