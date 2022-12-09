package com.example.jeopardyjavaproject;


public class QuestionClass {

    private String questionPartII;
    private String answer;
    private String question;


    //create array list with ints 0-35

    //constructor
    /**
     * Constructs a new instance of the QuestionClass.
     *
     * This constructor initializes the instance variables for the question and
     * its answer to empty strings.
     */

    public QuestionClass() {
        this.questionPartII = "";
        this.answer = "";
        this.question = "";

    }

    /**
     * Retrieves a question based on the prize and number.
     *
     * This method sets the instance variables for the question and answer based on the
     * prize and number provided as arguments.
     *
     * @param prize the prize associated with the question
     * @param number the number identifying the specific question
     *
     *
     *               IMPORTANT: These questions came from https://github.com/JacqBlaq/Jeopardy-Game/blob/master/Jeopardy%20Game/bin/javaProject/Jeopardy.class
     *               however, I changed the code completely to fit my needs.
     */

    public void getQuestion(String prize, int number) {
        if(number == 0) {
               this.question = "A wizard who cannot do magic is known as a: ";
               this.questionPartII = "Harry Potter for "+ prize + "\nWhat is: ";
               this.answer = "squib";
                    }
            else if(number ==  1){
                this.question = "Who directed Rogue One: A Star Wars Story? ";
                this.questionPartII = "Star Wars for "+ prize +
                        " \nWhat is: ";
                this.answer = "gareth edwards";
                    }
            else if(number ==  2){
                this.question = "In \"The Lion King,\" what side of Scar's face is his scar on? Left or right?";
                this.questionPartII = "Disney for "+ prize +
                        " \nWhat is: ";
               this.answer = "left";
                    }
            else if(number ==  3){
                this.question = "What is Patrick's last name?";
                this.questionPartII = "SpongeBob for "+ prize +
                        " \nWhat is: ";
                this.answer = "star";
                    }
            else if(number ==  4){
                this.question = "Who is the most evil of the Valar?";
                this.questionPartII = "Lord of the Rings for "+ prize +
                        " \nWhat is: ";
                this.answer = "melkor";
                    }
            else if(number ==  5){
                this.question = "How many eyes does the raven in Bran's dream have?";
                this.questionPartII = "Game of Thrones for "+ prize +
                        " \nWhat is: ";
                this.answer = "three";
                    }
            else if(number ==  6){
                this.question = "The actor plays Ron Weasly's full name is?)";
                this.questionPartII = "Harry Potter for "+ prize + " \nWhat is: ";
                this.answer = "rupert grint";
                    }
            else if(number ==  7){
                this.question = "Who provided the voice of Yoda? ";
                this.questionPartII = "Star Wars for "+ prize + " \nWhat is: ";
                this.answer = "frank ozr";
                    }
            else if(number ==  8){
                this.question = "In \"Aladdin,\" what does Aladdin, and a reluctant Abu, give to the poor children to eat?";
                this.questionPartII = "Disney for "+ prize + " \nWhat is: ";
                this.answer = "bread";
                    }
            else if(number ==  9){
                this.question = "What does SpongeBob name his Jellyfishing net?";
                this.questionPartII = "SpongeBob for "+ prize + " \nWhat is: ";
                this.answer = "old reliable";
                    }
            else if(number ==  10){
                this.question = "What is the name of the creator of the Valor and Middle-Earth ?";
                this.questionPartII = "Lord of the Rings for "+ prize + " \nWhat is: ";
                this.answer = "illuvator";
                    }
            else if(number ==  11){
                this.question = "What do the wildlings call those living south of the Wall?";
                this.questionPartII = "Game of Thrones for "+ prize + " \nWhat is: ";
                this.answer = "kneelers";
                    }
            else if(number ==  12){
                this.question = "What does Harry eat to manage to breathe underwater during the second taskof the Triwizard Tournament?";
                this.questionPartII = "Harry Potter for "+ prize + " \nWhat is: ";
                this.answer = "gillyweed";
                    }
            else if(number ==  13){
                this.question = "Who commissioned the Grand Army of the Republic?";
                this.questionPartII = "Star Wars for "+ prize + " \nWhat is: ";
                this.answer = "sifo-dyas";
                    }

            else if(number ==  14){
                this.question = "In Hercules, Hades promised not to harm Megara if Hercules gave up his strength for how long?";
                this.questionPartII = "Disney for "+ prize + " \nWhat is: ";
                this.answer = "24 hours";
                    }
            else if(number ==  15){
                this.question = "What is Planktons first name";
                this.questionPartII = "SpongeBob for "+ prize + " \nWhat is: ";
               this.answer = "sheldon";
                    }
            else if(number ==  16){
                this.question = "When Bilbo and the Dwarves are captured by the Goblins in the misty mountains, who saves them from certain death?";
                this.questionPartII = "Lord of the Rings for "+ prize + " \nWhat is: ";
               this.answer = "gandalf";
                    }
            else if(number ==  17){
                this.question = "What is the House Lannister's slogan?";
                this.questionPartII = "Game of Thrones for "+ prize + " \nWhat is: ";
               this.answer = "a lannister always pays his debt";
                    }
            else if(number ==  18){
                this.question = "What does the spell Obliviate do? \n a). Destroy objects \n b). Make objects invisible \n c). Remove parts of someone's memory ";
                this.questionPartII = "Harry Potter for "+ prize + " \nWhat is: ";
               this.answer = "c";
                    }
            else if(number ==  19){
                this.question = "How many known Jedi possess a purple-bladed lightsaber?";
                this.questionPartII = "Star Wars for "+ prize + " \nWhat is: ";
                this.answer = "one";
                    }
            else if(number ==  20){
                this.question = " In \"The Little Mermaid,\" what alias does Ursula use when she becomes human?";
                this.questionPartII = "Disney for "+ prize + " \nWhat is: ";
                this.answer = "venessa";
                    }
            else if(number ==  21){
                this.question = "What was the name of the roller coaster in which Spongebob and Patrick suffered spine loss?\na. Pit o' Fire\nb. Fist o' Pain";
                this.questionPartII = "SpongeBob for "+ prize + " \nWhat is: ";
               this.answer = "b";
                    }
            else if(number ==  22){
                this.question = "At which river were the Nazgul seen crossing on midsummers eve to gather Frodo?";
                this.questionPartII = "Lord of the Rings for "+ prize + " \nWhat is: ";
               this.answer = "isen";
                    }
            else if(number ==  23){
                this.question = "What is the name of Theon Greyjoy's ship?";
                this.questionPartII = "Game of Thrones for "+ prize + " \nWhat is: ";
               this.answer = "sea bitch";
                    }
            else if(number == 24){
                this.question = "What is the killing curse?";
                this.questionPartII = "Harry Potter for "+ prize + " \nWhat is: ";
               this.answer = "avada kedavra";
                    }
            else if(number == 25){
                this.question = "Qui-Gon Jinn dies during a duel on which planet?";
                this.questionPartII = "Star Wars for "+ prize + " \nWhat is: ";
               this.answer = "naboo";
                    }
            else if(number == 26){
                this.question = "Who is the first and original disney princess?";
                this.questionPartII = "Disney for "+ prize + " \nWhat is: ";
               this.answer = "snow white";
                    }
            else if(number == 27){
                this.question = "What was the Krusty Krab called when Pearl redecorated it?";
                this.questionPartII = "SpongeBob for "+ prize + " \nWhat is: ";
               this.answer = "kuddly krab";
                    }
            else if(number == 28){
                this.question = "What word is missing from this statement from Boromir - \"I ask only for the strength to defend my _______ \" ?";
                this.questionPartII = "Lord of the Rings for "+ prize + " \nWhat is: ";
               this.answer = "people";
                    }
            else if (number == 29){
                this.question = "What is the name of Rickon's direwolf?";
                this.questionPartII = "Game of Thrones for "+ prize + " \nWhat is: ";
                this.answer = "shaggydog";
                    }
            else if(number == 30){
                this.question = "What position does Harry play on his Quidditch team?";
                this.questionPartII = "Harry Potter for "+ prize + "  \nWhat is: ";
               this.answer = "seeker";
                    }
            else if(number ==  31){
                this.question = "The Millenium Falcon was able to complete the Kessel Run in fewer than ___ parsecs.";
                this.questionPartII = "Star Wars for "+ prize + "  \nWhat is: ";
                this.answer = "twelve";
                    }
            else if(number == 32){
                this.question = "What does the matchmaker criticize Mulan for?\na. Too tall\nb. Too skinny\nc. Bad Posture";
                this.questionPartII = "Disney for "+ prize + " \n What is: ";
               this.answer = "b";
                    }
            else if(number == 33){
                this.question = "In Band Geeks, what special event does Squidwards band play for?";
                this.questionPartII = "SpongeBob for "+ prize + "  \nWhat is: ";
               this.answer = "bubble bowl";
                    }
            else if(number == 34){
                    this.question ="How many guests were present at Bilbo's party?";
                    this.questionPartII = "Lord of the Rings for "+ prize + "  \nWhat is: ";
                    this.answer="144";
                    }
            else if(number == 35){
                this.question = "What is the name of Arya Stark's sword?";
                this.questionPartII = "Game of Thrones for "+ prize + " \nWhat is: ";
               this.answer = "needle";
        }
        }
    /**
     * Returns the first part of the question.
     *
     * @return The first part of the question.
     */
    public String getQuestionPartI() {
        return this.question;
    }

    /**
     * Returns the second part of the question.
     *
     * @return The second part of the question.
     */
    public String getQuestionPartII() {
        return this.questionPartII;
    }

    /**
     * Returns the answer to the question.
     *
     * @return The answer to the question.
     */
    public String getAnswer() {
        return this.answer;
    }
    }





