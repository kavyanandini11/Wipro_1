import java.util.Scanner;

public class PaddedBinary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1 to 255): ");
        int number = scanner.nextInt();

        if (number < 1 || number > 255) {
            System.out.println("Number must be between 1 and 255.");
            scanner.close();
            return;
        }

        String binary = Integer.toBinaryString(number);
        String padded = String.format("%8s", binary).replace(' ', '0');

        System.out.println("8-bit binary representation: " + padded);
        scanner.close();
    }
}
