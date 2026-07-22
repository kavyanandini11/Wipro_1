public class MathOperation {

    public static void main(String[] args) {
        try {
            if (args.length != 5) {
                System.out.println("Please provide exactly 5 integers as command-line arguments.");
                System.out.println("Example: java MathOperation 10 20 30 40 50");
                return;
            }

            int[] numbers = new int[5];
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Integer.parseInt(args[i]);
                sum = sum + numbers[i];
            }

            int average = sum / numbers.length;
            System.out.println("Numbers entered : " + java.util.Arrays.toString(numbers));
            System.out.println("Sum     = " + sum);
            System.out.println("Average = " + average);

        } catch (NumberFormatException e) {
            System.out.println("Error: All 5 command-line arguments must be integers.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Arithmetic problem occurred - " + e.getMessage());
        }
    }
}
