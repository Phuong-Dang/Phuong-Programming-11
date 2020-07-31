package sample;

public class Friend {
    String name;
    private int age;
    String hobby;
    private int friendNum = 0;

    Friend (String nm, int ae, String hbby) {
        name = nm;
        age = ae;
        hobby = hbby;
    }

    //getters and setters
    public int addFriend () {
        friendNum++;
        return friendNum;
    }

    public int display () { return friendNum; }

    public int age () {
        return age;
    }

    public String toString () {
        return name;
    }
}
