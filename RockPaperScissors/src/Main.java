import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int user;
        int computer;

        System.out.println("Choose rock paper or scissors. '1' for rock, '2' for paper and '3' for scissors.");
        int random = (int) (Math.random() * 4);
        user = Integer.parseInt(scan.next());


        //User
        if (user>3)
            System.out.println("Invalid selection");
        computer = random;


        //Computer
        if (user==1 && user==computer){
            System.out.println("Player chose: rock   Computer chose: rock");
        }
        else if (user==1 && user>computer){
            System.out.println("Player chose: rock   Computer chose: scissors");
        }
        else if (user ==1 && user<computer){
            System.out.println("Player chose: rock   Computer chose: paper");
        }

        if (user==2 && user==computer){
            System.out.println("Player chose: paper  Computer chose: paper");
        }
        else if (user==2 && user>computer){
            System.out.println("Player chose: paper  Computer chose: rock");
        }
        else if (user==2 && user<computer){
            System.out.println("Player chose: paper  Computer chose: scissors");
        }

        if (user==3 && user==computer){
            System.out.println("Player chose: scissors  Computer chose: scissors");
        }
        else if (user==3 && user>computer){
            System.out.println("Player chose: scissors  Computer chose: paper ");
        }
        else if (user==3 && user<computer){
            System.out.println("Player chose: scissors  Computer chose: rock");
        }


        //Result
        if (user==computer){
            System.out.println("Draw");
        }
        else if (user<computer){
            System.out.println("You Lose");
        }
        else if (user>computer && user<4){
            System.out.println("You Win");
        }
    }
}
