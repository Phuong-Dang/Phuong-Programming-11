package sample;
import java.io.*;

public class CreateNotes {
    static String line;

    //Requires: String
    //Modifies: this
    //Effects: write/store the input text to "notes.txt"
    public static String saveNotes(String getText) throws IOException {
        FileWriter fw = new FileWriter("notes.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(getText);
        bw.close();
        return getText;
    }

    //Require: String, fileName
    //Modifies: this
    //Effects: read the lines stored in "notes.txt" and print them out
    public static String restoreNotes (String fileName) throws IOException {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        line = br.readLine();
        return line;
    }

    //Effects: returns the String of line
    public String toString () {
        return line;
    }
}
