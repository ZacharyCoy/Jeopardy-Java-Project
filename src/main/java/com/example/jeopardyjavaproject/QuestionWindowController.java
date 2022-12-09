package com.example.jeopardyjavaproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;



public class QuestionWindowController {
    @FXML
    public Label QuestionAsked;
    @FXML
    public Label QuestionAskedPartII;
    @FXML
    public TextField UsersAnswer;
    @FXML
    public Button SubmitAnswer;

    int currentScore;

//Initialize the variables that will be passed to the QuestionClass through the getQuestion method
    String questionValue = "";
    int questionNumber = 0;
    int score;
//Initialize the QuestionClass
    QuestionClass Question = new QuestionClass();

//Initialize the Booleans that keep track of whether the user has pressed the button, if they have, then the button will be disabled and turned grey
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
    /**
     * Initializes the Question Window.
     *
     * This method initializes the `Question` instance variable if it hasn't already
     * been initialized, and sets the text for the labels to the question.
     */
    public void Initialize(){
        //if an initialization of the QuestionClass is not already done. initialize it with name Question
        if(Question == null){
            Question = new QuestionClass();

        }
        //Set the labels to the questions
        Question.getQuestion(questionValue, questionNumber);
        QuestionAsked.setText(Question.getQuestionPartI());
        QuestionAskedPartII.setText(Question.getQuestionPartII());

    }



