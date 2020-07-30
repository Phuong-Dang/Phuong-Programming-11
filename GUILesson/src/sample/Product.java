package sample;

public class Product {
    int moneyAmt;
    int betAmt;

    Product (int moneyAmount, int betAmount) {
        moneyAmt = moneyAmount;
        betAmt = betAmount;
    }
    public int win () {
        moneyAmt += betAmt;
        return moneyAmt;
    }

    public int lose () {
        moneyAmt -= betAmt;
        return moneyAmt;
    }
}