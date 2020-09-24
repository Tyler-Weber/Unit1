package app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
Scanner input = new Scanner(System.in);
System.out.println("Please Print Your First Name.");
String firstName = input.nextLine();
System.out.println("Please Print Your Last Name.");
String lastName = input.nextLine();
System.out.println("Please Print Your Age.");
String age = input.nextLine();
System.out.println("Please Print Your Grade.");
String grade = input.nextLine();
System.out.println("Please Print Your Favorite Color.");
String color = input.nextLine();
System.out.println("Hello " + firstName + " " + lastName + ", you're " + age + " and in " + grade + " grade." + " Also, your favorite color is " + color + "."); }}