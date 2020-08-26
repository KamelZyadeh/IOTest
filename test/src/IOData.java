
public class IOData {

    public static IO choose(String string) {
        switch (string) {
            case "Ali":
                return new Writer();
            case "Ali1":
                return new BufferedWriterIO();
            case "Ali2":
                return new StreamWriter();
            default:
                return null;
        }
    }
}