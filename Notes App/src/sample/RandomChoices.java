package sample;
import java.io.*;
import java.util.ArrayList;

public class RandomChoices {
    String string = "";

    public RandomChoices(String str) {
        string = str;
    }

    private static final ArrayList<RandomChoices> lists = new ArrayList<>();

    public RandomChoices() {
    }

    //Requires: String
    //Modifies: this
    //Effects: write/store the input text to "list.txt"
    public static String saveList(String getText) throws IOException {
        FileWriter fw = new FileWriter("list.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(getText);
        bw.close();
        return getText;
    }

    //Require: String, fileName
    //Modifies: this
    //Effects: read the lines stored in "list.txt" and print them out
    public static ArrayList restoreList(String fileName) throws IOException {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String line;
        String listString = "";
        while ((line = br.readLine()) != null) {
            if (!line.contains(".")) {
                listString += line;
            } else {
                parseList(listString);
                listString = "";
            }
        }
        return lists;
    }

    //Require: String
    //Modifies: this
    //Effects: parse the String and add it to ArrayList
    private static void parseList(String string) {
        int pos1;
        String list = "";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ',') {
                pos1 = i;
                list = string.substring(0, pos1);
                System.out.println(list);
                lists.add(new RandomChoices(list));
            }
        }
    }

    //Effects: returns the String of string
    public String toString() {
        return string;
    }
}
