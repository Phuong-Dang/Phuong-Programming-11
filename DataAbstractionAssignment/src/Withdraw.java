import java.util.Date;

public class Withdraw {
    private double amount;
    private Date date;
    private String account;

    Withdraw(double amount, Date date, String account) {
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    public String toString() {
        //your code here
        return "\nWithdraw of: $" + this.amount + " Date: " + this.date + " from account: " + this.account;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
