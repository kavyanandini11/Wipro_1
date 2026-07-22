import java.util.Optional;

public class OptionalOrElseThrowDemo {

    static Employee validate(Employee employee) throws InvalidEmployeeException {
        return Optional.ofNullable(employee)
                .orElseThrow(() -> new InvalidEmployeeException("Employee object is null - invalid employee!"));
    }

    public static void main(String[] args) {
        Employee valid = new Employee(101, "Meera");
        Employee missing = null;

        try {
            System.out.println("Valid case  : " + validate(valid));
        } catch (InvalidEmployeeException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        try {
            System.out.println("Null case   : " + validate(missing));
        } catch (InvalidEmployeeException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
