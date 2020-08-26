import java.io.IOException;

public interface IO {
        public void write(String fileName, String input);
        public String read(String fileName) throws IOException;
}