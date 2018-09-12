package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import sample.helper.Navigator;

import java.net.URL;
import java.util.ResourceBundle;

public class Dashboard implements Initializable {

    private Navigator navigator = new Navigator();

    @FXML
    private BorderPane rootpane;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        navigator.changeCenterLayout(rootpane, "/sample/UI/patients");
    }


    @FXML
    void checkUpScreen(ActionEvent event) {
        navigator.changeCenterLayout(rootpane, "/sample/UI/check_up");
    }

    @FXML
    void contactSupport(ActionEvent event) {

    }

    @FXML
    void patientScreen(ActionEvent event) {
        navigator.changeCenterLayout(rootpane, "/sample/UI/patients");
    }

    @FXML
    void reportScreen(ActionEvent event) {

    }

    @FXML
    void settingsScreen(ActionEvent event) {

    }

    @FXML
    void toolsScreen(ActionEvent event) {

    }

    @FXML
    void userScreen(ActionEvent event) {
        navigator.changeCenterLayout(rootpane, "/sample/UI/users");
    }
}
