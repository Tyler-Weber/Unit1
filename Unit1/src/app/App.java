package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Secret Password");
        String code = "We have the best football team in the state";
        String password = input.nextLine();

        if (password.equals("stmaknights")) {
            System.out.println(code);
        } else {
            System.out.println("Incorrect, 2 Attempts Left");

            input.nextLine();
            if (password.equals("stmaknights")) {
                System.out.println(code);
            } else {
                System.out.println("Incorrect, 1 Attempts Left");

                input.nextLine();
                if (password.equals("stmaknights")) {
                    System.out.println(code);
                } else {
                    System.out.println("Incorrect, 0 Attempts Left");

                }

            }

        }

    }

}
