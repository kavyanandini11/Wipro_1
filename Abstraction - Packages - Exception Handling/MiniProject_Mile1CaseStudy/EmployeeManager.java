public class EmployeeManager {

    private Employee[] employees;
    private int count;

    public EmployeeManager(int capacity) {
        employees = new Employee[capacity];
        count = 0;
    }

    public void addEmployee(int id, String name, double salary)
            throws InvalidSalaryException {
        if (salary < 0) {
            throw new InvalidSalaryException("Salary cannot be negative for " + name);
        }
        if (count == employees.length) {
            throw new ArrayIndexOutOfBoundsException("Employee storage is full.");
        }
        employees[count] = new Employee(id, name, salary);
        count++;
        System.out.println("Added   -> " + name);
    }

    public Employee searchById(int id) throws EmployeeNotFoundException {
        for (int i = 0; i < count; i++) {
            if (employees[i].getId() == id) {
                return employees[i];
            }
        }
        throw new EmployeeNotFoundException("No employee found with ID " + id);
    }

    public void displayAll() {
        System.out.println("----- Employee Records -----");
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
        System.out.println("----------------------------");
    }
}
