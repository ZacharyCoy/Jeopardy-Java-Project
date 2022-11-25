package com.example.jeopardyjavaproject;

import javax.swing.*;
import java.awt.*;

public class QuestionClass {
    private String question;
    private String answer;
    private int value;

    public Question() {
        this.question = question;
        this.answer = answer;
        this.value = value;
    }

    public int questions(int pos, int score) {
        switch (pos) {
            case 6:
                this.Question[pos].setText("A wizard who cannot do magic is known as a: ");
                this.answer = JOptionPane.showInputDialog("Harry Potter for $100 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("squib")) {
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    score = this.moneyWrong(pos);
                }
                break;
            case 7:
                this.Question[pos].setText("Who directed Rogue One: A Star Wars Story? ");
                this.answer = JOptionPane.showInputDialog("Star Wars for $100 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("gareth edwards")) {
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    score = this.moneyWrong(pos);
                }
                break;
            case 8:
                this.Question[pos].setText("In \"The Lion King,\" what side of Scar's face is his scar on? Left or right?");
                this.answer = JOptionPane.showInputDialog("Disney for $100 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("left")) {
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    score = this.moneyWrong(pos);
                }
                break;
            case 9:
                this.Question[pos].setText("What is Patrick's last name?");
                this.answer = JOptionPane.showInputDialog("SpongeBob for $100 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("star")) {
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    score = this.moneyWrong(pos);
                }
                break;
            case 10:
                this.Question[pos].setText("Who is the most evil of the Valar?");
                this.answer = JOptionPane.showInputDialog("Lord of the Rings for $100 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("melkor")) {
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    score = this.moneyWrong(pos);
                }
                break;
            case 11:
                this.Question[pos].setText("How many eyes does the raven in Bran's dream have?");
                this.answer = JOptionPane.showInputDialog("Game of Thrones for $100 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (!this.answer.equals("three") && !this.answer.equals("3")) {
                    score = this.moneyWrong(pos);
                } else {
                    score = this.money(pos);
                    System.out.println(score);
                }
                break;
            case 12:
                this.Question[pos].setText("Who plays Ron Weasly in the movies? <br> (Full name please)");
                this.answer = JOptionPane.showInputDialog("Harry Potter for $200 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("rupert grint")) {
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    score = this.moneyWrong(pos);
                }
                break;
            case 13:
                this.Question[pos].setText("Who provided the voice of Yoda? ");
                this.answer = JOptionPane.showInputDialog("Star Wars for $200 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("frank ozr")) {
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    score = this.moneyWrong(pos);
                }
                break;
            case 14:
                this.Question[pos].setText("In \"Aladdin,\" what does Aladdin, and a reluctant Abu, give to the poor children to eat?");
                this.answer = JOptionPane.showInputDialog("Disney for $200 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (!this.answer.equals("bread") && !this.answer.equals("loaf of bread")) {
                    score = this.moneyWrong(pos);
                } else {
                    score = this.money(pos);
                    System.out.println(score);
                }
                break;
            case 15:
                this.Question[pos].setText("What does SpongeBob name his Jellyfishing net?");
                this.answer = JOptionPane.showInputDialog("SpongeBob for $200 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("old reliable")) {
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    score = this.moneyWrong(pos);
                }
                break;
            case 16:
                this.Question[pos].setText("What is the name of the creator of the Valor and Middle-Earth ?");
                this.answer = JOptionPane.showInputDialog("Lord of the Rings for $200 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("illuvator")) {
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    score = this.moneyWrong(pos);
                }
                break;
            case 17:
                this.Question[pos].setText("What do the wildlings call those living south of the Wall?");
                this.answer = JOptionPane.showInputDialog("Game of Thrones for $200 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (!this.answer.equals("kneelers") && !this.answer.equals("kneeler")) {
                    score = this.moneyWrong(pos);
                } else {
                    score = this.money(pos);
                    System.out.println(score);
                }
                break;
            case 18:
                this.Question[pos].setText("What does Harry eat to manage to breathe underwater during the second taskof the Triwizard Tournament?");
                this.answer = JOptionPane.showInputDialog("Harry Potter for $300 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (!this.answer.equals("gillyweed") && !this.answer.equals("gilly weed")) {
                    score = this.moneyWrong(pos);
                } else {
                    score = this.money(pos);
                    System.out.println(score);
                }
                break;
            case 19:
                this.Question[pos].setText("Who commissioned the Grand Army of the Republic?");
                this.answer = JOptionPane.showInputDialog("Star Wars for $300 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (!this.answer.equals("jedi master sifo-dyas") && !this.answer.equals("sifo dyas") && !this.answer.equals("sifo-dyas")) {
                    score = this.moneyWrong(pos);
                } else {
                    score = this.money(pos);
                    System.out.println(score);
                }
                break;
            case 20:
                this.Question[pos].setText("In \"Hercules,\" Hades promised not to harm Megara if Hercules gave up his strength for how long?");
                this.answer = JOptionPane.showInputDialog("Disney for $300 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (!this.answer.equals("24 hours") && !this.answer.equals("24") && !this.answer.equals("twenty four")) {
                    score = this.moneyWrong(pos);
                } else {
                    score = this.money(pos);
                    System.out.println(score);
                }
                break;
            case 21:
                this.Question[pos].setText("What is Planktons first name");
                this.answer = JOptionPane.showInputDialog("SpongeBob for $300 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("sheldon")) {
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    score = this.moneyWrong(pos);
                }
                break;
            case 22:
                this.Question[pos].setText("When Bilbo and the Dwarves are captured by the Goblins in the misty mountains, who saves them from certain death?");
                this.answer = JOptionPane.showInputDialog("Lord of the Rings for $300 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("gandalf")) {
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    score = this.moneyWrong(pos);
                }
                break;
            case 23:
                this.Question[pos].setText("What is the House Lannister's slogan?");
                this.answer = JOptionPane.showInputDialog("Game of Thrones for $300 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("a lannister always pays his debt")) {
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    score = this.moneyWrong(pos);
                }
                break;
            case 24:
                this.Question[pos].setText("What does the spell \"Obliviate\" do? <br>a. Destroy objects <br>b. Make objects invisible <br>c. Remove parts of someone's memory ");
                this.answer = JOptionPane.showInputDialog("Harry Potter for $400 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("c")) {
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    score = this.moneyWrong(pos);
                }
                break;
            case 25:
                this.Question[pos].setText("How many known Jedi possess a purple-bladed lightsaber?");
                this.answer = JOptionPane.showInputDialog("Star Wars for $400 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (!this.answer.equals("one") && !this.answer.equals("1")) {
                    score = this.moneyWrong(pos);
                } else {
                    score = this.money(pos);
                    System.out.println(score);
                }
                break;
            case 26:
                this.Question[pos].setText(" In \"The Little Mermaid,\" what alias does Ursula use when she becomes human?");
                this.answer = JOptionPane.showInputDialog("Disney for $400 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (!this.answer.equals("venessa") && !this.answer.equals("vennessa")) {
                    score = this.moneyWrong(pos);
                } else {
                    score = this.money(pos);
                    System.out.println(score);
                }
                break;
            case 27:
                this.Question[pos].setText("What was the name of the roller coaster in which Spongebob and Patrick suffered spine loss?<br>a. Pit o' Fire<br>b. Fist o' Pain");
                this.answer = JOptionPane.showInputDialog("SpongeBob for $400 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("b")) {
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    score = this.moneyWrong(pos);
                }
                break;
            case 28:
                this.Question[pos].setText("At which river were the Nazgul seen crossing on midsummers eve to gather Frodo?");
                this.answer = JOptionPane.showInputDialog("Lord of the Rings for $400 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("isen")) {
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    score = this.moneyWrong(pos);
                }
                break;
            case 29:
                this.Question[pos].setText("What is the name of Theon Greyjoy's ship?");
                this.answer = JOptionPane.showInputDialog("Game of Thrones for $400 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("sea bitch")) {
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    score = this.moneyWrong(pos);
                }
                break;
            case 30:
                this.Question[pos].setText("What is the killing curse?<br>(Please spell correctly)");
                this.answer = JOptionPane.showInputDialog("Harry Potter for $500 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("avada kedavra")) {
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    score = this.moneyWrong(pos);
                }
                break;
            case 31:
                this.Question[pos].setText("Qui-Gon Jinn dies during a duel on which planet?");
                this.answer = JOptionPane.showInputDialog("Star Wars for $500 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("naboo")) {
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    score = this.moneyWrong(pos);
                }
                break;
            case 32:
                this.Question[pos].setText("Who is the first and original disney princess?");
                this.answer = JOptionPane.showInputDialog("Disney for $500 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("snow white")) {
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    score = this.moneyWrong(pos);
                }
                break;
            case 33:
                this.Question[pos].setText("What was the Krusty Krab called when Pearl redecorated it?");
                this.answer = JOptionPane.showInputDialog("SpongeBob for $500 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("kuddly krab")) {
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    score = this.moneyWrong(pos);
                }
                break;
            case 34:
                this.Question[pos].setText("What word is missing from this statement from Boromir - \"I ask only for the strength to defend my _______ \" ?");
                this.answer = JOptionPane.showInputDialog("Lord of the Rings for $500 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("people")) {
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    score = this.moneyWrong(pos);
                }
                break;
            case 35:
                this.Question[pos].setText("What is the name of Rickon's direwolf?");
                this.answer = JOptionPane.showInputDialog("Game of Thrones for $500 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (!this.answer.equals("shaggydog") && !this.answer.equals("shaggy dog")) {
                    score = this.moneyWrong(pos);
                } else {
                    score = this.money(pos);
                    System.out.println(score);
                }
                break;
            case 36:
                this.Question[pos].setText("Which Hogwarts founder did the Sorting Hat originally belong to? <br>(Please Spell correctly)");
                this.answer = JOptionPane.showInputDialog("Harry Potter for $600 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("godric gryffindor")) {
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    score = this.moneyWrong(pos);
                }
                break;
            case 37:
                this.Question[pos].setText("The Millenium Falcon was able to complete the Kessel Run in fewer than ___ parsecs.");
                this.answer = JOptionPane.showInputDialog("Star Wars for $600 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (!this.answer.equals("twelve") && !this.answer.equals("12")) {
                    score = this.moneyWrong(pos);
                } else {
                    score = this.money(pos);
                    System.out.println(score);
                }
                break;
            case 38:
                this.Question[pos].setText("What does the matchmaker criticize Mulan for?<br>a. Too tall<br>b. Too skinny<br>c. Bad Posture");
                this.answer = JOptionPane.showInputDialog("Disney for $600\n What is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("b")) {
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    score = this.moneyWrong(pos);
                }
                break;
            case 39:
                this.Question[pos].setText("In Band Geeks, what special event does Squidwards band play for?");
                this.answer = JOptionPane.showInputDialog("SpongeBob for $600 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("bubble bowl")) {
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    score = this.moneyWrong(pos);
                }
                break;
            case 40:
                this.Question[pos].setText("How many guests were present at Bilbo's party?");
                this.answer = JOptionPane.showInputDialog("Lord of the Rings for $600 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("144")) {
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    score = this.moneyWrong(pos);
                }
                break;
            case 41:
                this.Question[pos].setText("What is the name of Arya Stark's sword?");
                this.answer = JOptionPane.showInputDialog("Game of Thrones for $500 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("needle")) {
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    score = this.moneyWrong(pos);
                }
        }

        return score;
    }

    public int getValue() {
        return value;
    }
}
}
