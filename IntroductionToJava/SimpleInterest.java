package IntroductionToJava;

import java.util.Scanner;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
//"Simple Interest = Principal x Interest Rate x Time."
public class SimpleInterest {
    public static void main(String[] args) {
        float principal;
        float time;
        float rate;
        float simpleInterest;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter principle: ");
        principal = scan.nextFloat();
        System.out.println("Please enter time: ");
        time = scan.nextFloat();
        System.out.println("Please enter rate: ");
        rate = scan.nextFloat();

        //Calculation
        simpleInterest = (principal*time*rate)/100;

        System.out.println("Simple Interest is :"+ simpleInterest);

    }
}
