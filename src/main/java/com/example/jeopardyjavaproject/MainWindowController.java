package com.example.jeopardyjavaproject;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;


import java.io.IOException;
import java.util.ArrayList;
import java.util.EventObject;
import java.util.Objects;
import javafx.scene.control.Button;


public class MainWindowController{

    public void CalculateCurrentScore(){
        CurrentScore = CurrentScore + Score;
        System.out.println("Current Score calculated at the CalculateCurrentScore Function is: " + CurrentScore);
        ScoreLabel.setText(String.valueOf(CurrentScore));

    }
    private Stage stage;
    private Scene scene;
    private Parent root;

    private Label ScoreLabel;
    @FXML
    public Button buttonA1;
    @FXML
    public Button buttonA2;
    @FXML
    public Button buttonA3;
    @FXML
    public Button buttonA4;
    @FXML
    public Button buttonA5;
    @FXML
    public Button buttonA6;
    @FXML
    public Button buttonB1;
    @FXML
    public Button buttonB2;
    @FXML
    public Button buttonB3;
    @FXML
    public Button buttonB4;
    @FXML
    public Button buttonB5;
    @FXML
    public Button buttonB6;
    @FXML
    public Button buttonC1;
    @FXML
    public Button buttonC2;
    @FXML
    public Button buttonC3;
    @FXML
    public Button buttonC4;
    @FXML
    public Button buttonC5;
    @FXML
    public Button buttonC6;
    @FXML
    public Button buttonD1;
    @FXML
    public Button buttonD2;
    @FXML
    public Button buttonD3;
    @FXML
    public Button buttonD4;
    @FXML
    public Button buttonD5;
    @FXML
    public Button buttonD6;
    @FXML
    public Button buttonE1;
    @FXML
    public Button buttonE2;
    @FXML
    public Button buttonE3;
    @FXML
    public Button buttonE4;
    @FXML
    public Button buttonE5;
    @FXML
    public Button buttonE6;
    @FXML
    public TextField UsersAnswer;
    @FXML
    public Button SubmitAnswer;
    private EventObject event;
    private QuestionClass Question;
    private Scene secondScene;

    int CurrentScore = 0;
    int Score = 0;

    //initialize the booleans for the buttons
    boolean buttonA1Used;
    boolean buttonA2Used;
    boolean buttonA3Used;
    boolean buttonA4Used;
    boolean buttonA5Used;
    boolean buttonA6Used;
    boolean buttonB1Used;
    boolean buttonB2Used;
    boolean buttonB3Used;
    boolean buttonB4Used;
    boolean buttonB5Used;
    boolean buttonB6Used;
    boolean buttonC1Used;
    boolean buttonC2Used;
    boolean buttonC3Used;
    boolean buttonC4Used;
    boolean buttonC5Used;
    boolean buttonC6Used;
    boolean buttonD1Used;
    boolean buttonD2Used;
    boolean buttonD3Used;
    boolean buttonD4Used;
    boolean buttonD5Used;
    boolean buttonD6Used;
    boolean buttonE1Used;
    boolean buttonE2Used;
    boolean buttonE3Used;
    boolean buttonE4Used;
    boolean buttonE5Used;
    boolean buttonE6Used;

    public void setSecondScene(Scene scene) {
        secondScene = scene;
    }
    int number = 0;
    String value = "";


        //Create an empty arraylist of used buttons to prevent the same button from being used twice





