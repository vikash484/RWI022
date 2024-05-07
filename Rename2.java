import java.io.File;

public class Rename2 {
    public static void main(String[] args) throws Exception {
        File f = new File("C:/Users/vikas/OneDrive/Desktop/rahul.txt");
        File r = new File("C:/Users/vikas/OneDrive/Desktop/akhilesh.txt");
        
        if(f.exists()) {
            System.out.println(f.renameTo(r));
        } else {
            System.out.println("File does not exist");
        }
    }
}
