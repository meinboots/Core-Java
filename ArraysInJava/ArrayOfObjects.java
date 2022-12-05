package ArraysInJava;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;

public class ArrayOfObjects {
    public static void main(String[] args) {

        Scanner in =  new Scanner(System.in);
        // array of objects
        String[] str = new String[6];
        System.out.print("Enter the values : ");
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

    }
}
