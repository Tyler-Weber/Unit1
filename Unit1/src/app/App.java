package app;

public class App {
    public static void main(String[] args) throws Exception {
int count = 0;
String color = "Purple";
boolean friday = false;

while (count <= 1000) {
    System.out.println("The count is " + count);
    count = count + 1;  }

System.out.println("Count Finished");

while (color == "Purple"){
    System.out.println("The color is " + color);
    color = "Red";   }

System.out.println("Color Finished");

 while (friday == false){
    System.out.println("Is today Thursday? " + false);
    friday = true;
    System.out.println("Day Check Finished");  }
}}