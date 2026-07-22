public class Employee {

    private int empId;
    private String empName;
    private String designation;
    private double salary;

    public Employee(int empId, String empName, String designation, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    @Override
    public String toString() {
        return String.format("ID: %-4d | Name: %-10s | Designation: %-12s | Salary: Rs.%.2f",
                empId, empName, designation, salary);
    }
}
