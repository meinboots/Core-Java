package IntroductionToJava;

//Take 2 numbers as input and print the largest number.

public class LargestNumber {
    public static void main(String[] args) {
        int firstNum = 500;
        int secondNum = 1500;
        int largestNum = 0;
        largestNum = largestNum(firstNum, secondNum);
        System.out.println(largestNum);
    }

    static int largestNum(int a, int b){

       if(a>b){
           return a;
       }
        return b;
    }
}
