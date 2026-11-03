package com.practice.corejavabasics;
import java.util.Scanner;
public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Money = 0, 
        guaranteedMoney = 0;
        int correctanswer = 0,
        reward = 0;
        int audiencePollUsed = 0,
        fiftyFiftyUsed = 0;
        System.out.println("===== WELCOME TO QUIZ GAME =====");
        for (int i = 1; i <= 10; i++) {
            System.out.println("-------m--------------------");
            System.out.println("QUESTION " + i);
            System.out.println("---------------------------");
            if (i == 1) {
                System.out.println("Which keyword is used to define a class in Java?");
                System.out.println("1) class  2) Class  3) define  4) object");
                correctanswer = 1; reward = 1000;
            } else if (i == 2) {
                System.out.println("Which method is the starting point of a Java program?");
                System.out.println("1) start()  2) main()  3) run()  4) execute()");
                correctanswer = 2; reward = 2000;
            } else if (i == 3) {
                System.out.println("Which data type is used to store whole numbers?");
                System.out.println("1) double  2) char  3) int  4) boolean");
                correctanswer = 3; reward = 3000;
            } else if (i == 4) {
                System.out.println("Which keyword is used to create an object in Java?");
                System.out.println("1) class  2) object  3) new  4) create");
                correctanswer = 3; reward = 4000;
            } else if (i == 5) {
                System.out.println("Which keyword is used to inherit a class?");
                System.out.println("1) implements  2) extends  3) inherit  4) super");
                correctanswer = 2; reward = 5000;
            } else if (i == 6) {
                System.out.println("Which keyword is used to implement an interface?");
                System.out.println("1) extends  2) implements  3) interface  4) inherit");
                correctanswer = 2; reward = 6000;
            } else if (i == 7) {
                System.out.println("Which keyword is used to create a constant variable?");
                System.out.println("1) static  2) const  3) final  4) constant");
                correctanswer = 3; reward = 7000;
            } else if (i == 8) {
                System.out.println("Which data type is used to store true or false?");
                System.out.println("1) int  2) boolean  3) char  4) String");
                correctanswer = 2; reward = 8000;
            } else if (i == 9) {
                System.out.println("Which operator is used to compare two values?");
                System.out.println("1) =  2) +  3) ==  4) !");
                correctanswer = 3; reward = 9000;
            } else {
                System.out.println("Which keyword is used to stop a loop?");
                System.out.println("1) stop  2) exit  3) break  4) end");
                correctanswer = 3; reward = 10000;
            }
            if (i <= 6)
                System.out.println("5) Use Lifeline");
            System.out.print("Enter your choice: ");
            int userAnswer = scanner.nextInt();
            // Lifeline
            if (userAnswer == 5 && i <= 6) {
                System.out.println("========== LIFELINES ==========");
                if (audiencePollUsed == 0)
                    System.out.println("1) Audience Poll");
                if (fiftyFiftyUsed == 0)
                    System.out.println("2) 50-50");
                if (audiencePollUsed == 1 && fiftyFiftyUsed == 1) {

                    System.out.println("No lifelines available!");

                } else {

                    System.out.print("Choose Lifeline: ");
                    int choice = scanner.nextInt();

                    if (choice == 1 && audiencePollUsed == 0) {

                        audiencePollUsed = 1;
                        System.out.println("========== AUDIENCE POLL ==========");

                        if (correctanswer == 1)
                            System.out.println("1) 80%  2) 10%  3) 5%  4) 5%");
                        else if (correctanswer == 2)
                            System.out.println("1) 10%  2) 80%  3) 5%  4) 5%");
                        else if (correctanswer == 3)
                            System.out.println("1) 10%  2) 10%  3) 75%  4) 5%");
                        else
                            System.out.println("1) 5%  2) 5%  3) 10%  4) 80%");

                    } else if (choice == 2 && fiftyFiftyUsed == 0) {

                        fiftyFiftyUsed = 1;
                        System.out.println("========== 50-50 LIFELINE ==========");

                        if (correctanswer == 1 || correctanswer == 2)
                            System.out.println("1) First option  2) Second option");
                        else if (correctanswer == 3)
                            System.out.println("3) Third option  4) Fourth option");
                        else
                            System.out.println("1) First option  4) Fourth option");

                    } else {
                        System.out.println("Invalid or already used lifeline.");
                    }

                }

                System.out.print("Enter your answer: ");
                userAnswer = scanner.nextInt();
            }

            // Check Answer
            if (userAnswer == correctanswer) {

                Money = reward;
                System.out.println("CORRECT!");
                System.out.println("You earned: " + Money + " points");

                if (i == 4) {
                    guaranteedMoney = 4000;
                    System.out.println("SAFE ZONE CLEARED!");
                    System.out.println("Guaranteed Points = " + guaranteedMoney);
                }

            } else {

                System.out.println("WRONG ANSWER!");

                if (i <= 4)
                    Money = 0;
                else
                    Money = guaranteedMoney;

                break;
            }
        }

        System.out.println("==============================");
        System.out.println("GAME OVER!");
        System.out.println("===== CONGRATULATIONS =====");
        System.out.println("You completed all 10 questions!");
        System.out.println("Total Points Earned = " + Money);
        System.out.println("==============================");

        System.out.println();
    }
}
