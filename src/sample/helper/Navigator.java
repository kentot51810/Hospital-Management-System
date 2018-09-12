package sample.helper;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Navigator implements Navigation {

    private Parent root = null;
    private Stage stage;


    @Override
    public void navigateTo(Node node, String dir) {
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

    }

    // TODO: 012, 12, Sep, 2018  Fix This
    //Fix this please.
    private void centerOnScreen(){
        float CENTER_ON_SCREEN_X_FRACTION = 1.0f / 2;
        float CENTER_ON_SCREEN_Y_FRACTION = 1.0f / 3;


//        Rectangle2D bounds = getWindowScreen().getVisualBounds();


//        double centerX = bounds.getMinX() + (bounds.getWidth() - getWidth())
//                * CENTER_ON_SCREEN_X_FRACTION;
//        double centerY = bounds.getMinY() + (bounds.getHeight() - getHeight())
//                * CENTER_ON_SCREEN_Y_FRACTION;
//        x.set(centerX);
//        y.set(centerY);
    }
}
