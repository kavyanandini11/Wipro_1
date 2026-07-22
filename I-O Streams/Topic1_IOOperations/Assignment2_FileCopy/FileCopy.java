import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileCopy {

    public static void main(String[] args) {
        String source = args.length > 0 ? args[0] : "source.txt";
        String destination = args.length > 1 ? args[1] : "destination.txt";

        try (FileInputStream in = new FileInputStream(source);
             FileOutputStream out = new FileOutputStream(destination)) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
            System.out.println("Contents copied from '" + source + "' to '" + destination + "'.");

        } catch (IOException e) {
            System.out.println("Error during copy: " + e.getMessage());
            return;
        }

        verify(source, destination);
    }

    private static void verify(String source, String destination) {
        try {
            String original = new String(Files.readAllBytes(Paths.get(source)));
            String copied = new String(Files.readAllBytes(Paths.get(destination)));
            if (original.equals(copied)) {
                System.out.println("Verification passed: both files have identical content.");
            } else {
                System.out.println("Verification failed: the files differ.");
            }
        } catch (IOException e) {
            System.out.println("Error during verification: " + e.getMessage());
        }
    }
}
