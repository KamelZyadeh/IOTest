import java.io.IOException;

public interface IO {

        public void write(String fileName, String input) throws IOException;
        public String read(String fileName) throws IOException;

}
