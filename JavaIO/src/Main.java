import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        Findword find = new Findword();
        ArrayList<String> lines = new ArrayList<>();
        FileReader fr = new FileReader("in.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line + "\n");
            System.out.println(line);
        }
        br.close();
        find.findString();
    }
}
