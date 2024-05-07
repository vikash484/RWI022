import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream r = new FileInputStream("C:\\Users\\vikas\\OneDrive\\Desktop\\vikash.txt");
        FileOutputStream w = new FileOutputStream("C:\\Users\\vikas\\OneDrive\\Desktop\\akhilesh.txt");

        int i;
        while ((i = r.read()) != -1) {
            w.write(i);
        }
        System.out.println("Data copied successfully");
        
        
        r.close();
        w.close();
    }
}
