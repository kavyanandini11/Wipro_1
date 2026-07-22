public class BaseConversion {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide an integer as a command-line argument.");
            System.out.println("Example: java BaseConversion 20");
            return;
        }

        try {
            int number = Integer.parseInt(args[0]);
            System.out.println("Given Number: " + number);
            System.out.println("Binary: " + Integer.toBinaryString(number));
            System.out.println("Octal: " + Integer.toOctalString(number));
            System.out.println("Hexadecimal: " + Integer.toHexString(number));
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}
