import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Findword {
    public String findString() throws IOException {
        System.out.println("\nEnter word to find");
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        ArrayList<String> lines = new ArrayList<>();
        FileReader fr = new FileReader("in.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            List<String> found = Arrays.asList(line.split(" "));
            if (found.contains(word)) {
                int pos = line.indexOf(String.valueOf(word));
                System.out.println("Keyword matched the string " + word + ": " + pos);
            }
        }
        return word;
    }
}

