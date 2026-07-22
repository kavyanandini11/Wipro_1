public class SumTwoIntegers {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two integers as command-line arguments.");
            System.out.println("Example: java SumTwoIntegers 10 20");
            return;
        }
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println("The sum of " + a + " and " + b + " is " + (a + b));
        } catch (NumberFormatException e) {
            System.out.println("Both arguments must be valid integers.");
        }
    }
}
