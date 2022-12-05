package com.example.jeopardyjavaproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class MainWindowController{

    public MainWindowController() {
        ScoreLabel = new Label(String.valueOf(CurrentScore));
        System.out.println("Tried to set score label with value " + CurrentScore);
    }
    //have label ScoreLabel be set to the current score when the window is opened
    @FXML
    private Label ScoreLabel;


    public void CalculateCurrentScore(){
        CurrentScore = CurrentScore + Score;
        System.out.println("Current Score calculated at the CalculateCurrentScore Function is: " + CurrentScore);
        ScoreLabel.setText(String.valueOf(CurrentScore));
        System.out.println("Tried to change Label with CalculateCurrentScore");


    }

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

    int number = 0;
    String value = "";

    public void getVariablesFromQuestion(String value, int number, int Score, int CurrentScore) throws IOException{
        this.value = value;
        this.number = number;
        this.CurrentScore = CurrentScore;
        this.Score = Score;
        System.out.println("Current Score: " + CurrentScore);
    }
    public void ButtonGreyedOut(){
        //Check if the button has been used with variable buttonA1Used, if it has been used, grey out the button
        if(buttonA1Used){
            buttonA1.setStyle("-fx-background-color: #808080");
        }
        if(buttonA2Used){
            buttonA2.setStyle("-fx-background-color: #808080");
        }
        if(buttonA3Used){
            buttonA3.setStyle("-fx-background-color: #808080");
        }
        if(buttonA4Used){
            buttonA4.setStyle("-fx-background-color: #808080");
        }
        if(buttonA5Used){
            buttonA5.setStyle("-fx-background-color: #808080");
        }
        if(buttonA6Used){
            buttonA6.setStyle("-fx-background-color: #808080");
        }
        if(buttonB1Used){
            buttonB1.setStyle("-fx-background-color: #808080");
        }
        if(buttonB2Used){
            buttonB2.setStyle("-fx-background-color: #808080");
        }
        if(buttonB3Used){
            buttonB3.setStyle("-fx-background-color: #808080");
        }
        if(buttonB4Used){
            buttonB4.setStyle("-fx-background-color: #808080");
        }
        if(buttonB5Used){
            buttonB5.setStyle("-fx-background-color: #808080");
        }
        if(buttonB6Used){
            buttonB6.setStyle("-fx-background-color: #808080");
        }
        if(buttonC1Used){
            buttonC1.setStyle("-fx-background-color: #808080");
        }
        if(buttonC2Used){
            buttonC2.setStyle("-fx-background-color: #808080");
        }
        if(buttonC3Used){
            buttonC3.setStyle("-fx-background-color: #808080");
        }
        if(buttonC4Used){
            buttonC4.setStyle("-fx-background-color: #808080");
        }
        if(buttonC5Used){
            buttonC5.setStyle("-fx-background-color: #808080");
        }
        if(buttonC6Used){
            buttonC6.setStyle("-fx-background-color: #808080");
        }
        if(buttonD1Used){
            buttonD1.setStyle("-fx-background-color: #808080");
        }
        if(buttonD2Used){
            buttonD2.setStyle("-fx-background-color: #808080");
        }
        if(buttonD3Used){
            buttonD3.setStyle("-fx-background-color: #808080");
        }
        if(buttonD4Used){
            buttonD4.setStyle("-fx-background-color: #808080");
        }
        if(buttonD5Used){
            buttonD5.setStyle("-fx-background-color: #808080");
        }
        if(buttonD6Used){
            buttonD6.setStyle("-fx-background-color: #808080");
        }
        if(buttonE1Used){
            buttonE1.setStyle("-fx-background-color: #808080");
        }
        if(buttonE2Used){
            buttonE2.setStyle("-fx-background-color: #808080");
        }
        if(buttonE3Used){
            buttonE3.setStyle("-fx-background-color: #808080");
        }
        if(buttonE4Used){
            buttonE4.setStyle("-fx-background-color: #808080");
        }
        if(buttonE5Used){
            buttonE5.setStyle("-fx-background-color: #808080");
        }
        if(buttonE6Used) {
            buttonE6.setStyle("-fx-background-color: #808080");
        }
    }


        public void switchToQuestionScene (ActionEvent event, String value, int number) throws IOException {
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
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root, 600, 360);
            stage.setScene(scene);
            stage.setTitle("Question Window");
            stage.show();
        }

