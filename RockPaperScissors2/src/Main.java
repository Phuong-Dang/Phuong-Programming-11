import java.io.InputStream;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int user;
        int computer;
        int totalScore = 0;
        int totalLoss = 0;

        do {
            System.out.println("\nChoose rock paper or scissors. '1' for rock, '2' for paper and '3' for scissors. To exit type 0.");
            int random = (int) (Math.random() * 4);
            user = Integer.parseInt(scan.next());
            computer = random;


            //User
            if (user > 3)
                System.out.println("Invalid selection\n------------------------------------------------");
            if (user < 0)
                System.out.println("Invalid selection\n------------------------------------------------");
            if (user == 0)
                System.out.println("Thank you for playing!");


            //Computer
            if (user == 1 && user == computer) {
                System.out.println("Player chose: rock   Computer chose: rock");
                System.out.println("Draw");

            } else if (user == 1 && user > computer) {
                System.out.println("Player chose: rock   Computer chose: scissors");
                System.out.println("You Win");

            } else if (user == 1 && user < computer) {
                System.out.println("Player chose: rock   Computer chose: paper");
                System.out.println("You Lose");

            }

            if (user == 2 && user == computer) {
                System.out.println("Player chose: paper  Computer chose: paper");
                System.out.println("Draw");

            } else if (user == 2 && user > computer) {
                System.out.println("Player chose: paper  Computer chose: rock");
                System.out.println("You Win");

            } else if (user == 2 && user < computer) {
                System.out.println("Player chose: paper  Computer chose: scissors");
                System.out.println("You Lose");

            }

            if (user == 3 && user == computer) {
                System.out.println("Player chose: scissors  Computer chose: scissors");
                System.out.println("Draw");

            } else if (user == 3 && user > computer) {
                System.out.println("Player chose: scissors  Computer chose: paper ");
                System.out.println("You Win");

            } else if (user == 3 && user < computer) {
                System.out.println("Player chose: scissors  Computer chose: rock");
                System.out.println("You Lose");

            }



            if (user > computer && user < 4) {
                int i=1;
                totalScore += i++;
                System.out.print("Wins: " + totalScore + " Losses: " + totalLoss + "\n------------------------------------------------");
            }
            if (user < computer && user>0) {
                int x=1;
                totalLoss += x++;
                System.out.print("Wins: " + totalScore + " Losses: " + totalLoss + "\n------------------------------------------------");
            }
            if (user == computer) {
                System.out.println("Wins: " + totalScore + " Losses: " + totalLoss + "\n------------------------------------------------");
            }
        }while(user!=0);
    }
}
