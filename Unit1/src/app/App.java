package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
    System.out.println("Even Number Generator");
    System.out.println("Please type in a number");
    int number1 = input.nextInt();
    System.out.println("Please enter a Higher number");
    int number2 = input.nextInt();
    for(int i = number1; i < number2; i++) {

        if( i % 2 == 0) {
            System.out.println(i);
        }


    }




    }}