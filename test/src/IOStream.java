import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class IOStream implements IO{

    @Override
    public void write(String fileName, String input) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("output stream err");
        }
    }

    @Override
    public String read(String fileName) {
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
        } catch (FileNotFoundException e){
            System.out.println("input stream err");
        }
        return null;
    }
}
