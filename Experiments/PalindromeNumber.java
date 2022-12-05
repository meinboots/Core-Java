package Experiments;

import java.util.Arrays;

public class PalindromeNumber {
    public static void main(String[] args) {
        String str = "Yogesh";
        boolean ans = palindromeString(str);
        System.out.println(ans);
    }

    static Boolean palindromeString(String str){

        // Creating array of string length
        char[] arr = new char[str.length()];

        // Copy character by character into array
        for(int i =0; i< str.length(); i++){
            arr[i] = str.charAt(i);
        }
        //Reversing the array
        char[] revarr = new char[str.length()];
        for(int j = str.length()-1; j >= 0; j--){
            revarr[j] = str.charAt(j);
        }

        if (Arrays.equals(arr, revarr)){
            return true;
        }

        return false;
    }
}
