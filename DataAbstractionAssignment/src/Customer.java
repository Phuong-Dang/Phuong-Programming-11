import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Customer {

    private int accountNumber;
    private ArrayList<Deposit> deposits = new ArrayList<>();
    private ArrayList<Withdraw> withdraws = new ArrayList<>();
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;

    Customer() {
        //create default constructor
        name = "";
        accountNumber = 0;
        checkBalance = 0;
        savingBalance = 0;
        savingRate = 0;
    }

    Customer(String name, int accountNumber, double checkDeposit, double savingDeposit) {
        //constructor code here
        this.name = name;
        this.accountNumber = accountNumber;
        this.checkBalance += checkDeposit;
        this.savingBalance += savingDeposit + savingDeposit * savingRate;
    }

    //Requires: double, string, date
    //Modifies: this
    //Effects: deposit amt into checking/saving account, display the date
    public double deposit(double amt, Date date, String account) {
        //your code here
        Scanner scan = new Scanner(System.in);
        String userAction = "";
        date = new Date();
        checkBalance += amt;
        savingBalance += amt;

        do {
            System.out.println("Enter action (Balance/Display/Continue): ");
            userAction = scan.next();

            if (userAction.equals("Balance")) {
                if (account.equals(CHECKING)) {
                    System.out.println("Checking Balance: $" + checkBalance);
                } else if (account.equals(SAVING)) {
                    System.out.println("Saving Balance: $" + savingBalance);
                }
            }

            if (userAction.equals("Display")) {
                String depositString = deposits.toString();
                System.out.println("Display: " + depositString.substring(1, depositString.length() - 1));
            }

        } while (!userAction.equals("Continue"));

        return 0;
    }

    //Requires: double, string, date
    //Modifies: this
    //Effects: deposit amt into checking/saving account, display the date
    public double withdraw(double amt, Date date, String account) {
        //your code here
        Scanner scan = new Scanner(System.in);
        String userAction = "";
        date = new Date();
        checkBalance -= amt;
        savingBalance -= amt;

        do {
            System.out.println("Enter action (Balance/Display/Continue): ");
            userAction = scan.next();
            if (userAction.equals("Balance")) {
                if (account.equals(CHECKING)) {
                    System.out.println("Checking Balance: $" + checkBalance);
                } else if (account.equals(SAVING)) {
                    System.out.println("Saving Balance: $" + savingBalance);
                }
            }

            if (userAction.equals("Display")) {
                String withdrawString = withdraws.toString();
                System.out.println("Display: " + withdrawString.substring(1, withdrawString.length() - 1));
            }

        } while (!userAction.equals("Continue"));

        return 0;
    }

    //Requires: double, amt, string, account
    //Effect: return true if the user withdraw is greater than overdraft, if else return false
    private boolean checkOverdraft(double amt, String account) {
        //your code here
        if (checkBalance < OVERDRAFT || savingBalance <OVERDRAFT) {
            return true;
        } else
        return false;
    }

    //do not modify
    public void displayDeposits() {
        for (Deposit d : deposits) {
            System.out.println(d);
        }
    }

    //do not modify
    public void displayWithdraws() {
        for (Withdraw w : withdraws) {
            System.out.println(w);
        }
    }

    public ArrayList<Deposit> getDeposits() {
        return deposits;
    }

    public void setDeposits(ArrayList<Deposit> deposits) {
        this.deposits = deposits;
    }

    public ArrayList<Withdraw> getWithdraws() {
        return withdraws;
    }

    public void setWithdraws(ArrayList<Withdraw> withdraws) {
        this.withdraws = withdraws;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getCheckBalance() {
        return checkBalance;
    }

    public void setCheckBalance(double checkBalance) {
        this.checkBalance = checkBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public double getSavingRate() {
        return savingRate;
    }

    public void setSavingRate(double savingRate) {
        this.savingRate = savingRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
