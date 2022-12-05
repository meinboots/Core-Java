package IntroductionToJava;

import java.util.Scanner;

//Input currency in rupees and output in USD.
public class CurrencyConverter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the currency in Rupees : ");
        float rupees = scan.nextFloat();
        float res = converter(rupees);
        System.out.println("Your currency in dollar is: " + res + " Original was in Rupees: "+ rupees);
    }

    static float converter(float rupees){
        float dollar = 80.50f;
        float ans  = rupees * dollar;
        return ans;
    }
}
