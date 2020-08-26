import java.io.*;

public class StreamWriter implements IO {
    @Override
    public void write(String fileName, String input) {
        try {
            FileOutputStream outputStream = new FileOutputStream(fileName);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
            outputStreamWriter.write(input);
            outputStreamWriter.close();
            outputStream.close();
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    @Override
    public String read(String fileName) throws IOException {
        InputStream stream = new FileInputStream(fileName);
        Reader reader = new InputStreamReader(stream);
        int data = reader.read();
        while (data != -1){
            System.out.print((char)data);
            data = reader.read();
        }
        stream.close();
        return null;
    }
}
