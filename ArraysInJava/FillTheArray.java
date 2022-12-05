package ArraysInJava;
import java.util.Arrays;

public class FillTheArray {
    //Fill an array with first even numbers then odd numbers with method

    public static void main(String[] args) {
        int [] feedArr = {12,45,75,2945,1,4,5,3,4,5,9};
        int [] result = fillArray(feedArr); // ans

        System.out.println(Arrays.toString(result));
    }

    static int[] fillArray(int[] arr ){
        //Check even
        int[] sortedArray = new int[arr.length];
        int index = 0;

        for(int i = 0; i< arr.length; i++){
            if (arr[i] % 2 == 0){
                sortedArray[index] = arr[i];
                index++;
            }
        }

        for(int i = 0; i< arr.length; i++){
            if (arr[i] % 2 != 0){
                sortedArray[index] = arr[i];
                index++;
            }
        }
        return sortedArray;
    }

}
