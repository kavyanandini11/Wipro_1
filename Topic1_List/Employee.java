public class Employee {

    private int empId;
    private String empName;
    private String email;
    private char gender;
    private double salary;

    public Employee(int empId, String empName, String email, char gender, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getSalary() {
        return salary;
    }

    public String getEmployeeDetails() {
        return "ID: " + empId + ", Name: " + empName + ", Email: " + email
                + ", Gender: " + gender + ", Salary: Rs." + salary;
    }

    @Override
    public String toString() {
        return getEmployeeDetails();
    }
}