    /**
     * Checks the answer provided by the user.
     * <p>
     * This method retrieves the answer provided by the user and compares it to the
     * correct answer. If the user's answer is correct, it updates the `Score` instance
     * variable. Otherwise, it sets the `Score` variable to 0.
     *
     * @return boolean true if the user's answer is correct, false otherwise
     */
    public boolean CheckAnswer(){
        String answer = UsersAnswer.getText();
        System.out.println("User Answer: " + answer+ " Correct Answer: " + Question.getAnswer());
        //Cleaning the user input to make it easier to compare
        if(answer.toLowerCase().equals(Question.getAnswer())){
            System.out.println("Correct");
            score = Integer.parseInt((questionValue.substring(1)));
            System.out.println("Score: " + score);
            return true;
        }
        else{
            System.out.println("Incorrect");
            score = 0;
        }
        return false;
    }
    /**
     * Retrieves the boolean variables from the Main Window.
     *
     * This method is called by the Main Window controller and updates the values
     * of the Question Window controller's instance variables for the buttons.
     *
     * @param buttonA1Used boolean indicating whether button A1 has been used
     * @param buttonA2Used boolean indicating whether button A2 has been used
     * @param buttonA3Used boolean indicating whether button A3 has been used
     * @param buttonA4Used boolean indicating whether button A4 has been used
     * @param buttonA5Used boolean indicating whether button A5 has been used
     * @param buttonA6Used boolean indicating whether button A6 has been used
     * @param buttonB1Used boolean indicating whether button B1 has been used
     * @param buttonB2Used boolean indicating whether button B2 has been used
     * @param buttonB3Used boolean indicating whether button B3 has been used
     * @param buttonB4Used boolean indicating whether button B4 has been used
     * @param buttonB5Used boolean indicating whether button B5 has been used
     * @param buttonB6Used boolean indicating whether button B6 has been used
     * @param buttonC1Used boolean indicating whether button C1 has been used
     * @param buttonC2Used boolean indicating whether button C2 has been used
     * @param buttonC3Used boolean indicating whether button C3 has been used
     * @param buttonC4Used boolean indicating whether button C4 has been used
     * @param buttonC5Used boolean indicating whether button C5 has been used
     * @param buttonC6Used boolean indicating whether button C6 has been used
     * @param buttonD1Used boolean indicating whether button D1 has been used
     * @param buttonD2Used boolean indicating whether button D2 has been used
     * @param buttonD3Used boolean indicating whether button D3 has been used
     * @param buttonD4Used boolean indicating whether button D4 has been used
     * @param buttonD5Used boolean indicating whether button D5 has been used
     * @param buttonD6Used boolean indicating whether button D6 has been used
     * @param buttonE1Used boolean indicating whether button E1 has been used
     * @param buttonE2Used boolean indicating whether button E2 has been used
     * @param buttonE3Used boolean indicating whether button E3 has been used
     * @param buttonE4Used boolean indicating whether button E4 has been used
     * @param buttonE5Used boolean indicating whether button E5 has been used
     * @param buttonE6Used boolean indicating whether button E6 has been used
     */
    public void getBooleansFromMain(boolean buttonA1Used, boolean buttonA2Used, boolean buttonA3Used, boolean buttonA4Used, boolean buttonA5Used, boolean buttonA6Used, boolean buttonB1Used, boolean buttonB2Used, boolean buttonB3Used, boolean buttonB4Used, boolean buttonB5Used, boolean buttonB6Used, boolean buttonC1Used, boolean buttonC2Used, boolean buttonC3Used, boolean buttonC4Used, boolean buttonC5Used, boolean buttonC6Used, boolean buttonD1Used, boolean buttonD2Used, boolean buttonD3Used, boolean buttonD4Used, boolean buttonD5Used, boolean buttonD6Used, boolean buttonE1Used, boolean buttonE2Used, boolean buttonE3Used, boolean buttonE4Used, boolean buttonE5Used, boolean buttonE6Used){
System.out.println("Boolean Variables Transferred to QuestionWindowController");
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

    /**
     * Retrieves the variables from the Main Window.
     *
     * This method is called by the Main Window controller and updates the values
     * of the Question Window controller's instance variables.
     *
     * @param value the question value
     * @param number the question number
     * @param currentScore the current score
     */
    public void getVariablesFromMain(String value, int number, int currentScore) {
        this.questionValue = value;
        this.questionNumber = number;
        this.currentScore = currentScore;
    }



    /**

     This method is called when the user submits an answer to a question.
     It checks the answer and displays a message indicating whether the answer is correct or not.
     If the answer is incorrect, it also displays the correct answer.
     After that, it switches back to the Main Window and updates the game state and score.
     @param event A button click that triggered this method.
     */
    public void SubmitUserAnswer(ActionEvent event) {
        try{
            boolean isCorrect = CheckAnswer();
            String message;
            if (isCorrect) {
                message = "Correct! +" + questionValue;
            } else {
                message = "Incorrect! The correct answer was: " + Question.getAnswer();
            }
            Alert alert = new Alert(Alert.AlertType.INFORMATION, message);
            alert.showAndWait();
            // Switch back to the Main Window
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MainWindow.fxml"));
            Parent root = loader.load();
            //Getting the controller of QuestionWindow.fxml
            MainWindowController MainWindowFXMLController = loader.getController();
            //Have the Main Window Controller get the variables from the Question Window Controller
            MainWindowFXMLController.getVariablesFromQuestion(questionValue, questionNumber, score, currentScore);
            MainWindowFXMLController.getBooleansFromQuestionScene(buttonA1Used, buttonA2Used, buttonA3Used, buttonA4Used, buttonA5Used, buttonA6Used, buttonB1Used, buttonB2Used, buttonB3Used, buttonB4Used, buttonB5Used, buttonB6Used, buttonC1Used, buttonC2Used, buttonC3Used, buttonC4Used, buttonC5Used, buttonC6Used, buttonD1Used, buttonD2Used, buttonD3Used, buttonD4Used, buttonD5Used, buttonD6Used, buttonE1Used, buttonE2Used, buttonE3Used, buttonE4Used, buttonE5Used, buttonE6Used);
            //Have the Main Window Controller calculate the score and update the label
            MainWindowFXMLController.CalculateCurrentScore();
            //Used the boolean variables to disable and grey out the buttons
            MainWindowFXMLController.ButtonGreyedOut();
            //Setting the scene
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root,600, 360);
            stage.setScene(scene);
            stage.setTitle("Jeopardy");
            stage.show();
        } catch (IOException e){
            e.printStackTrace();
        }
    }


}
