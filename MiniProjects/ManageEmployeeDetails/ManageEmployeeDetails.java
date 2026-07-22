public class ManageEmployeeDetails {

    public static void main(String[] args) {
        Repository<Employee> employeeRepository = new Repository<>();

        employeeRepository.add(new Employee(101, "Ananya", "Developer", 55000));
        employeeRepository.add(new Employee(102, "Bharath", "Tester", 48000));
        employeeRepository.add(new Employee(103, "Chetan", "Analyst", 62000));

        System.out.println("All employees (" + employeeRepository.size() + "):");
        for (Employee employee : employeeRepository.getAll()) {
            System.out.println(employee);
        }

        System.out.println("\nRemoving employee 102 ...");
        Employee toRemove = employeeRepository.getAll().get(1);
        employeeRepository.remove(toRemove);

        System.out.println("Remaining employees (" + employeeRepository.size() + "):");
        employeeRepository.getAll().forEach(System.out::println);
    }
}
