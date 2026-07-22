public class EmployeeDBTest {

    public static void main(String[] args) {
        EmployeeDB db = new EmployeeDB();

        db.addEmployee(new Employee(101, "Ananya", "ananya@wipro.com", 'F', 600000));
        db.addEmployee(new Employee(102, "Bharath", "bharath@wipro.com", 'M', 540000));
        db.addEmployee(new Employee(103, "Chetan", "chetan@wipro.com", 'M', 720000));

        System.out.println();
        db.listAll();

        System.out.println();
        db.showPaySlip(102);

        System.out.println();
        db.deleteEmployee(101);

        System.out.println();
        db.listAll();
    }
}
