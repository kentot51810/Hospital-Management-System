package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import sample.helper.Navigator;

import java.net.URL;
import java.util.ResourceBundle;

public class SignUp implements Initializable {

    private Navigator navigator = new Navigator();

    @FXML
    void login(ActionEvent event) {
        Node node = (Node) event.getSource();
        navigator.navigateTo(node, "/sample/UI/nontitlebar/login");
    }

    @FXML
    void signup(ActionEvent event) {

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
