package Experiments;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int ans = 0;
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Please input a operator: ");
            char op = scan.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter two numbers: ");

                int num1 = scan.nextInt();
                int num2 = scan.nextInt();
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("You can not divide by Zero(0)");
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }

            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid Operator");
            }
            System.out.println("Your answer is: " + ans);
            ans = 0;
        }

    } // While loop
}