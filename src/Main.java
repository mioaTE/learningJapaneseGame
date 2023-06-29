import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Question> hiraganaLevel1 = Question.makeList("C:\\Users\\Student\\Desktop\\practice\\Japanese\\HiraganaLevel1.txt");
        List<Question> katakanaLevel1 = Question.makeList("C:\\Users\\Student\\Desktop\\practice\\Japanese\\KatakanaLevel1.text");
        List<Question> kanjiLevel1 = Question.makeList("C:\\Users\\Student\\Desktop\\practice\\Japanese\\KanjiLevel1.txt");
        Scanner userInput = new Scanner(System.in);
        User user = new User(0, 0, 100, 0);
        Monster monster = new Monster("Test_monster", 100, 10, false);

        boolean exit = false;

        while (!exit) {
            System.out.println("*****Welcome to Japanese quiz!*****");
            System.out.println("*********日本語を勉強しよう!**********");
            System.out.println();

            System.out.println("Main Menu");
            System.out.println("1) Go to adventure");

            System.out.println("4) exit");
            System.out.println();
            System.out.print("Please enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            String choice = userInput.nextLine();
            scanner.nextLine();

            if (choice.equals("1")) {
                System.out.println("An enemy appears!!");
                System.out.println();

                while (monster.getMonsterHP() > 0 && user.getUserHP() > 0) {
                    System.out.println(monster.getMosterName() + " HP: " + monster.getMonsterHP());
                    System.out.println("User HP: " + user.getUserHP());
                    System.out.println();
                    System.out.println("1) Hiragana quiz attack: 10");
                    System.out.println("2) Katakana quiz attack: 15");
                    System.out.println("3) Kanji quiz attack: 20");
                    System.out.print("Please enter your choice: ");
                    String choice1 = userInput.nextLine();
                    scanner.nextLine();

                    if (choice1.equals("1")) {
                        user.changeUserAttack(String.valueOf(hiraganaLevel1.get(0)));
                        //hiragana level1
                        for (Question question : hiraganaLevel1) {
                            if (monster.getMonsterHP() > 0 && user.getUserHP() > 0) {
                                System.out.println(question);
                                System.out.print("Please enter your choice: ");
                                String userChoice = userInput.nextLine();
                                scanner.nextLine();
                                user.answerQuestion();s

                                if (question.getAnswer().contains(userChoice)) {
                                    System.out.println("That is correct!");
                                    //give attack
                                    System.out.println("You give " + user.getUserAttack() + " of damage to the " + monster.getMosterName() + "!");

                                    //set monster's HP
                                    monster.damagedMonster(user.getUserAttack());
                                    System.out.println(monster.getMosterName() + " HP: " + monster.getMonsterHP());
                                    System.out.println("User HP: " + user.getUserHP());
                                    System.out.println();


                                } else {
                                    System.out.println("Wrong answer!");
                                    //receive damage
                                    System.out.println("The correct answer is: " + question.getAnswer());
                                    System.out.println("You take " + monster.getMonsterAttack() + " points of damage");

                                    //set User HP
                                    user.damagedUser(monster.getMonsterAttack());
                                    System.out.println(monster.getMosterName() + " HP: " + monster.getMonsterHP());
                                    System.out.println("User HP: " + user.getUserHP());
                                    System.out.println();
                                }

                            } else if (monster.getMonsterHP() <= 0 && user.getUserHP() > 0) {
                                System.out.println("You beat the enemy!");
                                break;

                            } else if (monster.getMonsterHP() > 0 && user.getUserHP() <= 0) {
                                System.out.println("YOU ARE DEAD ....");
                                break;

                            }
                        }

                    }
                    if (choice1.equals("2")) {
                        //katakana level1
                        user.changeUserAttack(String.valueOf(katakanaLevel1.get(0)));
                        for (Question question : katakanaLevel1) {
                            if (monster.getMonsterHP() > 0 && user.getUserHP() > 0) {
                                System.out.println(question);
                                System.out.print("Please enter your choice: ");
                                String userChoice = userInput.nextLine();
                                scanner.nextLine();
                                user.answerQuestion();

                                if (question.getAnswer().contains(userChoice)) {
                                    System.out.println("That is correct!");
                                    //give attack
                                    System.out.println("You give " + user.getUserAttack() + " of damage to the " + monster.getMosterName() + "!");

                                    //set monster's HP
                                    monster.damagedMonster(user.getUserAttack());
                                    System.out.println(monster.getMosterName() + " HP: " + monster.getMonsterHP());
                                    System.out.println("User HP: " + user.getUserHP());
                                    System.out.println();


                                } else {
                                    System.out.println("Wrong answer!");
                                    //receive damage
                                    System.out.println("The correct answer is: " + question.getAnswer());
                                    System.out.println("You take " + monster.getMonsterAttack() + " points of damage");

                                    //set User HP
                                    user.damagedUser(monster.getMonsterAttack());
                                    System.out.println(monster.getMosterName() + " HP: " + monster.getMonsterHP());
                                    System.out.println("User HP: " + user.getUserHP());
                                    System.out.println();
                                }

                            } else if (monster.getMonsterHP() <= 0 && user.getUserHP() > 0) {
                                System.out.println("You beat the enemy!");
                                break;

                            } else if (monster.getMonsterHP() > 0 && user.getUserHP() <= 0) {
                                System.out.println("YOU ARE DEAD ....");
                                break;

                            }
                        }

                    }
                    if (choice1.equals("3")) {
                        //kanji level1
                        user.changeUserAttack(String.valueOf(kanjiLevel1.get(0)));
                        for (Question question : kanjiLevel1) {

                            if (monster.getMonsterHP() > 0 && user.getUserHP() > 0) {
                                System.out.println(question);
                                System.out.print("Please enter your choice: ");
                                String userChoice = userInput.nextLine();
                                scanner.nextLine();
                                user.answerQuestion();

                                if (question.getAnswer().contains(userChoice)) {
                                    System.out.println("That is correct!");
                                    //give attack
                                    System.out.println("You give " + user.getUserAttack() + " of damage to the " + monster.getMosterName() + "!");

                                    //set monster's HP
                                    monster.damagedMonster(user.getUserAttack());
                                    System.out.println(monster.getMosterName() + " HP: " + monster.getMonsterHP());
                                    System.out.println("User HP: " + user.getUserHP());
                                    System.out.println();


                                } else {
                                    System.out.println("Wrong answer!");
                                    //receive damage
                                    System.out.println("The correct answer is: " + question.getAnswer());
                                    System.out.println("You take " + monster.getMonsterAttack() + " points of damage");

                                    //set User HP
                                    user.damagedUser(monster.getMonsterAttack());
                                    System.out.println(monster.getMosterName() + " HP: " + monster.getMonsterHP());
                                    System.out.println("User HP: " + user.getUserHP());
                                    System.out.println();
                                }

                            } else if (monster.getMonsterHP() <= 0 && user.getUserHP() > 0) {
                                System.out.println("You beat the enemy!");
                                break;

                            } else if (monster.getMonsterHP() > 0 && user.getUserHP() <= 0) {
                                System.out.println("YOU ARE DEAD ....");
                                break;

                            }
                        }

                    }
                }

            } else if (choice.equals("4")) {
                //exit
                System.out.println("\nThank you for using Japanese quiz!");
                exit = true;
            } else {
                //invalid choice entered
                System.out.println("\n***Invalid choice. Please try again***\n");
            }

        }


    }
}





