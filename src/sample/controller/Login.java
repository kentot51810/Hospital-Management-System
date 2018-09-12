package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import sample.helper.Navigator;

import java.net.URL;
import java.util.ResourceBundle;

public class Login implements Initializable {

    private Navigator navigator = new Navigator();


    @FXML
    void forgotPassword(MouseEvent event) {

    }

    @FXML
    void logIn(MouseEvent event) {

        //add a gist of code for security purpose
        //maybe a permission from a database

        Node node = (Node) event.getSource();
        navigator.navigateTo(node, "/sample/UI/nontitlebar/dashboard");

    }

    @FXML
    void signUp(ActionEvent event) {
        Node node = (Node) event.getSource();

        navigator.navigateTo(node, "/sample/UI/nontitlebar/signup");
    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
