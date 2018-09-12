package sample.helper;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class Navigator implements Navigation {

    private Parent root = null;
    private Stage stage;


    @Override
    public void navigateSceneTo(Node node, String dir) {
        try {
            root = FXMLLoader.load(getClass().getResource(dir + ".fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = null;
        if (root != null) {
            scene = new Scene(root);
        }

        stage = (Stage) node.getScene().getWindow();
        stage.setScene(scene);

        centerOnScreen(stage);

    }

    public void changeCenterLayout(BorderPane borderPane, String dir){
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource(dir + ".fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        borderPane.setCenter(root);
    }

    // TODO: 012, 12, Sep, 2018  Fix This
    //Fix this please.
    private void centerOnScreen(Stage stage){
        float CENTER_ON_SCREEN_X_FRACTION = 1.0f / 2;
        float CENTER_ON_SCREEN_Y_FRACTION = 1.0f / 3;


        Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
        stage.setX((primScreenBounds.getWidth() - stage.getWidth()) / 2);
        stage.setY((primScreenBounds.getHeight() - stage.getHeight()) / 2);
    }
}
