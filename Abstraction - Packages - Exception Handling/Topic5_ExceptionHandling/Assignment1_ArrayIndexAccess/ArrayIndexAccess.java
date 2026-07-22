import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayIndexAccess {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter array size: ");
            int size = Integer.parseInt(reader.readLine().trim());
            int[] numbers = new int[size];

            for (int i = 0; i < size; i++) {
                System.out.print("Enter element " + i + ": ");
                numbers[i] = Integer.parseInt(reader.readLine().trim());
            }

            System.out.print("Enter index to access: ");
            int index = Integer.parseInt(reader.readLine().trim());

            System.out.println("Element at index " + index + " is " + numbers[index]);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integer values only.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: The index you entered is out of bounds.");
        } catch (IOException e) {
            System.out.println("Error: Unable to read input.");
        }
    }
}
