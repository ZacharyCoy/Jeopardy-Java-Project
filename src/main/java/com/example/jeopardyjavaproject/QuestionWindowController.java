package com.example.jeopardyjavaproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.stage.Window;

import java.io.IOException;
import java.util.ArrayList;



public class QuestionWindowController {
    private Stage stage;

    private Parent root2;

    private Window window;
    @FXML
    public Label QuestionAsked;
    @FXML
    public Label QuestionAskedPartII;
    @FXML
    public TextField UsersAnswer;
    @FXML
    public Button SubmitAnswer;

    int CurrentScore;


    String QuestionValue = "";
    int QuestionNumber = 0;
    int Score;

    QuestionClass Question = new QuestionClass();
    private boolean buttonA1Used;
    private boolean buttonA2Used;
    private boolean buttonA3Used;
    private boolean buttonA4Used;
    private boolean buttonA5Used;
    private boolean buttonA6Used;
    private boolean buttonB1Used;
    private boolean buttonB2Used;
    private boolean buttonB3Used;
    private boolean buttonB4Used;
    private boolean buttonB5Used;
    private boolean buttonB6Used;
    private boolean buttonC1Used;
    private boolean buttonC2Used;
    private boolean buttonC3Used;
    private boolean buttonC4Used;
    private boolean buttonC5Used;
    private boolean buttonC6Used;
    private boolean buttonD1Used;
    private boolean buttonD2Used;
    private boolean buttonD3Used;
    private boolean buttonD4Used;

    private boolean buttonD5Used;
    private boolean buttonD6Used;
    private boolean buttonE1Used;
    private boolean buttonE2Used;
    private boolean buttonE3Used;
    private boolean buttonE4Used;
    private boolean buttonE5Used;
    private boolean buttonE6Used;

    public void Initialize() throws IOException{
        //if a intilaization of the QuestionClass is not already done. initialize it with name Question
        if(Question == null){
            Question = new QuestionClass();

        }
        Question.getQuestion(QuestionValue, QuestionNumber);
        QuestionAsked.setText(Question.getQuestionPartI());
        QuestionAskedPartII.setText(Question.getQuestionPartII().toString());

    }
    public void CheckAnswer(){
        String Answer = UsersAnswer.getText();
        System.out.println("User Answer: " + Answer+ " Correct Answer: " + Question.getAnswer());
        if(Answer.equals(Question.getAnswer())){
            System.out.println("Correct");
            Score = Integer.parseInt((QuestionValue.substring(1)));
            System.out.println("Score: " + Score);
        }
        else{
            System.out.println("Incorrect");
            Score = 0;
        }
    }

    public void getBooleansFromMain(boolean buttonA1Used, boolean buttonA2Used, boolean buttonA3Used, boolean buttonA4Used, boolean buttonA5Used, boolean buttonA6Used, boolean buttonB1Used, boolean buttonB2Used, boolean buttonB3Used, boolean buttonB4Used, boolean buttonB5Used, boolean buttonB6Used, boolean buttonC1Used, boolean buttonC2Used, boolean buttonC3Used, boolean buttonC4Used, boolean buttonC5Used, boolean buttonC6Used, boolean buttonD1Used, boolean buttonD2Used, boolean buttonD3Used, boolean buttonD4Used, boolean buttonD5Used, boolean buttonD6Used, boolean buttonE1Used, boolean buttonE2Used, boolean buttonE3Used, boolean buttonE4Used, boolean buttonE5Used, boolean buttonE6Used){
    this.buttonA1Used = buttonA1Used;
    this.buttonA2Used = buttonA2Used;
    this.buttonA3Used = buttonA3Used;
    this.buttonA4Used = buttonA4Used;
    this.buttonA5Used = buttonA5Used;
    this.buttonA6Used = buttonA6Used;
    this.buttonB1Used = buttonB1Used;
    this.buttonB2Used = buttonB2Used;
    this.buttonB3Used = buttonB3Used;
    this.buttonB4Used = buttonB4Used;
    this.buttonB5Used = buttonB5Used;
    this.buttonB6Used = buttonB6Used;
    this.buttonC1Used = buttonC1Used;
    this.buttonC2Used = buttonC2Used;
    this.buttonC3Used = buttonC3Used;
    this.buttonC4Used = buttonC4Used;
    this.buttonC5Used = buttonC5Used;
    this.buttonC6Used = buttonC6Used;
    this.buttonD1Used = buttonD1Used;
    this.buttonD2Used = buttonD2Used;
    this.buttonD3Used = buttonD3Used;
    this.buttonD4Used = buttonD4Used;
    this.buttonD5Used = buttonD5Used;
    this.buttonD6Used = buttonD6Used;
    this.buttonE1Used = buttonE1Used;
    this.buttonE2Used = buttonE2Used;
    this.buttonE3Used = buttonE3Used;
    this.buttonE4Used = buttonE4Used;
    this.buttonE5Used = buttonE5Used;
    this.buttonE6Used = buttonE6Used;
    }


    public void getVariablesFromMain(String value, int number, int CurrentScore) throws IOException{
        this.QuestionValue = value;
        this.QuestionNumber = number;
        this.CurrentScore = CurrentScore;
    }

    public void SubmitUserAnswer(ActionEvent event) throws IOException {
        //switch back the Main Window
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MainWindow.fxml"));
        Parent root = loader.load();
        //Getting the controller of QuestionWindow.fxml
        MainWindowController MainWindowFXMLController = loader.getController();
        CheckAnswer();
        MainWindowFXMLController.getVariablesFromQuestion(QuestionValue, QuestionNumber, Score, CurrentScore);
        MainWindowFXMLController.getBooleansFromQuestionScene(buttonA1Used, buttonA2Used, buttonA3Used, buttonA4Used, buttonA5Used, buttonA6Used, buttonB1Used, buttonB2Used, buttonB3Used, buttonB4Used, buttonB5Used, buttonB6Used, buttonC1Used, buttonC2Used, buttonC3Used, buttonC4Used, buttonC5Used, buttonC6Used, buttonD1Used, buttonD2Used, buttonD3Used, buttonD4Used, buttonD5Used, buttonD6Used, buttonE1Used, buttonE2Used, buttonE3Used, buttonE4Used, buttonE5Used, buttonE6Used);
        MainWindowFXMLController.CalculateCurrentScore();
        MainWindowFXMLController.ButtonGreyedOut();
        //Setting the scene
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Main Window");
        stage.show();
    }


}
