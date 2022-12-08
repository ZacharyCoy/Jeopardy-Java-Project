package com.example.jeopardyjavaproject;


public class QuestionClass {

    private String QuestionPartII;
    private String answer;
    private String Question;


    //create array list with ints 0-35

    //constructor
    /**
     * Constructs a new instance of the QuestionClass.
     *
     * This constructor initializes the instance variables for the question and
     * its answer to empty strings.
     */

    public QuestionClass() {
        this.QuestionPartII = "";
        this.answer = "";
        this.Question = "";

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
               this.Question = "A wizard who cannot do magic is known as a: ";
               this.QuestionPartII = "Harry Potter for "+ prize + "\nWhat is: ";
               this.answer = "squib";
                    }
            else if(number ==  1){
                this.Question = "Who directed Rogue One: A Star Wars Story? ";
                this.QuestionPartII = "Star Wars for "+ prize +
                        " \nWhat is: ";
                this.answer = "gareth edwards";
                    }
            else if(number ==  2){
                this.Question = "In \"The Lion King,\" what side of Scar's face is his scar on? Left or right?";
                this.QuestionPartII = "Disney for "+ prize +
                        " \nWhat is: ";
               this.answer = "left";
                    }
            else if(number ==  3){
                this.Question = "What is Patrick's last name?";
                this.QuestionPartII = "SpongeBob for "+ prize +
                        " \nWhat is: ";
                this.answer = "star";
                    }
            else if(number ==  4){
                this.Question = "Who is the most evil of the Valar?";
                this.QuestionPartII = "Lord of the Rings for "+ prize +
                        " \nWhat is: ";
                this.answer = "melkor";
                    }
            else if(number ==  5){
                this.Question = "How many eyes does the raven in Bran's dream have?";
                this.QuestionPartII = "Game of Thrones for "+ prize +
                        " \nWhat is: ";
                this.answer = "three";
                    }
            else if(number ==  6){
                this.Question = "The actor plays Ron Weasly's full name is?)";
                this.QuestionPartII = "Harry Potter for "+ prize + " \nWhat is: ";
                this.answer = "rupert grint";
                    }
            else if(number ==  7){
                this.Question = "Who provided the voice of Yoda? ";
                this.QuestionPartII = "Star Wars for "+ prize + " \nWhat is: ";
                this.answer = "frank ozr";
                    }
            else if(number ==  8){
                this.Question = "In \"Aladdin,\" what does Aladdin, and a reluctant Abu, give to the poor children to eat?";
                this.QuestionPartII = "Disney for "+ prize + " \nWhat is: ";
                this.answer = "bread";
                    }
            else if(number ==  9){
                this.Question = "What does SpongeBob name his Jellyfishing net?";
                this.QuestionPartII = "SpongeBob for "+ prize + " \nWhat is: ";
                this.answer = "old reliable";
                    }
            else if(number ==  10){
                this.Question = "What is the name of the creator of the Valor and Middle-Earth ?";
                this.QuestionPartII = "Lord of the Rings for "+ prize + " \nWhat is: ";
                this.answer = "illuvator";
                    }
            else if(number ==  11){
                this.Question = "What do the wildlings call those living south of the Wall?";
                this.QuestionPartII = "Game of Thrones for "+ prize + " \nWhat is: ";
                this.answer = "kneelers";
                    }
            else if(number ==  12){
                this.Question = "What does Harry eat to manage to breathe underwater during the second taskof the Triwizard Tournament?";
                this.QuestionPartII = "Harry Potter for "+ prize + " \nWhat is: ";
                this.answer = "gillyweed";
                    }
            else if(number ==  13){
                this.Question = "Who commissioned the Grand Army of the Republic?";
                this.QuestionPartII = "Star Wars for "+ prize + " \nWhat is: ";
                this.answer = "sifo-dyas";
                    }

