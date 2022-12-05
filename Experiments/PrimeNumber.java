package Experiments;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);

        System.out.println("Please enter a number : ");
        int num = scan.nextInt();
        int counter = 0;

        for(int i = 2; i < num ; i++ ){
            if(num % i ==0){
                counter ++;
            }
        }

        if(counter == 0){
            System.out.println("Number is prime :" + num);
        }else{
            System.out.println("Number is not prime :" + num);
        }

    }


}
