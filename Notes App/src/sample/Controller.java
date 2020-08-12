package sample;
import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

import java.io.IOException;
import java.util.ArrayList;

public class Controller {
    public TextArea txtNotes;
    public TextField txtField1;
    public CheckBox btnCheck;
    public TextField txtField2;
    public CheckBox btnCheck2;
    public TextField txtField3;
    public CheckBox btnCheck3;
    public TextField txtField4;
    public CheckBox btnCheck4;
    public TextField rdm1;
    public TextField rdm2;
    public TextField rdm3;
    public TextField rdm4;

    //Initialize all the fields when the app opens
    public void initialize() throws IOException {
        //Set buttons disable
        btnCheck.setDisable(true);
        btnCheck2.setDisable(true);
        btnCheck3.setDisable(true);
        btnCheck4.setDisable(true);
        //Restore last saved Notes and List
        String restoreNotes = CreateNotes.restoreNotes("notes.txt");
        txtNotes.setText(restoreNotes);
    }

    //Notes
    //Save notes to notes.txt
    public void saveNotes(ActionEvent actionEvent) throws IOException {
        CreateNotes.saveNotes(txtNotes.getText());
    }

    //Manually restore saved Notes from notes.txt
    public void restoreNotes(ActionEvent actionEvent) throws IOException {
        txtNotes.clear();
        String restore = CreateNotes.restoreNotes("notes.txt");
        txtNotes.setText(restore);
    }

    //To-do List
    public void checkList(ActionEvent actionEvent) {
        //Reset text field and checklist
        txtField1.setText("");
        btnCheck.setSelected(false);
        btnCheck.setDisable(true);
        //Reset random text field
        rdm1.setText("");
    }

    public void writeList(KeyEvent actionEvent) throws IOException {
        //Enable button while user is writing
        btnCheck.setDisable(false);
        //Import text from "to-do list" tab to "random choice" tab while user is writing
        String choice = txtField1.getText();
        rdm1.setText(choice);
    }

    public void checkList2(ActionEvent actionEvent) {
        //Reset text field and checklist
        txtField2.setText("");
        btnCheck2.setSelected(false);
        btnCheck2.setDisable(true);
        //Reset random text field
        rdm2.setText("");
    }

    public void writeList2(KeyEvent actionEvent) throws IOException {
        //Enable button while user is writing
        btnCheck2.setDisable(false);
        //Import text from "to-do list" tab to "random choice" tab while user is writing
        String choice = txtField2.getText();
        rdm2.setText(choice);
    }

    public void checkList3(ActionEvent actionEvent) {
        //Reset text field and checklist
        txtField3.setText("");
        btnCheck3.setSelected(false);
        btnCheck3.setDisable(true);
        //Reset random text field
        rdm3.setText("");
    }

    public void writeList3(KeyEvent keyEvent) throws IOException {
        //Enable button while user is writing
        btnCheck3.setDisable(false);
        //Import text from "to-do list" tab to "random choice" tab while user is writing
        String choice = txtField3.getText();
        rdm3.setText(choice);
    }

    public void checkList4(ActionEvent actionEvent) {
        //Reset text field and checklist
        txtField4.setText("");
        btnCheck4.setSelected(false);
        btnCheck4.setDisable(true);
        //Reset random text field
        rdm4.setText("");
    }

    public void writeList4(KeyEvent keyEvent) throws IOException {
        //Enable button while user is writing
        btnCheck4.setDisable(false);
        //Import text from "to-do list" tab to "random choice" tab while user is writing
        String choice = txtField4.getText();
        rdm4.setText(choice);
    }

    public void saveList(ActionEvent actionEvent) throws IOException {
        //Save the texts in TextFields to "list.txt"
        RandomChoices.saveList(txtField1.getText() + ",\n.\n" + txtField2.getText() + ",\n.\n" + txtField3.getText() + ",\n.\n" + txtField4.getText() + ",\n.\n");
    }

    public void restoreList(ActionEvent actionEvent) throws IOException {
        //Restore TextFields in To-do List
        ArrayList<RandomChoices> list = RandomChoices.restoreList("list.txt");
        txtField1.setText(String.valueOf(list.get(0)));
        txtField2.setText(String.valueOf(list.get(1)));
        txtField3.setText(String.valueOf(list.get(2)));
        txtField4.setText(String.valueOf(list.get(3)));
        //Enable Checkboxes
        btnCheck.setDisable(false);
        btnCheck2.setDisable(false);
        btnCheck3.setDisable(false);
        btnCheck4.setDisable(false);
    }

    //Random Choice
    public void randomize(ActionEvent actionEvent) {
        //Randomize 4 choices
        int random = (int) (Math.random() * 4 + 1);
        if (random == 1) {
            rdm1.setText(txtField1.getText());
            rdm2.setText("");
            rdm3.setText("");
            rdm4.setText("");
        } else if (random == 2) {
            rdm1.setText("");
            rdm2.setText(txtField2.getText());
            rdm3.setText("");
            rdm4.setText("");
        } else if (random == 3) {
            rdm1.setText("");
            rdm2.setText("");
            rdm3.setText(txtField3.getText());
            rdm4.setText("");
        } else if (random == 4) {
            rdm1.setText("");
            rdm2.setText("");
            rdm3.setText("");
            rdm4.setText(txtField4.getText());
        }
    }

    public void resetChoice(ActionEvent actionEvent) {
        //Reset the choice fields
        rdm1.setText(txtField1.getText());
        rdm2.setText(txtField2.getText());
        rdm3.setText(txtField3.getText());
        rdm4.setText(txtField4.getText());
    }
}
