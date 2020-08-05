package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class Controller {
    public Button btnCreate;
    public TextField txtName;
    public TextField txtAge;
    public TextField txtHobby;
    public TextArea txtAreaFriendInfo;
    public ListView<Friend> listFriend;
    public Button btnViewInfo;
    public Button btnDel;

    public void printCreate(ActionEvent actionEvent) {
        String name =  txtName.getText();
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
}
