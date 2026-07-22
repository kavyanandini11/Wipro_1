public class EmployeeDetailsLookup {
    public static void main(String[] args) {
        int[] ids = {101, 102, 103, 104, 105};
        String[] names = {"Amit Sharma", "Priya Nair", "Rahul Verma", "Sneha Iyer", "Vikram Rao"};
        String[] departments = {"Development", "Testing", "HR", "Finance", "Support"};
        double[] salaries = {55000.0, 48000.0, 42000.0, 60000.0, 38000.0};

        if (args.length == 0) {
            System.out.println("Please provide an Employee ID as a command-line argument.");
            System.out.println("Example: java EmployeeDetailsLookup 103");
            return;
        }

        int searchId;
        try {
            searchId = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid Employee ID. Please enter a valid number.");
            return;
        }

        int index = -1;
        for (int i = 0; i < ids.length; i++) {
            if (ids[i] == searchId) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("No employee found with ID " + searchId);
        } else {
            System.out.println("=== Employee Details ===");
            System.out.println("Employee ID : " + ids[index]);
            System.out.println("Name        : " + names[index]);
            System.out.println("Department  : " + departments[index]);
            System.out.println("Salary      : " + salaries[index]);
        }
    }
}
