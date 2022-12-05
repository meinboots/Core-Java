package Recursion;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class FindChar {
    public static void main(String[] args) {
        String name = "Sohel";
        char target = 'y';

        Boolean ans = findInString(name , target);
        System.out.println(ans);

    }

    static Boolean findInString(String name , char target){
        for (int i = 0; i < name.length(); i++){
            if (name.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
}
