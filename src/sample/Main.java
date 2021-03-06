package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import sample.helper.ResizeHelper;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("UI/nontitlebar/Login.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Hospital Record Management System");
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/sample/drawable/doctor_bag_black.png")));
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