    public void getVariablesFromQuestion(String value, int number, int Score, int CurrentScore) throws IOException{
        this.value = value;
        this.number = number;
        this.CurrentScore = CurrentScore;
        this.Score = Score;
        System.out.println("Current Score: " + CurrentScore);
    }
    public void ButtonGreyedOut(){
        //Check if the button has been used with variable buttonA1Used, if it has been used, grey out the button
        if(buttonA1Used == true){
            buttonA1.setStyle("-fx-background-color: #808080");
            System.out.println("Button A1 has been used");
        }
        if(buttonA2Used == true){
            buttonA2.setStyle("-fx-background-color: #808080");
            System.out.println("Button A2 has been used");
        }
        if(buttonA3Used == true){
            buttonA3.setStyle("-fx-background-color: #808080");
            System.out.println("Button A3 has been used");
        }
        if(buttonA4Used == true){
            buttonA4.setStyle("-fx-background-color: #808080");
            System.out.println("Button A4 has been used");
        }
        if(buttonA5Used == true){
            buttonA5.setStyle("-fx-background-color: #808080");
            System.out.println("Button A5 has been used");
        }
        if(buttonA6Used == true){
            buttonA6.setStyle("-fx-background-color: #808080");
            System.out.println("Button A6 has been used");
        }
        if(buttonB1Used == true){
            buttonB1.setStyle("-fx-background-color: #808080");
            System.out.println("Button B1 has been used");
        }
        if(buttonB2Used == true){
            buttonB2.setStyle("-fx-background-color: #808080");
            System.out.println("Button B2 has been used");
        }
        if(buttonB3Used == true){
            buttonB3.setStyle("-fx-background-color: #808080");
            System.out.println("Button B3 has been used");
        }
        if(buttonB4Used == true){
            buttonB4.setStyle("-fx-background-color: #808080");
            System.out.println("Button B4 has been used");
        }
        if(buttonB5Used == true){
            buttonB5.setStyle("-fx-background-color: #808080");
            System.out.println("Button B5 has been used");
        }
        if(buttonB6Used == true){
            buttonB6.setStyle("-fx-background-color: #808080");
            System.out.println("Button B6 has been used");
        }
        if(buttonC1Used == true){
            buttonC1.setStyle("-fx-background-color: #808080");
            System.out.println("Button C1 has been used");
        }
        if(buttonC2Used == true){
            buttonC2.setStyle("-fx-background-color: #808080");
            System.out.println("Button C2 has been used");
        }
        if(buttonC3Used == true){
            buttonC3.setStyle("-fx-background-color: #808080");
            System.out.println("Button C3 has been used");
        }
        if(buttonC4Used == true){
            buttonC4.setStyle("-fx-background-color: #808080");
            System.out.println("Button C4 has been used");
        }
        if(buttonC5Used == true){
            buttonC5.setStyle("-fx-background-color: #808080");
            System.out.println("Button C5 has been used");
        }
        if(buttonC6Used == true){
            buttonC6.setStyle("-fx-background-color: #808080");
            System.out.println("Button C6 has been used");
        }
        if(buttonD1Used == true){
            buttonD1.setStyle("-fx-background-color: #808080");
            System.out.println("Button D1 has been used");
        }
        if(buttonD2Used == true){
            buttonD2.setStyle("-fx-background-color: #808080");
            System.out.println("Button D2 has been used");
        }
        if(buttonD3Used == true){
            buttonD3.setStyle("-fx-background-color: #808080");
            System.out.println("Button D3 has been used");
        }
        if(buttonD4Used == true){
            buttonD4.setStyle("-fx-background-color: #808080");
            System.out.println("Button D4 has been used");
        }
        if(buttonD5Used == true){
            buttonD5.setStyle("-fx-background-color: #808080");
            System.out.println("Button D5 has been used");
        }
        if(buttonD6Used == true){
            buttonD6.setStyle("-fx-background-color: #808080");
            System.out.println("Button D6 has been used");
        }
        if(buttonE1Used == true){
            buttonE1.setStyle("-fx-background-color: #808080");
            System.out.println("Button E1 has been used");
        }
        if(buttonE2Used == true){
            buttonE2.setStyle("-fx-background-color: #808080");
            System.out.println("Button E2 has been used");
        }
        if(buttonE3Used == true){
            buttonE3.setStyle("-fx-background-color: #808080");
            System.out.println("Button E3 has been used");
        }
        if(buttonE4Used == true){
            buttonE4.setStyle("-fx-background-color: #808080");
            System.out.println("Button E4 has been used");
        }
        if(buttonE5Used == true){
            buttonE5.setStyle("-fx-background-color: #808080");
            System.out.println("Button E5 has been used");
        }
        if(buttonE6Used == true) {
            buttonE6.setStyle("-fx-background-color: #808080");
            System.out.println("Button E6 has been used");
        }
    }


