import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) throws IOException {
        try {
            FileReader reader = new FileReader("C:\\Users\\Admin\\Intelije JAVA Code\\mavenProject\\src\\test\\java\\File\\properties.txt");
            System.out.println(reader);;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

//FileRader  reader = new FileReader("");












