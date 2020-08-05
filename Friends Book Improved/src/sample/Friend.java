package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Friend {
    String name;
    private final int age;
    String hobby;

    Friend (String nm, int ae, String hbby) {
        name = nm;
        age = ae;
        hobby = hbby;
    }

    //getters and setters
    public void writeToFile () throws IOException {
            FileWriter fw = new FileWriter("friends.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(name + ",\n");
            bw.write(age + ";\n");
            bw.write(hobby + "\n");
            bw.write(".\n");
            bw.close();
    }

    public int age () {
        return age;
    }

    public String toString () {
        return name;
    }
}
