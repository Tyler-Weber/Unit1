package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Did the Twins win the series?");
        String correctAnswer1 = "no";
        String answer1 = input.nextLine();

        if (answer1.equals(correctAnswer1))
            System.out.println("Correct!");
        else {
            System.out.println("Wrong");
        }

        System.out.println("Who is the Vikings Quarterback?");
        String correctAnswer2 = "Kirk Cousins";
        String answer2 = input.nextLine();

        if (answer2.equals(correctAnswer2))
            System.out.println("Correct");
        else {
            System.out.println("Wrong");
        }
    System.out.println("What is our school mascot?");
        String correctAnswer3 = "Knight";
        String answer3 = input.nextLine();

        if (answer3.equals(correctAnswer3))
            System.out.println("Correct!");
        else {
            System.out.println("Wrong");
        }
System.out.println("When were STMA schools founded?");
        String correctAnswer4 = "1969";
        String answer4 = input.nextLine();

        if (answer4.equals(correctAnswer4))
            System.out.println("Correct!");
        else {
            System.out.println("Wrong");
        }
System.out.println("What is the Intro to Programming teacher's last name?");
        String correctAnswer5 = "Osowski";
        String answer5 = input.nextLine();

        if (answer5.equals(correctAnswer5))
            System.out.println("Correct!");
        else {
            System.out.println("Wrong");
        }

}}