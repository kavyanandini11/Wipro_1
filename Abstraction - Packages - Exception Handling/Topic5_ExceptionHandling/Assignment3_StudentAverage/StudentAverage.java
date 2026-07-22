import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StudentAverage {

    static int readMark(BufferedReader reader, String label) throws Exception {
        System.out.print(label);
        int mark = Integer.parseInt(reader.readLine().trim());
        if (mark < 0) {
            throw new NegativeMarksException("Marks cannot be negative: " + mark);
        }
        if (mark > 100) {
            throw new MarksOutOfRangeException("Marks must be within 0 to 100: " + mark);
        }
        return mark;
    }

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int s = 1; s <= 2; s++) {
            try {
                System.out.print("Enter name of student " + s + ": ");
                String name = reader.readLine().trim();

                int m1 = readMark(reader, "Enter marks in subject 1: ");
                int m2 = readMark(reader, "Enter marks in subject 2: ");
                int m3 = readMark(reader, "Enter marks in subject 3: ");

                double average = (m1 + m2 + m3) / 3.0;
                System.out.println("Average marks of " + name + " = " + average);
                System.out.println();

            } catch (NumberFormatException e) {
                System.out.println("Error: Marks must be entered as whole numbers.\n");
            } catch (NegativeMarksException e) {
                System.out.println("Error: " + e.getMessage() + "\n");
            } catch (MarksOutOfRangeException e) {
                System.out.println("Error: " + e.getMessage() + "\n");
            } catch (Exception e) {
                System.out.println("Error: Unable to process input.\n");
            }
        }
    }
}
