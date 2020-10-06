package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Penguin Fun Facts! Type WHOLE #s 1-5 to Learn!");
        String factOne = "1";
        String factTwo = "2";
        String factThree = "3";
        String factFour = "4";
        String factFive = "5";
        String number = input.nextLine();
        if (number.equals(factOne))
            System.out.println("Penguins are flightless birds.");

        else {System.out.println("Error");}

        if (number.equals(factTwo))
            System.out.println("Penguins can stay underwater for up to 20 minutes at a time.");

        else {System.out.println("Error");}

        if (number.equals(factThree))
            System.out.println("Penguins don't have teeth.");

        else {System.out.println("Error");}

        if (number.equals(factFour))
            System.out.println("Penguins can drink sea water.");
        
        else {System.out.println("Error");}

        if (number.equals(factFive))
            System.out.println("Most Penguins live in the southern hemisphere.");
        
        else {System.out.println("Error");}
    }
}