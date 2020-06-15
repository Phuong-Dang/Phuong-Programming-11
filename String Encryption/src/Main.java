import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String add = "ay";
        String user;
        user = scan.next();
        String user1 = user.substring(1);
        String user23 = user.substring(2,3);
        int length = user.length();
        if (length <= 4) {
            String encryption = user23 + user1 + add;
            System.out.println(encryption);
        } else if (length >= 5) {
            String user4 = user.substring(4);
            String user5 = user.substring(5);
            String encryptionMore = user1 + user5 + add + user4;
            System.out.println(encryptionMore);
        }

    }
}
