package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Temperature in F");
        int temp = input.nextInt();
        if (temp > 32) {
            System.out.println("The Temperature is Above Freezing");
        } else {
            System.out.println("The Temperature is Freezing");
        }

    }
}