            else if(number ==  14){
                this.Question = "In Hercules, Hades promised not to harm Megara if Hercules gave up his strength for how long?";
                this.QuestionPartII = "Disney for "+ prize + " \nWhat is: ";
                this.answer = "24 hours";
                    }
            else if(number ==  15){
                this.Question = "What is Planktons first name";
                this.QuestionPartII = "SpongeBob for "+ prize + " \nWhat is: ";
               this.answer = "sheldon";
                    }
            else if(number ==  16){
                this.Question = "When Bilbo and the Dwarves are captured by the Goblins in the misty mountains, who saves them from certain death?";
                this.QuestionPartII = "Lord of the Rings for "+ prize + " \nWhat is: ";
               this.answer = "gandalf";
                    }
            else if(number ==  17){
                this.Question = "What is the House Lannister's slogan?";
                this.QuestionPartII = "Game of Thrones for "+ prize + " \nWhat is: ";
               this.answer = "a lannister always pays his debt";
                    }
            else if(number ==  18){
                this.Question = "What does the spell Obliviate do? \n a). Destroy objects \n b). Make objects invisible \n c). Remove parts of someone's memory ";
                this.QuestionPartII = "Harry Potter for "+ prize + " \nWhat is: ";
               this.answer = "c";
                    }
            else if(number ==  19){
                this.Question = "How many known Jedi possess a purple-bladed lightsaber?";
                this.QuestionPartII = "Star Wars for "+ prize + " \nWhat is: ";
                this.answer = "one";
                    }
            else if(number ==  20){
                this.Question = " In \"The Little Mermaid,\" what alias does Ursula use when she becomes human?";
                this.QuestionPartII = "Disney for "+ prize + " \nWhat is: ";
                this.answer = "venessa";
                    }
            else if(number ==  21){
                this.Question = "What was the name of the roller coaster in which Spongebob and Patrick suffered spine loss?\na. Pit o' Fire\nb. Fist o' Pain";
                this.QuestionPartII = "SpongeBob for "+ prize + " \nWhat is: ";
               this.answer = "b";
                    }
            else if(number ==  22){
                this.Question = "At which river were the Nazgul seen crossing on midsummers eve to gather Frodo?";
                this.QuestionPartII = "Lord of the Rings for "+ prize + " \nWhat is: ";
               this.answer = "isen";
                    }
            else if(number ==  23){
                this.Question = "What is the name of Theon Greyjoy's ship?";
                this.QuestionPartII = "Game of Thrones for "+ prize + " \nWhat is: ";
               this.answer = "sea bitch";
                    }
            else if(number == 24){
                this.Question = "What is the killing curse?";
                this.QuestionPartII = "Harry Potter for "+ prize + " \nWhat is: ";
               this.answer = "avada kedavra";
                    }
            else if(number == 25){
                this.Question = "Qui-Gon Jinn dies during a duel on which planet?";
                this.QuestionPartII = "Star Wars for "+ prize + " \nWhat is: ";
               this.answer = "naboo";
                    }
            else if(number == 26){
                this.Question = "Who is the first and original disney princess?";
                this.QuestionPartII = "Disney for "+ prize + " \nWhat is: ";
               this.answer = "snow white";
                    }
            else if(number == 27){
                this.Question = "What was the Krusty Krab called when Pearl redecorated it?";
                this.QuestionPartII = "SpongeBob for "+ prize + " \nWhat is: ";
               this.answer = "kuddly krab";
                    }
            else if(number == 28){
                this.Question = "What word is missing from this statement from Boromir - \"I ask only for the strength to defend my _______ \" ?";
                this.QuestionPartII = "Lord of the Rings for "+ prize + " \nWhat is: ";
               this.answer = "people";
                    }
            else if (number == 29){
                this.Question = "What is the name of Rickon's direwolf?";
                this.QuestionPartII = "Game of Thrones for "+ prize + " \nWhat is: ";
                this.answer = "shaggydog";
                    }
            else if(number == 30){
                this.Question = "What position does Harry play on his Quidditch team?";
                this.QuestionPartII = "Harry Potter for "+ prize + "  \nWhat is: ";
               this.answer = "seeker";
                    }
            else if(number ==  31){
                this.Question = "The Millenium Falcon was able to complete the Kessel Run in fewer than ___ parsecs.";
                this.QuestionPartII = "Star Wars for "+ prize + "  \nWhat is: ";
                this.answer = "twelve";
                    }
            else if(number == 32){
                this.Question = "What does the matchmaker criticize Mulan for?\na. Too tall\nb. Too skinny\nc. Bad Posture";
                this.QuestionPartII = "Disney for "+ prize + " \n What is: ";
               this.answer = "b";
                    }
            else if(number == 33){
                this.Question = "In Band Geeks, what special event does Squidwards band play for?";
                this.QuestionPartII = "SpongeBob for "+ prize + "  \nWhat is: ";
               this.answer = "bubble bowl";
                    }
            else if(number == 34){
                    this.Question="How many guests were present at Bilbo's party?";
                    this.QuestionPartII = "Lord of the Rings for "+ prize + "  \nWhat is: ";
                    this.answer="144";
                    }
            else if(number == 35){
                this.Question = "What is the name of Arya Stark's sword?";
                this.QuestionPartII = "Game of Thrones for "+ prize + " \nWhat is: ";
               this.answer = "needle";
        }
        }
    /**
     * Returns the first part of the question.
     *
     * @return The first part of the question.
     */
    public String getQuestionPartI() {
        return this.Question;
    }

    /**
     * Returns the second part of the question.
     *
     * @return The second part of the question.
     */
    public String getQuestionPartII() {
        return this.QuestionPartII;
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





