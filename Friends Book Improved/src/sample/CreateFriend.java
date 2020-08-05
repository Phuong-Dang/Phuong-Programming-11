package sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CreateFriend {
    private static String name;
    private static int age;
    private static String hobby;
    private static final ArrayList <Friend> friends = new ArrayList<>();

    public static ArrayList createAllFriends (String fileName) throws IOException {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String line;
        String friendString = "";
        while ((line = br.readLine()) != null) {
            if (!line.equals("." + "")) {
                friendString += line;
            } else {
                parseFriend(friendString);
                friendString = "";
            }
        }
        return friends;
    }
    private static void parseFriend (String string) {
        int pos1 = 0;
        int pos2;
        String name = "";
        int age = 0;
        String hobby = "";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ','){
                pos1 = i;
                name = string.substring(0, pos1);
            }
            if (string.charAt(i) == ';'){
                pos2 = i;
                age = Integer.parseInt(string.substring(pos1 + 1, pos2));
                hobby = string.substring(pos2 + 1);
            }
        }
        friends.add(new Friend(name, age, hobby));
    }
}
