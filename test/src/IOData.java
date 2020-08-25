
public class IOData {

    public static IO choose(String string) {
        switch (string) {
            case "kamel":
                return new IOStream();
            case "kamel1":
                return new BufferedIOStream();
            default:
                return null;
        }
    }
}