package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static Stage STAGE;
    public static Scene SCENE;
    public static String filename = "test2.csv";

    @Override
    public void start(Stage primaryStage) throws Exception{
        STAGE = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("/sample.fxml"));
        primaryStage.setTitle("Printer");
        SCENE = new Scene(root, 510, 450);
        primaryStage.setScene(SCENE);
        primaryStage.show();
    }




    public static void main(String[] args) {
        launch(args);
    }
}
