package IntroductionToJava;
// Write a program to print whether a number is even or odd, also take input from the user.
//A number that is divisible by 2 and generates a remainder of 0 is called an even number.
// All the numbers ending with 0, 2, 4, 6, and 8 are even numbers. On the other hand,
// number that is not divisible by 2 and generates a remainder of 1 is called an odd number.

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int Number = scan.nextInt();
        String Res = isEven(Number);
        System.out.println("Your Number is: " + Res);
    }
    static String isEven(int num){
        if(num % 2 == 0){
            return "Even";
        }
        return "Odd";
    }

}
