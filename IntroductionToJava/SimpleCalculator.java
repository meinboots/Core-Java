package IntroductionToJava;

import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class SimpleCalculator {

    public static void main(String[] args) {
        int firstNum;
        int secondNum;
        char symbol;
        int res = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number :");
        firstNum = scan.nextInt();
        System.out.println("Please enter another number :");
        secondNum = scan.nextInt();
        System.out.println("Please choose an symbol (+, -, *, /) :");
        symbol = scan.next().charAt(0);

        if(symbol == '+'){
            res= firstNum + secondNum;
        } else if (symbol == '-') {
            res= firstNum - secondNum;
        } else if (symbol == '*') {
            res= firstNum * secondNum;
        } else if (symbol == '/') {
            res= firstNum / secondNum;
        } else {
            System.out.println("Incorrect data provided !");
        }

        System.out.println("Your answer is: " + res + " & Selected Operator was: " + "(" +symbol + ")");
    }
}
