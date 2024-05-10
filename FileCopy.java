import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCopy {
    public static void main(String[] args) {
        System.out.println("Test");
        try {
            Path source = Paths.get("C:\\Users\\vikas\\OneDrive\\Desktop\\Satna.txt");
            Path destination = Paths.get("C:\\Users\\vikas\\OneDrive\\Desktop\\Nagod.txt");

            Files.copy(source, destination);
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
