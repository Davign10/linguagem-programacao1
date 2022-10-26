package com.example.celular;


import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;

public class HelloApplication extends Application {

    private static Stage stage;
    private static Scene celular;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;

        primaryStage.setTitle("Celular");

        Parent layout_celular = FXMLLoader.load(getClass().getResource("layout_celular.fxml"));
        celular = new Scene(layout_celular);

        stage = primaryStage;
        primaryStage.setScene(celular);
        primaryStage.show();
        primaryStage.setFullScreen(true);
    }

    public static void ChangeScene (String tela){
        switch (tela) {
            case "celular":
                stage.setScene(celular);
                stage.setFullScreen(true);
                break;
        }
    }
    public static void main(String[] args){launch();}
}
