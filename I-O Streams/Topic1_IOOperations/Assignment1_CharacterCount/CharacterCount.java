import java.io.FileReader;
import java.io.IOException;

public class CharacterCount {

    public static void main(String[] args) {
        String fileName = args.length > 0 ? args[0] : "sample.txt";
        char target = args.length > 1 ? args[1].charAt(0) : 'a';
        char targetLower = Character.toLowerCase(target);

        int count = 0;
        try (FileReader reader = new FileReader(fileName)) {
            int ch;
            while ((ch = reader.read()) != -1) {
                if (Character.toLowerCase((char) ch) == targetLower) {
                    count++;
                }
            }
            System.out.println("The character '" + target + "' appears " + count
                    + " time(s) in '" + fileName + "' (case-insensitive).");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
