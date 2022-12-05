package Experiments;

import java.util.Arrays;

public class ArraysMethod {
    public static void main(String[] args) {

//defining array to compare
                char[] array1 = new char[] {'a', 'b', 'c', 'd', 'e'};
                char[] array2 = new char[] {'a', 'b', 'c', 'd', 'e'};
//comparing two arrays using equals() method
                if (Arrays.equals(array1, array2))
                    System.out.println("Arrays are equal.");
                else
                    System.out.println("Arrays are not equal.");
            }
        }
