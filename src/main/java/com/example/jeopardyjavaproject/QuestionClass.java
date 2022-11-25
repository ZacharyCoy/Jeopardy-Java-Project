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
    private String question;
    private String answer;
    private int value;
    private String Question;
    private ArrayList<Integer> usedNumbers = new ArrayList<Integer>();
    private int money;
    public int number;

    //create array list with ints 0-35
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    {
        for (int i = 0; i < 36; i++) {
            numbers.add(i);
        }
    }

    public void Question() {
        this.question = question;
        this.answer = answer;
        this.value = value;
        this.money = money;
    }

    public void getQuestion(String RandomQuestion) {
        boolean isCorrect = false;
        //pick random number from arraylist numbers and store it in number, then remove it from arraylist
        Random rand = new Random();
        int number = rand.nextInt(numbers.size());
        numbers.remove(number);
        //add number to usedNumbers arraylist
        usedNumbers.add(number);


           if(number == 0){
            this.Question =String.format("A wizard who cannot do magic is known as a: ");
                this.answer =String.format("Harry Potter for $100 \nWhat is: ");
                this.answer =this.answer.toLowerCase();
                if(this.answer.equals("squib"))

           {
                   isCorrect = true;
                } else

                {
                   isCorrect = false;
               }
            }
            else if(number ==  1){
                this.Question = String.format("Who directed Rogue One: A Star Wars Story? ");
                this.answer = String.format("Star Wars for $100 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("gareth edwards")) {
                    isCorrect = true;
                } else {
                    isCorrect = false;
                }
                    }
            else if(number ==  2){
                this.Question = String.format("In \"The Lion King,\" what side of Scar's face is his scar on? Left or right?");
                this.answer = String.format("Disney for $100 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("left")) {
                    isCorrect = true;
                } else {
                    isCorrect = false;
                }
                    }
            else if(number ==  3){
                this.Question = String.format("What is Patrick's last name?");
                this.answer = String.format("SpongeBob for $100 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("star")) {
                    isCorrect = true;
                } else {
                    isCorrect = false;
                }
                    }
            else if(number ==  4){
                this.Question = String.format("Who is the most evil of the Valar?");
                this.answer = String.format("Lord of the Rings for $100 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("melkor")) {
                    isCorrect = true;
                } else {
                    isCorrect = false;
                }
                    }
            else if(number ==  5){
                this.Question = String.format("How many eyes does the raven in Bran's dream have?");
                this.answer = String.format("Game of Thrones for $100 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (!this.answer.equals("three") && !this.answer.equals("3")) {
                    isCorrect = false;
                } else {
                    isCorrect = true;
                }
                    }
            else if(number ==  6){
                this.Question = String.format("Who plays Ron Weasly in the movies? <br> (Full name please)");
                this.answer = String.format("Harry Potter for $200 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("rupert grint")) {
                    isCorrect = true;
                } else {
                    isCorrect = false;
                }
                    }
            else if(number ==  7){
                this.Question = String.format("Who provided the voice of Yoda? ");
                this.answer = String.format("Star Wars for $200 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("frank ozr")) {
                    isCorrect = true;
                } else {
                    isCorrect = false;
                }
                    }
            else if(number ==  8){
                this.Question = String.format("In \"Aladdin,\" what does Aladdin, and a reluctant Abu, give to the poor children to eat?");
                this.answer = String.format("Disney for $200 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (!this.answer.equals("bread") && !this.answer.equals("loaf of bread")) {
                    isCorrect = false;
                } else {
                    isCorrect = true;
                }
                    }
            else if(number ==  9){
                this.Question = String.format("What does SpongeBob name his Jellyfishing net?");
                this.answer = String.format("SpongeBob for $200 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("old reliable")) {
                    isCorrect = true;
                } else {
                    isCorrect = false;
                }
                    }
            else if(number ==  10){
                this.Question = String.format("What is the name of the creator of the Valor and Middle-Earth ?");
                this.answer = String.format("Lord of the Rings for $200 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("illuvator")) {
                    isCorrect = true;
                } else {
                    isCorrect = false;
                }
                    }
            else if(number ==  11){
                this.Question = String.format("What do the wildlings call those living south of the Wall?");
                this.answer = String.format("Game of Thrones for $200 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (!this.answer.equals("kneelers") && !this.answer.equals("kneeler")) {
                    isCorrect = false;
                } else {
                    isCorrect = true;
                }
                    }
            else if(number ==  12){
                this.Question = String.format("What does Harry eat to manage to breathe underwater during the second taskof the Triwizard Tournament?");
                this.answer = String.format("Harry Potter for $300 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (!this.answer.equals("gillyweed") && !this.answer.equals("gilly weed")) {
                    isCorrect = false;
                } else {
                    isCorrect = true;
                }
                    }
            else if(number ==  13){
                this.Question = String.format("Who commissioned the Grand Army of the Republic?");
                this.answer = String.format("Star Wars for $300 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (!this.answer.equals("jedi master sifo-dyas") && !this.answer.equals("sifo dyas") && !this.answer.equals("sifo-dyas")) {
                    isCorrect = false;
                } else {
                    isCorrect = true;
                }
                    }
            else if(number ==  14){
                this.Question = String.format("In \"Hercules,\" Hades promised not to harm Megara if Hercules gave up his strength for how long?");
                this.answer = String.format("Disney for $300 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (!this.answer.equals("24 hours") && !this.answer.equals("24") && !this.answer.equals("twenty four")) {
                    isCorrect = false;
                } else {
                    isCorrect = true;
                }
                    }
            else if(number ==  15){
                this.Question = String.format("What is Planktons first name");
                this.answer = String.format("SpongeBob for $300 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("sheldon")) {
                    isCorrect = true;
                } else {
                    isCorrect = false;
                }
                    }
            else if(number ==  16){
                this.Question = String.format("When Bilbo and the Dwarves are captured by the Goblins in the misty mountains, who saves them from certain death?");
                this.answer = String.format("Lord of the Rings for $300 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("gandalf")) {
                    isCorrect = true;
                } else {
                    isCorrect = false;
                }
                    }
            else if(number ==  17){
                this.Question = String.format("What is the House Lannister's slogan?");
                this.answer = String.format("Game of Thrones for $300 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("a lannister always pays his debt")) {
                    isCorrect = true;
                } else {
                    isCorrect = false;
                }
                    }
            else if(number ==  18){
                this.Question = String.format("What does the spell \"Obliviate\" do? <br>a. Destroy objects <br>b. Make objects invisible <br>c. Remove parts of someone's memory ");
                this.answer = String.format("Harry Potter for $400 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("c")) {
                    isCorrect = true;
                } else {
                    isCorrect = false;
                }
                    }
            else if(number ==  19){
                this.Question = String.format("How many known Jedi possess a purple-bladed lightsaber?");
                this.answer = String.format("Star Wars for $400 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (!this.answer.equals("one") && !this.answer.equals("1")) {
                    isCorrect = false;
                } else {
                    isCorrect = true;
                }
                    }
            else if(number ==  20){
                this.Question = String.format(" In \"The Little Mermaid,\" what alias does Ursula use when she becomes human?");
                this.answer = String.format("Disney for $400 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (!this.answer.equals("venessa") && !this.answer.equals("vennessa")) {
                    isCorrect = false;
                } else {
                    isCorrect = true;
                }
                    }
            else if(number ==  21){
                this.Question = String.format("What was the name of the roller coaster in which Spongebob and Patrick suffered spine loss?<br>a. Pit o' Fire<br>b. Fist o' Pain");
                this.answer = String.format("SpongeBob for $400 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("b")) {
                    isCorrect = true;
                } else {
                    isCorrect = false;
                }
                    }
            else if(number ==  22){
                this.Question = String.format("At which river were the Nazgul seen crossing on midsummers eve to gather Frodo?");
                this.answer = String.format("Lord of the Rings for $400 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("isen")) {
                    isCorrect = true;
                } else {
                    isCorrect = false;
                }
                    }
            else if(number ==  23){
                this.Question = String.format("What is the name of Theon Greyjoy's ship?");
                this.answer = String.format("Game of Thrones for $400 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("sea bitch")) {
                    isCorrect = true;
                } else {
                    isCorrect = false;
                }
                    }
            else if(number == 24){
                this.Question = String.format("What is the killing curse?<br>(Please spell correctly)");
                this.answer = String.format("Harry Potter for $500 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("avada kedavra")) {
                    isCorrect = true;
                } else {
                    isCorrect = false;
                }
                    }
            else if(number == 25){
                this.Question = String.format("Qui-Gon Jinn dies during a duel on which planet?");
                this.answer = String.format("Star Wars for $500 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("naboo")) {
                    isCorrect = true;
                } else {
                    isCorrect = false;
                }
                    }
            else if(number == 26){
                this.Question = String.format("Who is the first and original disney princess?");
                this.answer = String.format("Disney for $500 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("snow white")) {
                    isCorrect = true;
                } else {
                    isCorrect = false;
                }
                    }
            else if(number == 27){
                this.Question = String.format("What was the Krusty Krab called when Pearl redecorated it?");
                this.answer = String.format("SpongeBob for $500 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("kuddly krab")) {
                    isCorrect = true;
                } else {
                    isCorrect = false;
                }
                    }
            else if(number == 28){
                this.Question = String.format("What word is missing from this statement from Boromir - \"I ask only for the strength to defend my _______ \" ?");
                this.answer = String.format("Lord of the Rings for $500 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("people")) {
                    isCorrect = true;
                } else {
                    isCorrect = false;
                }
                    }
            else if (number == 29){
                this.Question = String.format("What is the name of Rickon's direwolf?");
                this.answer = String.format("Game of Thrones for $500 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (!this.answer.equals("shaggydog") && !this.answer.equals("shaggy dog")) {
                    isCorrect = false;
                } else {
                    isCorrect = true;
                }
                    }
            else if(number == 30){
                this.Question = String.format("Which Hogwarts founder did the Sorting Hat originally belong to? <br>(Please Spell correctly)");
                this.answer = String.format("Harry Potter for $600 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("godric gryffindor")) {
                    isCorrect = true;
                } else {
                    isCorrect = false;
                }
                    }
            else if(number ==  31){
                this.Question = String.format("The Millenium Falcon was able to complete the Kessel Run in fewer than ___ parsecs.");
                this.answer = String.format("Star Wars for $600 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (!this.answer.equals("twelve") && !this.answer.equals("12")) {
                    isCorrect = false;
                } else {
                    isCorrect = true;
                }
                    }
            else if(number == 32){
                this.Question = String.format("What does the matchmaker criticize Mulan for?<br>a. Too tall<br>b. Too skinny<br>c. Bad Posture");
                this.answer = String.format("Disney for $600\n What is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("b")) {
                    isCorrect = true;
                } else {
                    isCorrect = false;
                }
                    }
            else if(number == 33){
                this.Question = String.format("In Band Geeks, what special event does Squidwards band play for?");
                this.answer = String.format("SpongeBob for $600 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("bubble bowl")) {
                    isCorrect = true;
                } else {
                    isCorrect = false;
                }
                    }
            else if(number == 34){
                    this.Question=String.format("How many guests were present at Bilbo's party?");
                    this.answer=String.format("Lord of the Rings for $600 \nWhat is: ");
                    this.answer=this.answer.toLowerCase();
                    if(this.answer.equals("144")){
                    isCorrect=true;
                    }else{
                    isCorrect=false;
                    }
                    }
            else if(number == 35){
                this.Question = String.format("What is the name of Arya Stark's sword?");
                this.answer = String.format("Game of Thrones for $500 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("needle")) {
                    isCorrect = true;
                } else {
                    isCorrect = false;
                }
        }
    }

}

