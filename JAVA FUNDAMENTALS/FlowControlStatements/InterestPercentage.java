public class InterestPercentage {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide gender and age as command-line arguments.");
            System.out.println("Example: java InterestPercentage Female 45");
            return;
        }
        String gender = args[0];
        int age;
        try {
            age = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Age must be a valid integer.");
            return;
        }

        double interest = 0;
        boolean valid = true;

        if (gender.equalsIgnoreCase("Female")) {
            if (age >= 1 && age <= 58) {
                interest = 8.2;
            } else if (age >= 59 && age <= 100) {
                interest = 9.2;
            } else {
                valid = false;
            }
        } else if (gender.equalsIgnoreCase("Male")) {
            if (age >= 1 && age <= 58) {
                interest = 8.4;
            } else if (age >= 59 && age <= 100) {
                interest = 10.5;
            } else {
                valid = false;
            }
        } else {
            valid = false;
        }

        if (valid) {
            System.out.println("Interest percentage: " + interest + "%");
        } else {
            System.out.println("Invalid gender or age.");
        }
    }
}
