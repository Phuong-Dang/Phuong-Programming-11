import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Scanner scan = new Scanner(System.in);
        String account;
        String action;

        do {
            System.out.println("Enter action (Deposit/Withdraw/End): ");
            action = scan.next();

            if (action.equals("Deposit") || action.equals("Withdraw")) {
                System.out.println("Enter account (Checking/Saving): ");
                account = scan.next();

                if (account.equals(Customer.CHECKING) || account.equals(Customer.SAVING)) {
                    System.out.println("Enter amount: ");
                    double userAmount = scan.nextDouble();

                    if (action.equals("Deposit")) {
                        Deposit deposit = new Deposit(userAmount, new Date(), account);
                        System.out.println("Deposit: " + deposit);
                        customer.getDeposits().add(deposit);
                        System.out.println(customer.deposit(userAmount, new Date(), account));
                    }

                    if (action.equals("Withdraw")) {
                        Withdraw withdraw = new Withdraw(userAmount, new Date(), account);
                        System.out.println("Withdraw: " + withdraw);
                        customer.getWithdraws().add(withdraw);
                        System.out.println(customer.withdraw(userAmount, new Date(), account));
                    }
                }
            }
        } while (!action.equals("End"));
    }
}