package com.example.jeopardyjavaproject;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ChoiceBox;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

import java.io.IOException;
import java.lang.reflect.Array;


public class QuestionWindow {
Scene QuestionWindowScene;
    @FXML
    public Label QuestionAsked;
    @FXML
    public Label QuestionAskedPartII;
    @FXML
    public TextField UsersAnswer;
    @FXML
    public Button SubmitAnswer;


    public void start(Stage stage) throws IOException {
        //Call the QuestionClass to get the question
        QuestionClass Question = new QuestionClass();
        String prize = "";
        Question.getQuestion(prize) = [];




        //Set the scene
        // Create the scene from the FXML file
        Parent root = FXMLLoader.load(getClass().getResource("QuestionWindow.fxml"));
        QuestionWindowScene = new Scene(root, 320, 240);

    }
}