//This method is used to get the variables from the main window to the question window
    public void getBooleansFromQuestionScene(boolean buttonA1Used, boolean buttonA2Used, boolean buttonA3Used, boolean buttonA4Used, boolean buttonA5Used, boolean buttonA6Used, boolean buttonB1Used, boolean buttonB2Used, boolean buttonB3Used, boolean buttonB4Used, boolean buttonB5Used, boolean buttonB6Used, boolean buttonC1Used, boolean buttonC2Used, boolean buttonC3Used, boolean buttonC4Used, boolean buttonC5Used, boolean buttonC6Used, boolean buttonD1Used, boolean buttonD2Used, boolean buttonD3Used, boolean buttonD4Used, boolean buttonD5Used, boolean buttonD6Used, boolean buttonE1Used, boolean buttonE2Used, boolean buttonE3Used, boolean buttonE4Used, boolean buttonE5Used, boolean buttonE6Used){
        System.out.println("Boolean Variables transferred to Main Window");
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
        if (!buttonA1Used) {
            buttonA1Used = true;
            switchToQuestionScene(Actionevent, "$200", 0);
        }}
        public void buttonA2Clicked (ActionEvent actionEvent) throws IOException {
        if (!buttonA2Used) {
            buttonA2Used = true;
            switchToQuestionScene(actionEvent, "$200", 1);
        }}
        public void buttonA3Clicked (ActionEvent actionEvent) throws IOException {
        if (!buttonA3Used) {
            buttonA3Used = true;
            switchToQuestionScene(actionEvent, "$200", 2);
        }}
        public void buttonA4Clicked (ActionEvent actionEvent) throws IOException {
        if (!buttonA4Used) {
            buttonA4Used = true;
            switchToQuestionScene(actionEvent, "$200", 3);
        }}

        public void buttonA5Clicked (ActionEvent actionEvent) throws IOException {
        if (!buttonA5Used) {
            buttonA5Used = true;
            switchToQuestionScene(actionEvent, "$200", 4);
        }}
        public void buttonA6Clicked (ActionEvent actionEvent) throws IOException {
        if (!buttonA6Used) {
            buttonA6Used = true;
            switchToQuestionScene(actionEvent, "$200", 5);
        }}
        public void buttonB1Clicked (ActionEvent actionEvent) throws IOException {
        if (!buttonB1Used) {
            buttonB1Used = true;
            switchToQuestionScene(actionEvent, "$400", 6);
        }}
        public void buttonB2Clicked (ActionEvent actionEvent) throws IOException {
        if (!buttonB2Used) {
            buttonB2Used = true;
            switchToQuestionScene(actionEvent, "$400", 7);
        }}
        public void buttonB3Clicked (ActionEvent actionEvent) throws IOException {
        if (!buttonB3Used) {
            buttonB3Used = true;
            switchToQuestionScene(actionEvent, "$400", 8);
        }}
        public void buttonB4Clicked (ActionEvent actionEvent) throws IOException {
        if (!buttonB4Used) {
            buttonB4Used = true;
            switchToQuestionScene(actionEvent, "$400", 9);
        }}
        public void buttonB5Clicked (ActionEvent actionEvent) throws IOException {
        if (!buttonB5Used) {
            buttonB5Used = true;
            switchToQuestionScene(actionEvent, "$400", 10);
        }}
        public void buttonB6Clicked (ActionEvent actionEvent) throws IOException {
        if (!buttonB6Used) {
            buttonB6Used = true;
            switchToQuestionScene(actionEvent, "$400", 11);
        }}
        public void buttonC1Clicked (ActionEvent actionEvent) throws IOException {
        if (!buttonC1Used) {
            buttonC1Used = true;
            switchToQuestionScene(actionEvent, "$600", 12);
        }}
        public void buttonC2Clicked (ActionEvent actionEvent) throws IOException {
        if (!buttonC2Used) {
            buttonC2Used = true;
            switchToQuestionScene(actionEvent, "$600", 13);
        }}
        public void buttonC3Clicked (ActionEvent actionEvent) throws IOException {
        if (!buttonC3Used) {
            buttonC3Used = true;
            switchToQuestionScene(actionEvent, "$600", 14);
        }}
        public void buttonC4Clicked (ActionEvent actionEvent) throws IOException {
        if (!buttonC4Used) {
            buttonC4Used = true;
            switchToQuestionScene(actionEvent, "$600", 15);
        }}
        public void buttonC5Clicked (ActionEvent actionEvent) throws IOException {
        if (!buttonC5Used) {
            buttonC5Used = true;
            switchToQuestionScene(actionEvent, "$600", 16);
        }}
        public void buttonC6Clicked (ActionEvent actionEvent) throws IOException {
        if (!buttonC6Used) {
            buttonC6Used = true;
            switchToQuestionScene(actionEvent, "$600", 17);
        }}
        public void buttonD1Clicked (ActionEvent actionEvent) throws IOException {
        if (!buttonD1Used) {
            buttonD1Used = true;
            switchToQuestionScene(actionEvent, "$800", 18);
        }}
        public void buttonD2Clicked (ActionEvent actionEvent) throws IOException {
            if (!buttonD2Used) {
                buttonD2Used = true;
                switchToQuestionScene(actionEvent, "$800", 19);
                }}
            public void buttonD3Clicked (ActionEvent actionEvent) throws IOException {
                if (!buttonD3Used) {
                    buttonD3Used = true;
                    switchToQuestionScene(actionEvent, "$800", 20);
                }
            }
            public void buttonD4Clicked (ActionEvent actionEvent) throws IOException {
                if (!buttonD4Used) {
                    buttonD4Used = true;
                    switchToQuestionScene(actionEvent, "$800", 21);
                }
            }
            public void buttonD5Clicked (ActionEvent actionEvent) throws IOException {
                if (!buttonD5Used) {
                    buttonD5Used = true;
                    switchToQuestionScene(actionEvent, "$800", 22);

                }
            }
            public void buttonD6Clicked (ActionEvent actionEvent) throws IOException {
                if (!buttonD6Used) {
                    buttonD6Used = true;
                    switchToQuestionScene(actionEvent, "$800", 23);

                }
            }
            public void buttonE1Clicked (ActionEvent actionEvent) throws IOException {
                if (!buttonE1Used) {
                    buttonE1Used = true;
                    switchToQuestionScene(actionEvent, "$1000", 24);

                }
            }
            public void buttonE2Clicked (ActionEvent actionEvent) throws IOException {
                if (!buttonE2Used) {
                    buttonE2Used = true;
                    switchToQuestionScene(actionEvent, "$1000", 25);

                }
            }
            public void buttonE3Clicked (ActionEvent actionEvent) throws IOException {
                if (!buttonE3Used) {
                    buttonE3Used = true;
                    switchToQuestionScene(actionEvent, "$1000", 26);

                }
            }
            public void buttonE4Clicked (ActionEvent actionEvent) throws IOException {
                if (!buttonE4Used) {
                    buttonE4Used = true;
                    switchToQuestionScene(actionEvent, "$1000", 27);
                }
            }
            public void buttonE5Clicked (ActionEvent actionEvent) throws IOException {
                if (!buttonE5Used) {
                    buttonE5Used = true;
                    switchToQuestionScene(actionEvent, "$1000", 28);

                }
            }
            public void buttonE6Clicked (ActionEvent actionEvent) throws IOException {
                if (!buttonE6Used) {
                    buttonE6Used = true;
                    switchToQuestionScene(actionEvent, "$1000", 29);
                }
            }
        }





