package com.example.jeopardyjavaproject;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ChoiceBox;
import javafx.event.ActionEvent;
import javafx.stage.Stage;


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


    public void start(Stage stage) {
        //Call the QuestionClass to get the question
        QuestionClass Question = new QuestionClass();
        String prize = "";
        Question.getQuestion(prize);
        //Set the scene
        // Create the scene from the FXML file
        QuestionWindowScene = new Scene(loadFXML("QuestionWindow"), 320, 240);

    }
}