        public void switchToQuestionScene (ActionEvent event, String value, int number, int CurrentScore) throws IOException {
            this.value = value;
            this.number = number;
            //Loading QuestionWindow.fxml
            FXMLLoader loader = new FXMLLoader(getClass().getResource("QuestionWindow.fxml"));
            Parent root = loader.load();
            //Getting the controller of QuestionWindow.fxml
            QuestionWindowController QuestionWindowsFXMLController = loader.getController();
            QuestionWindowsFXMLController.getVariablesFromMain(this.value, this.number, this.CurrentScore);
            QuestionWindowsFXMLController.getBooleansFromMain(this.buttonA1Used, this.buttonA2Used, this.buttonA3Used, this.buttonA4Used, this.buttonA5Used, this.buttonA6Used, this.buttonB1Used, this.buttonB2Used, this.buttonB3Used, this.buttonB4Used, this.buttonB5Used, this.buttonB6Used, this.buttonC1Used, this.buttonC2Used, this.buttonC3Used, this.buttonC4Used, this.buttonC5Used, this.buttonC6Used, this.buttonD1Used, this.buttonD2Used, this.buttonD3Used, this.buttonD4Used, this.buttonD5Used, this.buttonD6Used, this.buttonE1Used, this.buttonE2Used, this.buttonE3Used, this.buttonE4Used, this.buttonE5Used, this.buttonE6Used);
            System.out.println("The value of the button is " + this.value);
            System.out.println("The number of the button is " + this.number);

            QuestionWindowsFXMLController.Initialize();
            //Setting the scene
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Question Window");
            stage.show();






        }

//This method is used to get the variables from the main window to the question window
    public void getBooleansFromQuestionScene(boolean buttonA1Used, boolean buttonA2Used, boolean buttonA3Used, boolean buttonA4Used, boolean buttonA5Used, boolean buttonA6Used, boolean buttonB1Used, boolean buttonB2Used, boolean buttonB3Used, boolean buttonB4Used, boolean buttonB5Used, boolean buttonB6Used, boolean buttonC1Used, boolean buttonC2Used, boolean buttonC3Used, boolean buttonC4Used, boolean buttonC5Used, boolean buttonC6Used, boolean buttonD1Used, boolean buttonD2Used, boolean buttonD3Used, boolean buttonD4Used, boolean buttonD5Used, boolean buttonD6Used, boolean buttonE1Used, boolean buttonE2Used, boolean buttonE3Used, boolean buttonE4Used, boolean buttonE5Used, boolean buttonE6Used){
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

    public void buttonA1Clicked (ActionEvent Actionevent) throws IOException {
        if (buttonA1Used == false) {
            switchToQuestionScene(Actionevent, "$200", 0, CurrentScore);
            buttonA1Used = true;
            //add the button to the used buttons arraylist

        }}

        public void buttonA2Clicked (ActionEvent actionEvent) throws IOException {
        if (buttonA2Used == false) {
            switchToQuestionScene(actionEvent, "$200", 1, CurrentScore);
            buttonA2Used = true;
        }}

        public void buttonA3Clicked (ActionEvent actionEvent) throws IOException {
        if (buttonA3Used == false) {
            switchToQuestionScene(actionEvent, "$200", 2, CurrentScore);
            buttonA3Used = true;
        }}
        public void buttonA4Clicked (ActionEvent actionEvent) throws IOException {
        if (buttonA4Used == false) {
            switchToQuestionScene(actionEvent, "$200", 3, CurrentScore);
            buttonA4Used = true;
        }}

        public void buttonA5Clicked (ActionEvent actionEvent) throws IOException {
        if (buttonA5Used == false) {
            switchToQuestionScene(actionEvent, "$200", 4, CurrentScore);
            buttonA5Used = true;

        }}
        public void buttonA6Clicked (ActionEvent actionEvent) throws IOException {
        if (buttonA6Used == false) {
            switchToQuestionScene(actionEvent, "$200", 5, CurrentScore);
            buttonA6Used = true;

        }}
        public void buttonB1Clicked (ActionEvent actionEvent) throws IOException {
        if (buttonB1Used == false) {
            switchToQuestionScene(actionEvent, "$400", 6, CurrentScore);
            buttonB1Used = true;

        }}
        public void buttonB2Clicked (ActionEvent actionEvent) throws IOException {
        if (buttonB2Used == false) {
            switchToQuestionScene(actionEvent, "$400", 7, CurrentScore);
            buttonB2Used = true;

        }}
        public void buttonB3Clicked (ActionEvent actionEvent) throws IOException {
        if (buttonB3Used == false) {
            switchToQuestionScene(actionEvent, "$400", 8, CurrentScore);
            buttonB3Used = true;

        }}
        public void buttonB4Clicked (ActionEvent actionEvent) throws IOException {
        if (buttonB4Used == false) {
            switchToQuestionScene(actionEvent, "$400", 9, CurrentScore);
            buttonB4Used = true;

        }}
        public void buttonB5Clicked (ActionEvent actionEvent) throws IOException {
        if (buttonB5Used == false) {
            switchToQuestionScene(actionEvent, "$400", 10, CurrentScore);
            buttonB5Used = true;
        }}
        public void buttonB6Clicked (ActionEvent actionEvent) throws IOException {
        if (buttonB6Used == false) {
            switchToQuestionScene(actionEvent, "$400", 11, CurrentScore);
            buttonB6Used = true;

        }}
        public void buttonC1Clicked (ActionEvent actionEvent) throws IOException {
        if (buttonC1Used == false) {
            switchToQuestionScene(actionEvent, "$600", 12, CurrentScore);
            buttonC1Used = true;

        }}
        public void buttonC2Clicked (ActionEvent actionEvent) throws IOException {
        if (buttonC2Used == false) {
            switchToQuestionScene(actionEvent, "$600", 13, CurrentScore);
            buttonC2Used = true;

        }}
        public void buttonC3Clicked (ActionEvent actionEvent) throws IOException {
        if (buttonC3Used == false) {
            switchToQuestionScene(actionEvent, "$600", 14, CurrentScore);
            buttonC3Used = true;

        }}
        public void buttonC4Clicked (ActionEvent actionEvent) throws IOException {
        if (buttonC4Used == false) {
            switchToQuestionScene(actionEvent, "$600", 15, CurrentScore);
            buttonC4Used = true;

        }}
        public void buttonC5Clicked (ActionEvent actionEvent) throws IOException {
        if (buttonC5Used == false) {
            switchToQuestionScene(actionEvent, "$600", 16, CurrentScore);
            buttonC5Used = true;

        }}

        public void buttonC6Clicked (ActionEvent actionEvent) throws IOException {
        if (buttonC6Used == false) {
            switchToQuestionScene(actionEvent, "$600", 17, CurrentScore);
            buttonC6Used = true;

        }}
        public void buttonD1Clicked (ActionEvent actionEvent) throws IOException {
        if (buttonD1Used == false) {
            switchToQuestionScene(actionEvent, "$800", 18, CurrentScore);
            buttonD1Used = true;
        }}
        public void buttonD2Clicked (ActionEvent actionEvent) throws IOException {
        if (buttonD2Used == false) {
            switchToQuestionScene(actionEvent, "$800", 19, CurrentScore);
            buttonD2Used = true;

        }}
        public void buttonD3Clicked (ActionEvent actionEvent) throws IOException {
        if (buttonD3Used == false) {
            switchToQuestionScene(actionEvent, "$800", 20, CurrentScore);
            buttonD3Used = true;

        }}
        public void buttonD4Clicked (ActionEvent actionEvent) throws IOException {
        if (buttonD4Used == false) {
            switchToQuestionScene(actionEvent, "$800", 21, CurrentScore);
            buttonD4Used = true;
        }}
        public void buttonD5Clicked (ActionEvent actionEvent) throws IOException {
        if (buttonD5Used == false) {
            switchToQuestionScene(actionEvent, "$800", 22, CurrentScore);
            buttonD5Used = true;

        }}
        public void buttonD6Clicked (ActionEvent actionEvent) throws IOException {
        if (buttonD6Used == false) {
            switchToQuestionScene(actionEvent, "$800", 23, CurrentScore);
            buttonD6Used = true;

        }}
        public void buttonE1Clicked (ActionEvent actionEvent) throws IOException {
        if (buttonE1Used == false) {
            switchToQuestionScene(actionEvent, "$1000", 24, CurrentScore);
            buttonE1Used = true;

        }}
        public void buttonE2Clicked (ActionEvent actionEvent) throws IOException {
        if (buttonE2Used == false) {
            switchToQuestionScene(actionEvent, "$1000", 25, CurrentScore);
            buttonE2Used = true;

        }}
        public void buttonE3Clicked (ActionEvent actionEvent) throws IOException {
        if (buttonE3Used == false) {
            switchToQuestionScene(actionEvent, "$1000", 26, CurrentScore);
            buttonE3Used = true;

        }}
        public void buttonE4Clicked (ActionEvent actionEvent) throws IOException {
        if (buttonE4Used == false) {
            switchToQuestionScene(actionEvent, "$1000", 27, CurrentScore);
            buttonE4Used = true;

        }}
        public void buttonE5Clicked (ActionEvent actionEvent) throws IOException {
        if (buttonE5Used == false) {
            switchToQuestionScene(actionEvent, "$1000", 28, CurrentScore);
            buttonE5Used = true;

        }}
        public void buttonE6Clicked (ActionEvent actionEvent) throws IOException {
        if (buttonE6Used == false) {
            switchToQuestionScene(actionEvent, "$1000", 29, CurrentScore);
            buttonE6Used = true;

        }}
    }





