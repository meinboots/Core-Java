package IntroductionToJava;
import java.util.Scanner;

//Take name as input and print a greeting message for that particular name.



public class Greetings {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your good name : ");
        String name = scan.next();
        System.out.println("Hello " + name + "," + " How are you?");
    }
}
