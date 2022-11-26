package com.example.jeopardyjavaproject;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.lang.Math;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;



public class QuestionClass {
    private String QuestionPartII;
    private String answer;
    private int value;
    private String Question;
    private ArrayList<Integer> usedNumbers = new ArrayList<Integer>();

    //create array list with ints 0-35
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    {
        for (int i = 0; i < 36; i++) {
            numbers.add(i);
        }
    }

    public void getQuestion(String value) {
        this.Question = Question;
        this.QuestionPartII = QuestionPartII;
        boolean isCorrect = false;
        //pick random number from arraylist numbers and store it in number, then remove it from arraylist
        Random rand = new Random();
        int number = rand.nextInt(numbers.size());
        numbers.remove(number);
        //add number to usedNumbers arraylist
        usedNumbers.add(number);


           if(number == 0) {
               this.Question = String.format("A wizard who cannot do magic is known as a: ");
               this.answer = String.format("Harry Potter for %s" +
                               " \nWhat is: ",
                       value);
               this.answer = "squib";
                    }
            else if(number ==  1){
                this.Question = String.format("Who directed Rogue One: A Star Wars Story? ");
                this.QuestionPartII = String.format("Star Wars for %s" +
                        " \nWhat is: ",
                        value);
                this.answer = "gareth edwards";
                    }
            else if(number ==  2){
                this.Question = String.format("In \"The Lion King,\" what side of Scar's face is his scar on? Left or right?");
                this.QuestionPartII = String.format("Disney for %s" +
                        " \nWhat is: ",
                        value);
               this.answer.equals("left");
                    }
            else if(number ==  3){
                this.Question = String.format("What is Patrick's last name?");
                this.QuestionPartII = String.format("SpongeBob for %s" +
                        " \nWhat is: ",
                        value);
                this.answer = "star";
                    }
            else if(number ==  4){
                this.Question = String.format("Who is the most evil of the Valar?");
                this.QuestionPartII = String.format("Lord of the Rings for %s" +
                        " \nWhat is: ",
                        value);
                this.answer = "melkor";
                    }
            else if(number ==  5){
                this.Question = String.format("How many eyes does the raven in Bran's dream have?");
                this.QuestionPartII = String.format("Game of Thrones for %s" +
                        " \nWhat is: ",
                        value);
                this.answer = "three";
                    }
            else if(number ==  6){
                this.Question = String.format("Who plays Ron Weasly in the movies? <br> (Full name please)");
                this.QuestionPartII = String.format("Harry Potter for %s \nWhat is: ",
                        value);
                this.answer = "rupert grint";
                    }
            else if(number ==  7){
                this.Question = String.format("Who provided the voice of Yoda? ");
                this.QuestionPartII = String.format("Star Wars for %s \nWhat is: ",
                        value);
                this.answer = "frank ozr";
                    }
            else if(number ==  8){
                this.Question = String.format("In \"Aladdin,\" what does Aladdin, and a reluctant Abu, give to the poor children to eat?");
                this.QuestionPartII = String.format("Disney for %s \nWhat is: ",
                        value);
                this.answer = "bread";
                    }
            else if(number ==  9){
                this.Question = String.format("What does SpongeBob name his Jellyfishing net?");
                this.QuestionPartII = String.format("SpongeBob for %s \nWhat is: ",
                        value);
                this.answer = "old reliable";
                    }
            else if(number ==  10){
                this.Question = String.format("What is the name of the creator of the Valor and Middle-Earth ?");
                this.QuestionPartII = String.format("Lord of the Rings for %s \nWhat is: ",
                        value);
                this.answer = "illuvator";
                    }
            else if(number ==  11){
                this.Question = String.format("What do the wildlings call those living south of the Wall?");
                this.QuestionPartII = String.format("Game of Thrones for %s \nWhat is: ",
                        value);
                this.answer = "kneelers";
                    }
            else if(number ==  12){
                this.Question = String.format("What does Harry eat to manage to breathe underwater during the second taskof the Triwizard Tournament?");
                this.QuestionPartII = String.format("Harry Potter for %s \nWhat is: ",
                        value);
                this.answer = "gillyweed";
                    }
            else if(number ==  13){
                this.Question = String.format("Who commissioned the Grand Army of the Republic?");
                this.QuestionPartII = String.format("Star Wars for %s \nWhat is: ",
                        value);
                this.answer = "sifo-dyas";
                    }

            else if(number ==  14){
                this.Question = String.format("In \"Hercules,\" Hades promised not to harm Megara if Hercules gave up his strength for how long?");
                this.QuestionPartII = String.format("Disney for %s \nWhat is: ",
                        value);
                this.answer = "24 hours";
                    }
            else if(number ==  15){
                this.Question = String.format("What is Planktons first name");
                this.QuestionPartII = String.format("SpongeBob for %s \nWhat is: ",
                        value);
               this.answer = "sheldon";
                    }
            else if(number ==  16){
                this.Question = String.format("When Bilbo and the Dwarves are captured by the Goblins in the misty mountains, who saves them from certain death?");
                this.QuestionPartII = String.format("Lord of the Rings for %s \nWhat is: ",
                        value);
               this.answer = "gandalf";
                    }
            else if(number ==  17){
                this.Question = String.format("What is the House Lannister's slogan?");
                this.QuestionPartII = String.format("Game of Thrones for %s \nWhat is: ",
                        value);
               this.answer = "a lannister always pays his debt";
                    }
            else if(number ==  18){
                this.Question = String.format("What does the spell \"Obliviate\" do? <br>a. Destroy objects <br>b. Make objects invisible <br>c. Remove parts of someone's memory ");
                this.QuestionPartII = String.format("Harry Potter for %s \nWhat is: ",
                        value);
               this.answer = "c";
                    }
            else if(number ==  19){
                this.Question = String.format("How many known Jedi possess a purple-bladed lightsaber?");
                this.QuestionPartII = String.format("Star Wars for %s \nWhat is: ",
                        value);
                this.answer = "one";
                    }
            else if(number ==  20){
                this.Question = String.format(" In \"The Little Mermaid,\" what alias does Ursula use when she becomes human?");
                this.QuestionPartII = String.format("Disney for %s \nWhat is: ",
                        value);
                this.answer = "venessa";
                    }
            else if(number ==  21){
                this.Question = String.format("What was the name of the roller coaster in which Spongebob and Patrick suffered spine loss?<br>a. Pit o' Fire<br>b. Fist o' Pain");
                this.QuestionPartII = String.format("SpongeBob for %s \nWhat is: ",
                        value);
               this.answer = "b";
                    }
            else if(number ==  22){
                this.Question = String.format("At which river were the Nazgul seen crossing on midsummers eve to gather Frodo?");
                this.QuestionPartII = String.format("Lord of the Rings for %s \nWhat is: ",
                        value);
               this.answer = "isen";
                    }
            else if(number ==  23){
                this.Question = String.format("What is the name of Theon Greyjoy's ship?");
                this.QuestionPartII = String.format("Game of Thrones for %s \nWhat is: ",
                        value);
               this.answer = "sea bitch";
                    }
            else if(number == 24){
                this.Question = String.format("What is the killing curse?");
                this.QuestionPartII = String.format("Harry Potter for %s \nWhat is: ",
                        value);
               this.answer = "avada kedavra";
                    }
            else if(number == 25){
                this.Question = String.format("Qui-Gon Jinn dies during a duel on which planet?");
                this.QuestionPartII = String.format("Star Wars for %s \nWhat is: ",
                        value);
               this.answer = "naboo";
                    }
            else if(number == 26){
                this.Question = String.format("Who is the first and original disney princess?");
                this.QuestionPartII = String.format("Disney for %s \nWhat is: ",
                        value);
               this.answer = "snow white";
                    }
            else if(number == 27){
                this.Question = String.format("What was the Krusty Krab called when Pearl redecorated it?");
                this.QuestionPartII = String.format("SpongeBob for %s \nWhat is: ",
                        value);
               this.answer = "kuddly krab";
                    }
            else if(number == 28){
                this.Question = String.format("What word is missing from this statement from Boromir - \"I ask only for the strength to defend my _______ \" ?");
                this.QuestionPartII = String.format("Lord of the Rings for %s \nWhat is: ",
                        value);
               this.answer = "people";
                    }
            else if (number == 29){
                this.Question = String.format("What is the name of Rickon's direwolf?");
                this.QuestionPartII = String.format("Game of Thrones for %s \nWhat is: ",
                        value);
                this.answer = "shaggydog";
                    }
            else if(number == 30){
                this.Question = String.format("Which Hogwarts founder did the Sorting Hat originally belong to? <br>(Please Spell correctly)");
                this.QuestionPartII = String.format("Harry Potter for %s  \nWhat is: ",
                        value);
               this.answer = "godric gryffindor";
                    }
            else if(number ==  31){
                this.Question = String.format("The Millenium Falcon was able to complete the Kessel Run in fewer than ___ parsecs.");
                this.QuestionPartII = String.format("Star Wars for %s  \nWhat is: ",
                        value);
                this.answer = "twelve";
                    }
            else if(number == 32){
                this.Question = String.format("What does the matchmaker criticize Mulan for?<br>a. Too tall<br>b. Too skinny<br>c. Bad Posture");
                this.QuestionPartII = String.format("Disney for %s \n What is: ",
                        value);
               this.answer = "b";
                    }
            else if(number == 33){
                this.Question = String.format("In Band Geeks, what special event does Squidwards band play for?");
                this.QuestionPartII = String.format("SpongeBob for %s  \nWhat is: ",
                        value);
               this.answer = "bubble bowl";
                    }
            else if(number == 34){
                    this.Question=String.format("How many guests were present at Bilbo's party?");
                    this.QuestionPartII = String.format("Lord of the Rings for %s  \nWhat is: ",
                            value);
                    this.answer="144";
                    }
            else if(number == 35){
                this.Question = String.format("What is the name of Arya Stark's sword?");
                this.QuestionPartII = String.format("Game of Thrones for %s \nWhat is: ",
                        value);
               this.answer = "needle";
        }
    }

}

