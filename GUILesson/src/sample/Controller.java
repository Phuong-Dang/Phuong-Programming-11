package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {

    public Button btnDice1;
    public Button btnDice2;
    public TextField txtDice1;
    public TextField txtDice2;
    public Button btnBet;
    public TextField txtAmount;
    public Label lblMoney;
    public Label lblBet;
    public Label Dice1Res;
    public Label Dice2Res;
    public TextField Result;
    public Button btnResult;

    public void printAmount(ActionEvent actionEvent) {
        Result.setText("");
        btnResult.setDisable(false);
        int num = Integer.parseInt(txtAmount.getText());
        int money = Integer.parseInt(lblMoney.getText());
        if (num <= money) {
            lblBet.setText(String.valueOf(num));
            txtAmount.clear();
            btnBet.setDisable(true);
            txtAmount.setDisable(true);
        }
    }

    public void printDice1(ActionEvent actionEvent) {
        int num = (int) (Math.random() * 6);
        txtDice1.setText(Integer.toString(num));
        Dice1Res.setText(Integer.toString(num));
        btnDice1.setDisable(true);
        txtDice1.setDisable(true);
    }

    public void printDice2(ActionEvent actionEvent) {
        int num = (int) (Math.random() * 6);
        txtDice2.setText(Integer.toString(num));
        Dice2Res.setText(Integer.toString(num));
        btnDice2.setDisable(true);
        txtDice2.setDisable(true);
    }

    public void printResult(ActionEvent actionEvent) {
        Product temp;
        int money = Integer.parseInt(lblMoney.getText());
        int bet = Integer.parseInt(lblBet.getText());
        temp = new Product(money, bet);
        int two = Integer.parseInt(Dice2Res.getText());
        int one = Integer.parseInt(Dice1Res.getText());
        if (one > two) {
            Result.setText("Won");
            lblMoney.setText(String.valueOf(temp.win()));
        } else {
            Result.setText("Lost");
            lblMoney.setText(String.valueOf(temp.lose()));
        }
        btnResult.setDisable(true);

        //Reset Buttons
        txtDice2.setDisable(false);
        txtDice1.setDisable(false);
        btnBet.setDisable(false);
        btnDice2.setDisable(false);
        btnDice1.setDisable(false);
        lblBet.setText("");
        txtDice1.setText("");
        txtDice2.setText("");
        Dice1Res.setText("");
        Dice2Res.setText("");
        txtAmount.setDisable(false);
    }

}
