public class Mile1CaseStudy {

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        System.out.println(">> Registering employees");
        try {
            manager.addEmployee(101, "Ananya", 55000);
            manager.addEmployee(102, "Bharath", 62000);
            manager.addEmployee(103, "Chetan", -5000);
        } catch (InvalidSalaryException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            manager.addEmployee(104, "Deepa", 48000);
        } catch (InvalidSalaryException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();
        manager.displayAll();

        System.out.println("\n>> Searching employees");
        searchAndReport(manager, 102);
        searchAndReport(manager, 999);
    }

    private static void searchAndReport(EmployeeManager manager, int id) {
        try {
            Employee found = manager.searchById(id);
            System.out.println("Found -> " + found);
        } catch (EmployeeNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
