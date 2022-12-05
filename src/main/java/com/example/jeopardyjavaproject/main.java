package com.example.jeopardyjavaproject;
import com.example.jeopardyjavaproject.MainWindowController;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.layout.*;

//import MainWindowController



import java.io.IOException;

public class main extends Application {



    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("MainWindow.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 1500, 800);
        stage.setTitle("Jeopardy");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}