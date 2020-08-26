import java.io.*;
import java.nio.CharBuffer;

public class StringWR implements IO {
    @Override
    public void write(String fileName, String input) throws IOException {
        try {
            FileWriter fw = new FileWriter(fileName);
            StringWriter sw = new StringWriter();
            sw.write(input);
            fw.write(sw.toString());
            fw.close();
        } catch (FileNotFoundException ex) {
            System.out.println("String writer err");
        }
    }

    @Override
    public String read(String fileName) throws IOException {
        FileInputStream fis = new FileInputStream(fileName);
        byte[] buffer = new byte[10];
        StringBuilder sb = new StringBuilder();
        while (fis.read(buffer) != -1) {
            sb.append(new String(buffer));
            buffer = new byte[10];
        }
        fis.close();
        String content = sb.toString();
        StringReader stringReader = new StringReader(content);
        System.out.println(content);
        return null;
    }
}
