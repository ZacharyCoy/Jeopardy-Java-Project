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
                this.Question[pos].setFont(new Font("Arial", 1, 11));
                this.Question[pos].setText("<html>A wizard who cannot do magic is known as a: </html>");
                this.Question[pos].setEnabled(false);
                this.Question[pos].setBackground(Color.BLACK);
                this.Question[pos].setIcon((Icon)null);
                this.answer = JOptionPane.showInputDialog("Harry Potter for $100 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("squib")) {
                    JOptionPane.showMessageDialog((Component)null, "CORRECT!");
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "WRONG!");
                    score = this.moneyWrong(pos);
                }
                break;
            case 7:
                this.Question[pos].setFont(new Font("Arial", 1, 11));
                this.Question[pos].setText("<html>Who directed Rogue One: A Star Wars Story? </html>");
                this.Question[pos].setEnabled(false);
                this.Question[pos].setBackground(Color.BLACK);
                this.Question[pos].setIcon((Icon)null);
                this.answer = JOptionPane.showInputDialog("Star Wars for $100 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("gareth edwards")) {
                    JOptionPane.showMessageDialog((Component)null, "CORRECT!");
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "WRONG!\n Correct Answer: Gareth Edwards");
                    score = this.moneyWrong(pos);
                }
                break;
            case 8:
                this.Question[pos].setFont(new Font("Arial", 1, 11));
                this.Question[pos].setText("<html>In \"The Lion King,\" what side of Scar's face is his scar on? Left or right?</html>");
                this.Question[pos].setEnabled(false);
                this.Question[pos].setBackground(Color.BLACK);
                this.Question[pos].setIcon((Icon)null);
                this.answer = JOptionPane.showInputDialog("Disney for $100 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("left")) {
                    JOptionPane.showMessageDialog((Component)null, "CORRECT!");
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "WRONG! \n Correct Answer: left");
                    score = this.moneyWrong(pos);
                }
                break;
            case 9:
                this.Question[pos].setFont(new Font("Arial", 1, 11));
                this.Question[pos].setText("<html>What is Patrick's last name?</html>");
                this.Question[pos].setEnabled(false);
                this.Question[pos].setBackground(Color.BLACK);
                this.Question[pos].setIcon((Icon)null);
                this.answer = JOptionPane.showInputDialog("SpongeBob for $100 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("star")) {
                    JOptionPane.showMessageDialog((Component)null, "CORRECT!");
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "WRONG!\n Correct Answer: Star");
                    score = this.moneyWrong(pos);
                }
                break;
            case 10:
                this.Question[pos].setFont(new Font("Arial", 1, 11));
                this.Question[pos].setText("<html>Who is the most evil of the Valar?</html>");
                this.Question[pos].setEnabled(false);
                this.Question[pos].setBackground(Color.BLACK);
                this.Question[pos].setIcon((Icon)null);
                this.answer = JOptionPane.showInputDialog("Lord of the Rings for $100 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("melkor")) {
                    JOptionPane.showMessageDialog((Component)null, "CORRECT!");
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "WRONG! \n Correct Answer: Melkor");
                    score = this.moneyWrong(pos);
                }
                break;
            case 11:
                this.Question[pos].setFont(new Font("Arial", 1, 11));
                this.Question[pos].setText("<html>How many eyes does the raven in Bran's dream have?</html>");
                this.Question[pos].setEnabled(false);
                this.Question[pos].setBackground(Color.BLACK);
                this.Question[pos].setIcon((Icon)null);
                this.answer = JOptionPane.showInputDialog("Game of Thrones for $100 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (!this.answer.equals("three") && !this.answer.equals("3")) {
                    JOptionPane.showMessageDialog((Component)null, "WRONG! \n Correct Answer: 3");
                    score = this.moneyWrong(pos);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "CORRECT!");
                    score = this.money(pos);
                    System.out.println(score);
                }
                break;
            case 12:
                this.Question[pos].setFont(new Font("Arial", 1, 11));
                this.Question[pos].setText("<html>Who plays Ron Weasly in the movies? <br> (Full name please)");
                this.Question[pos].setEnabled(false);
                this.Question[pos].setBackground(Color.BLACK);
                this.Question[pos].setIcon((Icon)null);
                this.answer = JOptionPane.showInputDialog("Harry Potter for $200 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("rupert grint")) {
                    JOptionPane.showMessageDialog((Component)null, "CORRECT!");
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "WRONG!\n Correct Answer: Rupert Grint");
                    score = this.moneyWrong(pos);
                }
                break;
            case 13:
                this.Question[pos].setFont(new Font("Arial", 1, 11));
                this.Question[pos].setText("<html>Who provided the voice of Yoda? </html>");
                this.Question[pos].setEnabled(false);
                this.Question[pos].setBackground(Color.BLACK);
                this.Question[pos].setIcon((Icon)null);
                this.answer = JOptionPane.showInputDialog("Star Wars for $200 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("frank ozr")) {
                    JOptionPane.showMessageDialog((Component)null, "CORRECT!");
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "WRONG!\n Correct Answer: Frank Oz");
                    score = this.moneyWrong(pos);
                }
                break;
            case 14:
                this.Question[pos].setFont(new Font("Arial", 1, 11));
                this.Question[pos].setText("<html>In \"Aladdin,\" what does Aladdin, and a reluctant Abu, give to the poor children to eat?</html>");
                this.Question[pos].setEnabled(false);
                this.Question[pos].setBackground(Color.BLACK);
                this.Question[pos].setIcon((Icon)null);
                this.answer = JOptionPane.showInputDialog("Disney for $200 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (!this.answer.equals("bread") && !this.answer.equals("loaf of bread")) {
                    JOptionPane.showMessageDialog((Component)null, "WRONG! \n Correct Answer: bread");
                    score = this.moneyWrong(pos);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "CORRECT!");
                    score = this.money(pos);
                    System.out.println(score);
                }
                break;
            case 15:
                this.Question[pos].setFont(new Font("Arial", 1, 11));
                this.Question[pos].setText("<html>What does SpongeBob name his Jellyfishing net?</html>");
                this.Question[pos].setEnabled(false);
                this.Question[pos].setBackground(Color.BLACK);
                this.Question[pos].setIcon((Icon)null);
                this.answer = JOptionPane.showInputDialog("SpongeBob for $200 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("old reliable")) {
                    JOptionPane.showMessageDialog((Component)null, "CORRECT!");
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "WRONG! \n Correct Answer: Old Reliable");
                    score = this.moneyWrong(pos);
                }
                break;
            case 16:
                this.Question[pos].setFont(new Font("Arial", 1, 11));
                this.Question[pos].setText("<html>What is the name of the creator of the Valor and Middle-Earth ?</html>");
                this.Question[pos].setEnabled(false);
                this.Question[pos].setBackground(Color.BLACK);
                this.Question[pos].setIcon((Icon)null);
                this.answer = JOptionPane.showInputDialog("Lord of the Rings for $200 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("illuvator")) {
                    JOptionPane.showMessageDialog((Component)null, "CORRECT!");
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "WRONG!\n Correct Answer: Illuvator");
                    score = this.moneyWrong(pos);
                }
                break;
            case 17:
                this.Question[pos].setFont(new Font("Arial", 1, 11));
                this.Question[pos].setText("<html>What do the wildlings call those living south of the Wall?</html>");
                this.Question[pos].setEnabled(false);
                this.Question[pos].setBackground(Color.BLACK);
                this.Question[pos].setIcon((Icon)null);
                this.answer = JOptionPane.showInputDialog("Game of Thrones for $200 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (!this.answer.equals("kneelers") && !this.answer.equals("kneeler")) {
                    JOptionPane.showMessageDialog((Component)null, "WRONG! \n Correct Answer: Kneelers");
                    score = this.moneyWrong(pos);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "CORRECT!");
                    score = this.money(pos);
                    System.out.println(score);
                }
                break;
            case 18:
                this.Question[pos].setFont(new Font("Arial", 1, 11));
                this.Question[pos].setText("<html>What does Harry eat to manage to breathe underwater during the second taskof the Triwizard Tournament?</html>");
                this.Question[pos].setEnabled(false);
                this.Question[pos].setBackground(Color.BLACK);
                this.Question[pos].setIcon((Icon)null);
                this.answer = JOptionPane.showInputDialog("Harry Potter for $300 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (!this.answer.equals("gillyweed") && !this.answer.equals("gilly weed")) {
                    JOptionPane.showMessageDialog((Component)null, "WRONG!\n Correct Answer: Gillyweed");
                    score = this.moneyWrong(pos);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "CORRECT!");
                    score = this.money(pos);
                    System.out.println(score);
                }
                break;
            case 19:
                this.Question[pos].setFont(new Font("Arial", 1, 11));
                this.Question[pos].setText("<html>Who commissioned the Grand Army of the Republic?</html>");
                this.Question[pos].setEnabled(false);
                this.Question[pos].setBackground(Color.BLACK);
                this.Question[pos].setIcon((Icon)null);
                this.answer = JOptionPane.showInputDialog("Star Wars for $300 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (!this.answer.equals("jedi master sifo-dyas") && !this.answer.equals("sifo dyas") && !this.answer.equals("sifo-dyas")) {
                    JOptionPane.showMessageDialog((Component)null, "WRONG!\n Correct Answer: Sifo Dyas");
                    score = this.moneyWrong(pos);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "CORRECT!");
                    score = this.money(pos);
                    System.out.println(score);
                }
                break;
            case 20:
                this.Question[pos].setFont(new Font("Arial", 1, 11));
                this.Question[pos].setText("<html>In \"Hercules,\" Hades promised not to harm Megara if Hercules gave up his strength for how long?</html>");
                this.Question[pos].setEnabled(false);
                this.Question[pos].setBackground(Color.BLACK);
                this.Question[pos].setIcon((Icon)null);
                this.answer = JOptionPane.showInputDialog("Disney for $300 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (!this.answer.equals("24 hours") && !this.answer.equals("24") && !this.answer.equals("twenty four")) {
                    JOptionPane.showMessageDialog((Component)null, "WRONG! \n Correct Answer: 24");
                    score = this.moneyWrong(pos);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "CORRECT!");
                    score = this.money(pos);
                    System.out.println(score);
                }
                break;
            case 21:
                this.Question[pos].setFont(new Font("Arial", 1, 11));
                this.Question[pos].setText("<html>What is Planktons first name</html>");
                this.Question[pos].setEnabled(false);
                this.Question[pos].setBackground(Color.BLACK);
                this.Question[pos].setIcon((Icon)null);
                this.answer = JOptionPane.showInputDialog("SpongeBob for $300 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("sheldon")) {
                    JOptionPane.showMessageDialog((Component)null, "CORRECT!");
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "WRONG!\n Correct Answer: Sheldon");
                    score = this.moneyWrong(pos);
                }
                break;
            case 22:
                this.Question[pos].setFont(new Font("Arial", 1, 11));
                this.Question[pos].setText("<html>When Bilbo and the Dwarves are captured by the Goblins in the misty mountains, who saves them from certain death?</html>");
                this.Question[pos].setEnabled(false);
                this.Question[pos].setBackground(Color.BLACK);
                this.Question[pos].setIcon((Icon)null);
                this.answer = JOptionPane.showInputDialog("Lord of the Rings for $300 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("gandalf")) {
                    JOptionPane.showMessageDialog((Component)null, "CORRECT!");
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "WRONG! \n Correct Answer: Gandalf");
                    score = this.moneyWrong(pos);
                }
                break;
            case 23:
                this.Question[pos].setFont(new Font("Arial", 1, 11));
                this.Question[pos].setText("<html>What is the House Lannister's slogan?</html>");
                this.Question[pos].setEnabled(false);
                this.Question[pos].setBackground(Color.BLACK);
                this.Question[pos].setIcon((Icon)null);
                this.answer = JOptionPane.showInputDialog("Game of Thrones for $300 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("a lannister always pays his debt")) {
                    JOptionPane.showMessageDialog((Component)null, "CORRECT!");
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "WRONG! \n Correct Answer: A Lannister awalys pays his debt");
                    score = this.moneyWrong(pos);
                }
                break;
            case 24:
                this.Question[pos].setFont(new Font("Arial", 1, 11));
                this.Question[pos].setText("<html>What does the spell \"Obliviate\" do? <br>a. Destroy objects <br>b. Make objects invisible <br>c. Remove parts of someone's memory </html>");
                this.Question[pos].setEnabled(false);
                this.Question[pos].setBackground(Color.BLACK);
                this.Question[pos].setIcon((Icon)null);
                this.answer = JOptionPane.showInputDialog("Harry Potter for $400 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("c")) {
                    JOptionPane.showMessageDialog((Component)null, "CORRECT!");
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "WRONG!\n Correct Answer: C");
                    score = this.moneyWrong(pos);
                }
                break;
            case 25:
                this.Question[pos].setFont(new Font("Arial", 1, 11));
                this.Question[pos].setText("<html>How many known Jedi possess a purple-bladed lightsaber?</html>");
                this.Question[pos].setEnabled(false);
                this.Question[pos].setBackground(Color.BLACK);
                this.Question[pos].setIcon((Icon)null);
                this.answer = JOptionPane.showInputDialog("Star Wars for $400 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (!this.answer.equals("one") && !this.answer.equals("1")) {
                    JOptionPane.showMessageDialog((Component)null, "WRONG!\n Correct Answer: One");
                    score = this.moneyWrong(pos);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "CORRECT!");
                    score = this.money(pos);
                    System.out.println(score);
                }
                break;
            case 26:
                this.Question[pos].setFont(new Font("Arial", 1, 11));
                this.Question[pos].setText("<html> In \"The Little Mermaid,\" what alias does Ursula use when she becomes human?</html>");
                this.Question[pos].setEnabled(false);
                this.Question[pos].setBackground(Color.BLACK);
                this.Question[pos].setIcon((Icon)null);
                this.answer = JOptionPane.showInputDialog("Disney for $400 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (!this.answer.equals("venessa") && !this.answer.equals("vennessa")) {
                    JOptionPane.showMessageDialog((Component)null, "WRONG!\n Correct Answer: Venessa");
                    score = this.moneyWrong(pos);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "CORRECT!");
                    score = this.money(pos);
                    System.out.println(score);
                }
                break;
            case 27:
                this.Question[pos].setFont(new Font("Arial", 1, 10));
                this.Question[pos].setText("<html>What was the name of the roller coaster in which Spongebob and Patrick suffered spine loss?<br>a. Pit o' Fire<br>b. Fist o' Pain</html>");
                this.Question[pos].setEnabled(false);
                this.Question[pos].setBackground(Color.BLACK);
                this.Question[pos].setIcon((Icon)null);
                this.answer = JOptionPane.showInputDialog("SpongeBob for $400 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("b")) {
                    JOptionPane.showMessageDialog((Component)null, "CORRECT!");
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "WRONG!\n Correct Answer: B");
                    score = this.moneyWrong(pos);
                }
                break;
            case 28:
                this.Question[pos].setFont(new Font("Arial", 1, 11));
                this.Question[pos].setText("<html>At which river were the Nazgul seen crossing on midsummers eve to gather Frodo?</html>");
                this.Question[pos].setEnabled(false);
                this.Question[pos].setBackground(Color.BLACK);
                this.Question[pos].setIcon((Icon)null);
                this.answer = JOptionPane.showInputDialog("Lord of the Rings for $400 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("isen")) {
                    JOptionPane.showMessageDialog((Component)null, "CORRECT!");
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "WRONG!\n Correct Answer: Isen");
                    score = this.moneyWrong(pos);
                }
                break;
            case 29:
                this.Question[pos].setFont(new Font("Arial", 1, 11));
                this.Question[pos].setText("<html>What is the name of Theon Greyjoy's ship?</html>");
                this.Question[pos].setEnabled(false);
                this.Question[pos].setBackground(Color.BLACK);
                this.Question[pos].setIcon((Icon)null);
                this.answer = JOptionPane.showInputDialog("Game of Thrones for $400 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("sea bitch")) {
                    JOptionPane.showMessageDialog((Component)null, "CORRECT!");
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "WRONG! \n Correct Answer: Sea Bitch");
                    score = this.moneyWrong(pos);
                }
                break;
            case 30:
                this.Question[pos].setFont(new Font("Arial", 1, 11));
                this.Question[pos].setText("<html>What is the killing curse?<br>(Please spell correctly)");
                this.Question[pos].setEnabled(false);
                this.Question[pos].setBackground(Color.BLACK);
                this.Question[pos].setIcon((Icon)null);
                this.answer = JOptionPane.showInputDialog("Harry Potter for $500 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("avada kedavra")) {
                    JOptionPane.showMessageDialog((Component)null, "CORRECT!");
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "WRONG!\n Correct Answer: Avada Kedavra");
                    score = this.moneyWrong(pos);
                }
                break;
            case 31:
                this.Question[pos].setFont(new Font("Arial", 1, 11));
                this.Question[pos].setText("<html>Qui-Gon Jinn dies during a duel on which planet?</html>");
                this.Question[pos].setEnabled(false);
                this.Question[pos].setBackground(Color.BLACK);
                this.Question[pos].setIcon((Icon)null);
                this.answer = JOptionPane.showInputDialog("Star Wars for $500 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("naboo")) {
                    JOptionPane.showMessageDialog((Component)null, "CORRECT!");
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "WRONG!\n Correct Answer: Naboo");
                    score = this.moneyWrong(pos);
                }
                break;
            case 32:
                this.Question[pos].setFont(new Font("Arial", 1, 11));
                this.Question[pos].setText("<html>Who is the first and original disney princess?</html>");
                this.Question[pos].setEnabled(false);
                this.Question[pos].setBackground(Color.BLACK);
                this.Question[pos].setIcon((Icon)null);
                this.answer = JOptionPane.showInputDialog("Disney for $500 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("snow white")) {
                    JOptionPane.showMessageDialog((Component)null, "CORRECT!");
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "WRONG!\n Correct Answer: Snow White");
                    score = this.moneyWrong(pos);
                }
                break;
            case 33:
                this.Question[pos].setFont(new Font("Arial", 1, 11));
                this.Question[pos].setText("<html>What was the Krusty Krab called when Pearl redecorated it?</html>");
                this.Question[pos].setEnabled(false);
                this.Question[pos].setBackground(Color.BLACK);
                this.Question[pos].setIcon((Icon)null);
                this.answer = JOptionPane.showInputDialog("SpongeBob for $500 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("kuddly krab")) {
                    JOptionPane.showMessageDialog((Component)null, "CORRECT!");
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "WRONG! \n Correct Answer: Kuddly Krab");
                    score = this.moneyWrong(pos);
                }
                break;
            case 34:
                this.Question[pos].setFont(new Font("Arial", 1, 11));
                this.Question[pos].setText("<html>What word is missing from this statement from Boromir - \"I ask only for the strength to defend my _______ \" ?</html>");
                this.Question[pos].setEnabled(false);
                this.Question[pos].setBackground(Color.BLACK);
                this.Question[pos].setIcon((Icon)null);
                this.answer = JOptionPane.showInputDialog("Lord of the Rings for $500 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("people")) {
                    JOptionPane.showMessageDialog((Component)null, "CORRECT!");
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "WRONG! \n Correct Answer: People");
                    score = this.moneyWrong(pos);
                }
                break;
            case 35:
                this.Question[pos].setFont(new Font("Arial", 1, 11));
                this.Question[pos].setText("<html>What is the name of Rickon's direwolf?</html>");
                this.Question[pos].setEnabled(false);
                this.Question[pos].setBackground(Color.BLACK);
                this.Question[pos].setIcon((Icon)null);
                this.answer = JOptionPane.showInputDialog("Game of Thrones for $500 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (!this.answer.equals("shaggydog") && !this.answer.equals("shaggy dog")) {
                    JOptionPane.showMessageDialog((Component)null, "WRONG! \n Correct Answer: Shaggy dog");
                    score = this.moneyWrong(pos);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "CORRECT!");
                    score = this.money(pos);
                    System.out.println(score);
                }
                break;
            case 36:
                this.Question[pos].setFont(new Font("Arial", 1, 11));
                this.Question[pos].setText("<html>Which Hogwarts founder did the Sorting Hat originally belong to? <br>(Please Spell correctly)</html>");
                this.Question[pos].setEnabled(false);
                this.Question[pos].setBackground(Color.BLACK);
                this.Question[pos].setIcon((Icon)null);
                this.answer = JOptionPane.showInputDialog("Harry Potter for $600 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("godric gryffindor")) {
                    JOptionPane.showMessageDialog((Component)null, "CORRECT!");
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "WRONG!\n Correct Answer: Godric Gryffindor");
                    score = this.moneyWrong(pos);
                }
                break;
            case 37:
                this.Question[pos].setFont(new Font("Arial", 1, 11));
                this.Question[pos].setText("<html>The Millenium Falcon was able to complete the Kessel Run in fewer than ___ parsecs.</html>");
                this.Question[pos].setEnabled(false);
                this.Question[pos].setBackground(Color.BLACK);
                this.Question[pos].setIcon((Icon)null);
                this.answer = JOptionPane.showInputDialog("Star Wars for $600 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (!this.answer.equals("twelve") && !this.answer.equals("12")) {
                    JOptionPane.showMessageDialog((Component)null, "WRONG! \n Correct Answer: 12");
                    score = this.moneyWrong(pos);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "CORRECT!");
                    score = this.money(pos);
                    System.out.println(score);
                }
                break;
            case 38:
                this.Question[pos].setFont(new Font("Arial", 1, 11));
                this.Question[pos].setText("<html>What does the matchmaker criticize Mulan for?<br>a. Too tall<br>b. Too skinny<br>c. Bad Posture</html>");
                this.Question[pos].setEnabled(false);
                this.Question[pos].setBackground(Color.BLACK);
                this.Question[pos].setIcon((Icon)null);
                this.answer = JOptionPane.showInputDialog("Disney for $600\n What is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("b")) {
                    JOptionPane.showMessageDialog((Component)null, "CORRECT!");
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "WRONG!\n Correct Answer: B");
                    score = this.moneyWrong(pos);
                }
                break;
            case 39:
                this.Question[pos].setFont(new Font("Arial", 1, 11));
                this.Question[pos].setText("<html>In Band Geeks, what special event does Squidwards band play for?</html>");
                this.Question[pos].setEnabled(false);
                this.Question[pos].setBackground(Color.BLACK);
                this.Question[pos].setIcon((Icon)null);
                this.answer = JOptionPane.showInputDialog("SpongeBob for $600 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("bubble bowl")) {
                    JOptionPane.showMessageDialog((Component)null, "CORRECT!");
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "WRONG! \n Correct Answer: Bubble Bowl");
                    score = this.moneyWrong(pos);
                }
                break;
            case 40:
                this.Question[pos].setFont(new Font("Arial", 1, 11));
                this.Question[pos].setText("<html>How many guests were present at Bilbo's party?</html>");
                this.Question[pos].setEnabled(false);
                this.Question[pos].setBackground(Color.BLACK);
                this.Question[pos].setIcon((Icon)null);
                this.answer = JOptionPane.showInputDialog("Lord of the Rings for $600 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("144")) {
                    JOptionPane.showMessageDialog((Component)null, "CORRECT!");
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "WRONG! \n Correct Answer: 144");
                    score = this.moneyWrong(pos);
                }
                break;
            case 41:
                this.Question[pos].setFont(new Font("Arial", 1, 11));
                this.Question[pos].setText("<html>What is the name of Arya Stark's sword?</html>");
                this.Question[pos].setEnabled(false);
                this.Question[pos].setBackground(Color.BLACK);
                this.Question[pos].setIcon((Icon)null);
                this.answer = JOptionPane.showInputDialog("Game of Thrones for $500 \nWhat is: ");
                this.answer = this.answer.toLowerCase();
                if (this.answer.equals("needle")) {
                    JOptionPane.showMessageDialog((Component)null, "CORRECT!");
                    score = this.money(pos);
                    System.out.println(score);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "WRONG! \n Correct Answer: needle");
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
