package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Point2D;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.util.ArrayList;

public class Controller {
    public Button btnCreate;
    public TextField txtName;
    public TextField txtAge;
    public TextField txtHobby;
    public TextArea txtAreaFriendInfo;
    public ListView<Friend> listFriend;
    public Button btnViewInfo;
    public Button btnDel;

    public ListView<Friend> listSaves;
    public Button btnRestore;
    public Button btnSaveList;

    public void printCreate(ActionEvent actionEvent) {
        String name = txtName.getText();
        int age = Integer.parseInt(txtAge.getText());
        String hobby = txtHobby.getText();

        Friend list = new Friend(name, age, hobby);

        listFriend.getItems().add(list);

        txtName.clear();
        txtAge.clear();
        txtHobby.clear();
    }

    public void printInfo(ActionEvent actionEvent) {
        Friend list;
        list = listFriend.getSelectionModel().getSelectedItem();
        txtAreaFriendInfo.setText("Age: " + list.age() + ". Hobby: " + list.hobby);
    }

    public void delFriend(ActionEvent actionEvent) {
        Friend list;
        list = listFriend.getSelectionModel().getSelectedItem();
        listFriend.getItems().remove(list);
        txtAreaFriendInfo.setText("");
    }

    public void hideFriend(MouseEvent mouseEvent) {
        txtAreaFriendInfo.setText("");
    }


    public void saveList(ActionEvent actionEvent) throws IOException {
        ObservableList<Friend> myList = listFriend.getItems();
        for (Friend f : myList) {
            f.writeToFile();
        }
        listFriend.getItems().clear();
    }

    public void restoreSave(ActionEvent actionEvent) throws IOException {
        listFriend.getItems().clear();
            ArrayList<Friend> friends = CreateFriend.createAllFriends("friends.txt");
            for (Friend p : friends) {
                listFriend.getItems().add(p);
        }
    }
}
