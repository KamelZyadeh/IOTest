import java.io.*;

public class BufferedWriterIO implements IO{
    @Override
    public void write(String fileName, String input) {
        try {
            FileWriter writer = new FileWriter(fileName);
            BufferedWriter br = new BufferedWriter(writer);
            br.write(input);
            br.close();
            System.out.print("Success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String read(String fileName) throws IOException {
        FileReader fr = null;
        try {
            fr = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(fr);
        int i;
        while ((i=br.read())!=-1){
            System.out.print((char)i);
        }
        br.close();
        fr.close();
        return null;
    }
}
