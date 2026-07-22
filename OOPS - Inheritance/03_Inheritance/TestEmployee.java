public class TestEmployee {

    public static void main(String[] args) {
        Employee emp = new Employee("Sara Khan", 850000.0, 2019, "NI-4471209");

        System.out.println("Initial employee details");
        printEmployee(emp);

        emp.setAnnualSalary(920000.0);
        emp.setName("Sara Khan-Ali");

        System.out.println("\nAfter salary revision and name update");
        printEmployee(emp);
    }

    private static void printEmployee(Employee emp) {
        System.out.println("Name        : " + emp.getName());
        System.out.println("Annual salary: " + emp.getAnnualSalary());
        System.out.println("Start year  : " + emp.getStartYear());
        System.out.println("NI number   : " + emp.getNationalInsuranceNumber());
    }
}
