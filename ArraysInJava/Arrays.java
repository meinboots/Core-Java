package ArraysInJava;

import java.lang.reflect.Array;

public class Arrays {
    public static void main(String[] args) {
        //What is an array?
        //An array is a collection of items of same data type stored at contiguous memory locations.

        //Question:- Create a data type to store a roll number
        //int rollNumber = 10; // ==> we will take reference from here

        //Question:- Create a data type to store a Name
        //String name = "Kevin";

        //Question:- Create a data type to store 5 rollNumbers
//    int rollNumber1 = 10;
//    int rollNumber2 = 10;
//    int rollNumber3 = 10;
//    int rollNumber4 = 10;
//    int rollNumber5 = 10;

        //Question:- Create a data type to store 1000 rollNumbers
        //int rollNumber1 = 10;
        //We do not repeat above line 1000 times
        //So here we will use Array

        int[] stuRollNumbers = {10,11,12,13,14}; //This method we will use when we know what to enter.
        System.out.println(stuRollNumbers[0]);

        //When we do not know what to enter
        //Take Input of 10 numbers

        //Default values are same as instance variables. For numbers, the default value is 0; for Booleans,
        // it is false; and for object references, it is null.

        int[] nums = new int[10];
        System.out.println(nums[0]);//Indexes

        String[] name = new String[5];
        System.out.println(name[0]);//Indexes

    }

}
