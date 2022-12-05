package StringsInJava;
import ArraysInJava.Arrays;

public class PalindromeString {
    public static void main(String[] args) {
        Boolean num = palindrome("madam");
        System.out.println(num);
    }

    static Boolean palindrome(String str){
        for (int i = 0; i <= str.length()/2; i++){
            int start = str.charAt(0);
            int end = str.charAt(str.length()-1 -i);
            if(start != end){
                return false;
            }
        }

        return true;
    }
}
