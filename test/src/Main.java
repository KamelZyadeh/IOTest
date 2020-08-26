import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        String input = "ShitShitShitShitShitShitShit";
        String filename = "test.txt";
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        try {
//            IOData.choose(s).write(filename, input);
            IOData.choose(s).read(filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
