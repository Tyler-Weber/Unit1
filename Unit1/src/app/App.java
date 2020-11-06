package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        firstName();
        middleName();
        lastName();
        isCool("Tyler");
        tenGenerator(0);
        add(33, 37);
        multiply(3, 66, 252, 355);
    }

    public static void firstName() {

        System.out.println("Tyler");

    }

    public static void middleName() {
        System.out.println("Daniel");
    }

    public static void lastName() {
        System.out.println("Weber");
    }

    public static void isCool(String name) {
        System.out.println(name + " is cool");
    }

    public static void tenGenerator(int ten) {
        System.out.println("Greater than 10?");
        if (ten > 10) {
            System.out.println(ten + " is greater than 10.");
        } else {
            System.out.println(ten + " is less than 10.");
        }
    }
    public static void add(int num1, int num2){
        System.out.println(num1 + num2);

    }
    public static void multiply(int num1, int num2, int num3, int num4){
        System.out.println(num1 * num2 * num3 * num4);
    }
}
