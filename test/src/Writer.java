import java.io.*;

public class Writer implements IO {

    @Override
    public void write(String fileName, String input) {
        try {
            FileWriter fw = new FileWriter(fileName);
            fw.write(input);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

        @Override
    public String read(String fileName) {
        try {
            FileReader fr = new FileReader(fileName);
            int i;
            while ((i=fr.read())!=-1){
                System.out.print((char)i);
            }
            fr.close();
        }  catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
