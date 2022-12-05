package IntroductionToJava;

//To calculate Fibonacci Series up to n numbers.
public class FibonacciSeries {
    public static void main(String[] args) {
        int num = 5;
        int firstNum = 0;
        int secNum = 1;
        int next;

        for (int i = 0; i<=num ; i++){
            next = firstNum + secNum;
            System.out.println(next);
            firstNum = secNum;
            secNum = next;
        }

    }
}
