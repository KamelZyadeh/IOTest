import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "Text.txt";
        String input = "Ali Jalil";
        IO io = IOData.choose("Ali");
        io.write(fileName, input);
       //io.read(fileName);
    }
}