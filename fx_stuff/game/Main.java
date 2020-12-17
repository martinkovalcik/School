package sk.itsovy.kovalcik.fx_stuff.game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello guys");
        primaryStage.setScene(new Scene(root, 445, 445));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
