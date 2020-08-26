import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class IOStream implements IO {

    @Override
    public void write(String fileName, String input) throws IOException {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            byte b[] = input.getBytes();
            fileOutputStream.write(b);
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("output stream err");
        }
    }

    @Override
    public String read(String fileName) throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            int i = 0;
            while ((i = fileInputStream.read()) != -1) {
                System.out.print((char) i);
            }
            fileInputStream.close();
        } catch (FileNotFoundException e){
            System.out.println("input stream err");
        }
        return null;
    }
}
