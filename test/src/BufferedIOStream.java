import java.io.*;

public class BufferedIOStream implements IO {
    @Override
    public void write(String fileName, String input) {
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        } catch (FileNotFoundException e) {
            System.out.println("buffered input stream err");
        }
    }

    @Override
    public String read(String fileName) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        } catch (FileNotFoundException e) {
            System.out.println("buffered output stream err");
        }
        return null;
    }
}
