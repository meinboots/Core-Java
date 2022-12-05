package Experiments;

import java.util.Arrays;

//Fill an array first with even numbers & then odd numbers.
public class FillArrayEvenAndOdd {
    public static void main(String[] args) {

        //Given array {2,5,3,5,6,3,5,88,76,5,6,8,9,9}
        //Resultant array {2,6,88,76,6,8..Rest odd numbers}

        int[] arr = {1,2,3,4,5,6,7,8,9,0,-4,-5,-6,-4,-3};
        //int[] res = fillArray(arr);
        //Enhanced for loop method
        int[] res = fillArrayEnhanced(arr);
        System.out.println(Arrays.toString(res));

    }

    static int[] fillArray(int[] arr){
        int [] finalArr = new int[arr.length];
        int indexCounter = 0;
        for (int i = 0; i< arr.length; i++){
            if (arr[i] % 2 == 0){
                finalArr[indexCounter] = arr[i];
                indexCounter++;
            }
        }

        for (int i = 0; i< arr.length; i++){
            if (arr[i] % 2 != 0){
                finalArr[indexCounter] = arr[i];
                indexCounter++;
            }
        }
        return finalArr;
    }

    //with Enhanced for loop :
    static int[] fillArrayEnhanced(int[] arr){
        int [] finalArr = new int[arr.length];
        int indexCounter = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                finalArr[indexCounter] = j;
                indexCounter++;
            }
        }

        for (int j : arr) {
            if (j % 2 != 0) {
                finalArr[indexCounter] = j;
                indexCounter++;
            }
        }
        return finalArr;
    }


}

