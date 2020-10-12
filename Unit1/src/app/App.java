package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int targetNumber = 7;
        boolean isFinished = false;

        while (isFinished == false) {
            System.out.println("Guess a number between 0 and 100");
            int guess = input.nextInt();
            input.nextLine();
            if (guess == targetNumber) {
                System.out.println("Correct!");
                isFinished = true;
            } else {
                if (guess > targetNumber) {
                    System.out.println("Lower");
                } else {
                    System.out.println("Higher");
                }
            }
        }

    }
}