package com.example.jeopardyjavaproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class main extends Application {


    /**
     * Initializes and displays the Main Window.
     *
     * This method is called by the JavaFX runtime to initialize the Main Window
     * and display it on the stage.
     *
     * @param stage the Stage on which the Main Window will be displayed
     * @throws IOException if there is an error loading the FXML file for the Main Window
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("MainWindow.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 600, 360);
        stage.setTitle("Jeopardy");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}